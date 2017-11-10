package com.cooper.crm.service;

import java.util.List;

import com.cooper.crm.bean.Department;

public interface DepartmentService {
	/**
	 * 查（查询所用）
	 */
	List<Department> selectAll();
}
