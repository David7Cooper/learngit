package com.cooper.crm.service;

import java.util.List;

import com.cooper.crm.bean.Employee;

public interface EmployeeService {
	/**
	 * 查（查询全部）
	 */
	List<Employee> selectAll();
}
