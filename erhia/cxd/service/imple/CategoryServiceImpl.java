package com.erhia.cxd.service.imple;

import java.util.List;

import com.erhia.cxd.bean.Category;
import com.erhia.cxd.dao.ICategoryDao;
import com.erhia.cxd.dao.imple.CategoryDaoImpl;
import com.erhia.cxd.service.ICategoryService;

public class CategoryServiceImpl implements ICategoryService{
	ICategoryDao icd = new CategoryDaoImpl();
	/**
	 * 管理员
	 * 添加汽车
	 */
	@Override
	public List<Category> queryAll() {
		// TODO Auto-generated method stub
		
		return icd.queryAll();
	}
	
}
