package com.cooper.crm.dao;

import java.util.List;

import com.cooper.crm.bean.Custom;
import com.cooper.crm.bean.Employee;

public interface CustomDao {
	/**
	 * 查（查询全部）
	 */
	List<Custom> selectAll();
	/**
	 * 改（保存修改）
	 */
	void updateCustom(Custom custom);
	/**
	 * 分页
	 */
	void page1(Custom custom,int start,int limit);
	
}
