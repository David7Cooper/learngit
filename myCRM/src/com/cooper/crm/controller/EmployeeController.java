package com.cooper.crm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.cooper.crm.bean.Department;
import com.cooper.crm.bean.Employee;
import com.cooper.crm.bean.JobInfo;
import com.cooper.crm.bean.ResetPass;
import com.cooper.crm.service.DepartmentService;
import com.cooper.crm.service.EmployeeService;
import com.cooper.crm.service.JobInfoService;
import com.cooper.crm.service.ResetPassService;

@Controller
public class EmployeeController {
	@Resource(name = "employeeService")
	private EmployeeService employeeService;
	@Resource(name="departmentService")
	private DepartmentService departmentService;
	@Resource(name="jobInfoService")
	private JobInfoService jobInfoService;
	@Resource(name="resetPassService")
	private ResetPassService resetPassService;
	/**
	 * 查（登录）
	 */
	@RequestMapping(value="login.do")
	public void selectAll(Model model,Employee e,HttpServletRequest request,HttpServletResponse response) throws IOException {
		List<Employee> list = employeeService.selectAll();
		String s = "0";
		for(Employee ee : list) {
			if(ee.getUsername().equals(e.getUsername()) && ee.getPass().equals(e.getPass())) {
				s = "1";
				request.getSession().setAttribute("user", ee);
				System.out.println(ee.getJobInfo().getJob());
				request.getSession().setAttribute("rights", ee.getJobInfo().getRights());
				break;
			}
		}
		/*model.addAttribute("data",s);*/
		response.getWriter().write(s);
		/*return "login.jsp";*/
	}
	/**
	 * 改（人物基本信息）
	 */
	@RequestMapping(value="updateUser.do")
	public void updateUser(Employee e,HttpServletRequest request,HttpServletResponse response) throws IOException {
		employeeService.updateUser(e);
		response.getWriter().write("1");
	}
	/**
	 * 改（密码）
	 */
	@RequestMapping(value="changePass.do")
	public void changePass(String employeeId,String pass,String newPass,HttpServletRequest request,HttpServletResponse response) throws IOException {
		List<Employee> list = employeeService.selectAll();
		String s = "0";
		for(Employee ee : list) {
			if(ee.getId()==Integer.valueOf(employeeId) && ee.getPass().equals(pass)) {
				s = "1";
				Employee employee = new Employee();
				employee.setId(Integer.valueOf(employeeId));
				employee.setPass(newPass);
				this.employeeService.updatePass(employee);
			}
		}
		response.getWriter().write(s);
	}
	/**
	 * 退出登录
	 */
	@RequestMapping(value="logout.do")
	public String logout() {
		 return "login.jsp";
	}
	/**
	 * （新增管理员）
	 * @throws IOException 
	 */
	@RequestMapping(value="addUser.do")
	public void addUser(Employee employee,HttpServletRequest request,HttpServletResponse response) throws IOException {
		/*获取当前登录的管理员*/
		Employee e = (Employee) request.getSession().getAttribute("user");
		if(e.getJobInfoId()==1) {
			/*超级管理员*/
			employee.setPass("123");
			employee.setNickname("默认");
			employee.setJobInfoId(2);
			employee.setDepartmentId(1);
			employee.setWorkStatu("1");
			this.employeeService.addUser(employee);
		}else if(e.getJobInfoId()==2) {
			/*管理员*/
			employee.setPass("123");
			employee.setNickname("默认");
			employee.setWorkStatu("1");
			this.employeeService.addUser(employee);
		}
		/*返回前端*/
		response.getWriter().write("1");
	}
	@RequestMapping(value="checkUsername.do")
	public void checkUsername(HttpServletResponse response) throws IOException {
		response.getWriter().write("true");
	}
	@RequestMapping(value="getDepartment.do")
	public void getDepartment(HttpServletResponse response) throws IOException {
		/*查询所有department表*/
		List<Department> list = this.departmentService.selectAll();
		/*JSON返回*/
		String json = JSON.toJSONString(list);
		response.getWriter().write(json);
	}
	@RequestMapping(value="getJobByDid.do")
	public void getJobByDid(JobInfo j,HttpServletResponse response) throws IOException {
		List<JobInfo> list = this.jobInfoService.selectByDepartment(j);
		String json = JSON.toJSONString(list);
		response.getWriter().write(json);
	}
	/**
	 * (注销员工账号)
	 * @throws IOException 
	 */
	@RequestMapping(value="cancleUser.do")
	public void cancleUser(Employee employee,HttpServletResponse response) throws IOException {
		String data = "";
		List<Employee> list = employeeService.selectAll();
		for(Employee e : list) {
			if(e.getUsername().equals(employee.getUsername())) {
				if(e.getWorkStatu().equals("0")) {
					data = "2";
				}else {
					data = "1";
					e.setWorkStatu("0");
					System.out.println(e.toString());
					this.employeeService.cancleUser(e);
					break;
				}
			}else {
				data = "0";
			}
		}
		response.getWriter().write(data);
	}
	/**
	 * 重置密码
	 */
	@RequestMapping(value="querRestRequest.do")
	public void querRestRequest(HttpServletRequest request,HttpServletResponse response) {
		/*确认当前登录的Employee*/
		List<ResetPass> list = resetPassService.selectAll();
		/*Response返回前端*/
		String json = JSON.toJSONString(list);
		try {
			response.getWriter().write(json);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
}
