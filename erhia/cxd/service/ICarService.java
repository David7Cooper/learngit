package com.erhia.cxd.service;

import java.util.List;

import com.erhia.cxd.bean.Car;

public interface ICarService {
	/**
	 * 普通用户登录后的界面
	 * @return
	 */
	public List<Car> queryAll();
	/**
	 * 根据价格降序
	 * @return
	 */
	public List<Car> queryAllByDes();
	/**
	 * 根据价格升序
	 * @return
	 */
	public List<Car> queryAllByAsc();
	/**
	 * 按类别查看汽车
	 */
	public List<Car> queryByCategory(String kind);
	/**
	 * 按品牌查看汽车
	 */
	public List<Car> queryByBrand(String brand);
	/**
	 * 管理员
	 * 按照汽车编号查看
	 */
	List<Car> queryByCarId(int carId);
	/**
	 * 管理员
	 * 添加汽车
	 */
	String addCar(Car car);
	/**
	 * 管理员
	 * 修改汽车信息
	 */
	String updateCar(Car car);
}
