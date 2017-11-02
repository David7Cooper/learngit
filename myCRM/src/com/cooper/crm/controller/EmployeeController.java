package com.cooper.crm.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cooper.crm.bean.Employee;
import com.cooper.crm.service.EmployeeService;
import com.cooper.crm.service.JobInfoService;

@Controller
public class EmployeeController {
	@Resource(name = "employeeService")
	private EmployeeService employeeService;
	
	@RequestMapping(value="login.do")
	public void selectAll(Model model,Employee e,HttpServletRequest request,HttpServletResponse response) throws IOException {
		List<Employee> list = employeeService.selectAll();
		System.out.println(e.getUsername()+","+e.getPass());
		String s = "0";
		
		for(Employee ee : list) {
			if(ee.getUsername().equals(e.getUsername()) && ee.getPass().equals(e.getPass())) {
				s = "1";
				request.getSession().setAttribute("user", ee);
				System.out.println(ee.getJobInfo().getJob());
//				request.getSession().setAttribute("rights", ee.getNickname());
				break;
			}else {
				System.out.println(ee.getUsername());
			}
		}
//		model.addAttribute("data",s);
		response.getWriter().write(s);
//		return "login.jsp";
	}
}
