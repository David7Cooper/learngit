package com.erhia.cxd.dao;

import java.util.List;

import com.erhia.cxd.bean.Brand;
import com.erhia.cxd.bean.Car;
import com.erhia.cxd.bean.Category;

public interface ICarDao {
	/**
	 * 查询全部
	 * @return
	 */
	public abstract List<Car> queryAll();
	
	public Category queryCarByCategoryId(final int cid);
	
	public Brand queryBrandByBrandId(final int bid);
	
	/**
	 * 降序
	 */
	public abstract List<Car> queryAllByDes();
	/**
	 * 升序
	 */
	public abstract List<Car> queryAllByAsc();
	/**
	 * 管理员
	 * 添加汽车
	 */
	int addCar(Car car);
	/**
	 * 管理员
	 * 修改汽车
	 */
	int updateCar(Car car);
}
