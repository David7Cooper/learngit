package com.erhia.cxd.dao;

import java.util.List;

import com.erhia.cxd.bean.Category;

public interface ICategoryDao {
	/**
	 * 查询全部
	 * @return
	 */
	public abstract List<Category> queryAll();
}
