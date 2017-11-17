package com.cooper.crm.dao;

import java.util.List;

import com.cooper.crm.bean.Rights;

public interface RightsDao {
	/**
	 * 查（查询全部）
	 */
	List<Rights> selectAll();
}
