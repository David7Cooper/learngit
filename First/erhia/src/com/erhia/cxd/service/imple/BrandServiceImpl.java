package com.erhia.cxd.service.imple;

import java.util.List;

import com.erhia.cxd.bean.Brand;
import com.erhia.cxd.dao.IBrandDao;
import com.erhia.cxd.dao.imple.BrandDaoImpl;
import com.erhia.cxd.service.IBrandService;

public class BrandServiceImpl implements IBrandService{
	IBrandDao ibd = new BrandDaoImpl();
	/**
	 * 管理员
	 * 添加汽车
	 */
	@Override
	public List<Brand> queryAll() {
		// TODO Auto-generated method stub
		return ibd.queryAll();
	}

}
