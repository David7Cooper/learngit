package com.cooper.crm.service.imple;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cooper.crm.bean.Employee;
import com.cooper.crm.dao.EmployeeDao;
import com.cooper.crm.service.EmployeeService;
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Resource(name = "employeeDao")/*相当于返回值*/
	private EmployeeDao employeeDao;
	/**
	 * 改（基本员工信息）
	 */
	@Override
	public void updateUser(Employee employee) {
		// TODO Auto-generated method stub
		this.employeeDao.updateUser(employee);
	}
	/**
	 * 改（密码）
	 */
	@Override
	public void updatePass(Employee employee) {
		// TODO Auto-generated method stub
		this.employeeDao.updatePass(employee);
	}
	 /**
	  * 查（查询全部）
	  */
	@Override
	public List<Employee> selectAll() {
		// TODO Auto-generated method stub
		List<Employee> list = employeeDao.selectAll();
		/*验证多表连接*/
		/*int i = 1;
		for(Employee e:list) {
			System.out.println("获取  employee/department.getDname()"+e.getDepartment().getDname());
			System.out.println("获取  employee/jobInfo"+e.getJobInfo().getJob());
			System.out.println("获取  employee/jobInfo/department.getDanme()/"+e.getJobInfo().getDepartment().getDname());
			System.out.println(e.getJobInfo().getRights());
			System.out.println("++++++++++++++++++"+i++);
		}*/
		return list;
	}
	/**
	 * 增（新增管理员）
	 */
	@Override
	public void addUser(Employee employee) {
		// TODO Auto-generated method stub
		this.employeeDao.addUser(employee);
	}
	/**
	 * 改（注销员工账号）
	 */
	@Override
	public void cancleUser(Employee employee) {
		// TODO Auto-generated method stub
		this.employeeDao.cancleUser(employee);
	}
}
