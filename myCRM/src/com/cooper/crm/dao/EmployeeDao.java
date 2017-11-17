package com.cooper.crm.dao;

import java.util.List;

import com.cooper.crm.bean.Employee;

public interface EmployeeDao {
	/**
	 * 改（员工基本信息）
	 */
	void updateUser(Employee employee);
	/**
	 * 改（密码）
	 */
	void updatePass(Employee employee);
	/**
	 * 查（查询全部）
	 */
	List<Employee> selectAll();
	/**
	 * 增（新增管理员）
	 */
	void addUser(Employee employee);
	/**
	 * 改（注销员工账号）
	 */
	void cancleUser(Employee employee);
}
