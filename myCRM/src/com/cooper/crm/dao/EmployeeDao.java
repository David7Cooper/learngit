package com.cooper.crm.dao;

import java.util.List;

import com.cooper.crm.bean.Employee;

public interface EmployeeDao {
	/**
	 * 查（查询全部）
	 */
	List<Employee> selectAll();
}
