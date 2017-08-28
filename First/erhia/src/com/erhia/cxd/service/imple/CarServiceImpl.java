package com.erhia.cxd.service.imple;

import java.util.ArrayList;
import java.util.List;
import com.erhia.cxd.bean.Car;
import com.erhia.cxd.dao.ICarDao;
import com.erhia.cxd.dao.imple.CarDaoImpl;
import com.erhia.cxd.service.ICarService;

public class CarServiceImpl implements ICarService{
	ICarDao icd = new CarDaoImpl();
	List<Car> list = null;
//	IBrandDao ibd = new BrandDaoImpl();
//	ICategoryDao icgd = new CategoryDaoImpl();
	/**
	 * 普通用户登录后的界面
	 * @return
	 */
	@Override
	public List<Car> queryAll() {
		// TODO Auto-generated method stub
		
		return icd.queryAll();
	}
	/**
	 * 管理员
	 * 按照汽车编号查看
	 */
	public List<Car> queryByCarId(int carId){
		list = new ArrayList<>();
		for(Car car : queryAll()){
			if(car.getId()==carId){
				list.add(car);
			}
		}
		return list;
	}
	/**
	 * 根据价格降序
	 * @return
	 */
	@Override
	public List<Car> queryAllByDes() {
		// TODO Auto-generated method stub
		return icd.queryAllByDes();
	}
	/**
	 * 根据价格升序
	 * @return
	 */
	@Override
	public List<Car> queryAllByAsc() {
		// TODO Auto-generated method stub
		return icd.queryAllByAsc();
	}
	/**
	 * 按类别查看汽车
	 */
	@Override
	public List<Car> queryByCategory(String kind) {
		// TODO Auto-generated method stub
		list = new ArrayList<>();
		for(Car car : icd.queryAll()){
			if(car.getCategory().getName().equals(kind)){
				list.add(car);
			}
		}
		return list;
	}
	/**
	 * 按品牌查看汽车
	 */
	@Override
	public List<Car> queryByBrand(String brand) {
		// TODO Auto-generated method stub
		list = new ArrayList<>();
		for(Car car : icd.queryAll()){
			if(car.getBrand().getName().equals(brand)){
				list.add(car);
			}
		}
		return list;
	}
	/**
	 * 管理员
	 * 添加汽车
	 */
	@Override
	public String addCar(Car car) {
		// TODO Auto-generated method stub
		int n = icd.addCar(car);
		if(n==1){
			return "汽车信息添加成功!!!";
		}else{
			return "汽车信息添加失败！！！";
		}
	}
	/**
	 * 管理员
	 * 修改汽车信息
	 */
	@Override
	public String updateCar(Car car) {
		// TODO Auto-generated method stub
		int n = icd.updateCar(car);
		if(n==1){
			return "汽车信息修改成功!!!";
		}else{
			return "汽车信息修改失败！！！";
		}
	}
	/**
	 * End
	 */
}
