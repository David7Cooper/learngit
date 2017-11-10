package com.cooper.crm.dao;

import java.util.List;

import com.cooper.crm.bean.Department;

public interface DepartmentDao {
	/**
	 * 查（查询所用）
	 */
	List<Department>  selectAll();
}
