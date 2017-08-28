package com.erhia.cxd.view;

import com.erhia.cxd.bean.Brand;
import com.erhia.cxd.bean.Car;
import com.erhia.cxd.bean.Category;
import com.erhia.cxd.bean.Record;
import com.erhia.cxd.service.IBrandService;
import com.erhia.cxd.service.ICarService;
import com.erhia.cxd.service.ICategoryService;
import com.erhia.cxd.service.IRecordService;
import com.erhia.cxd.service.imple.BrandServiceImpl;
import com.erhia.cxd.service.imple.CarServiceImpl;
import com.erhia.cxd.service.imple.CategoryServiceImpl;
import com.erhia.cxd.service.imple.RecordServiceImpl;
import com.erhia.cxd.util.SCUtil;
/**
 * 管理员
 */
public class AdministrationUserView {
	ICarService ics = new CarServiceImpl();
	IRecordService irs = new RecordServiceImpl();
	IBrandService ibs = new BrandServiceImpl();
	ICategoryService icts = new CategoryServiceImpl();
	/**
	 * 管理员主界面
	 */
	public void main(){
		boolean b = true;
		while(b){
				System.out.println("输入0退出");
				System.out.println("输入1，查询全部汽车信息");
				System.out.println("输入2按照指定编号查看汽车");
				System.out.println("输入3添加汽车信息");
				System.out.println("输入4修改汽车信息");
				System.out.println("输入5查看所有用户的租赁记录");
				System.out.println("输入6查看指定用户的租车记录");
				System.out.println("输入7查看指定汽车的租赁记录");
				switch(SCUtil.getScanner().next()){
				case "0" :
					b = false;
					break;
				case "1" :
					queryAll();
					break;
				case "2" :
					queryByCarId();
					break;
				case "3" :
					addCar();
					break;
				case "4" :
					updateCar();
					break;
				case "5" :
					queryRecordAll();
					break;
				case "6" :
					queryRecordByName();
					break;
				case "7" :
					queryRecordByCar();
					break;
				default :
					System.out.println("命令无效，请输入正确命令！！！");
				}
			}				
	}
	/**
	 * 查询全部
	 */
	public void queryAll(){
		System.out.println("===============================================================");
		System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t是否上架");
		for(Car car : ics.queryAll()){
			System.out.println(car.toString());
		}
	}
	/**
	 * 按照指定编号查看汽车
	 */
	public void queryByCarId(){
		System.out.println("请输入汽车的编号>>>");
		String n = SCUtil.getScanner().next();
		int carId = Integer.valueOf(n);
		System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t是否上架");
		for(Car car : ics.queryByCarId(carId)){
			System.out.println(car.toString());
		}
	}
	/**
	 * 查看所有用户的租赁记录
	 */
	public void queryRecordAll(){
		System.out.println("编号\t汽车编号\t汽车名称\t备注\t品牌\t类型\t金额\t车牌号\t\t租用者\t\t开始租\t\t结束租\t\t每日租金\t总租金");
		for(Record record : irs.queryRecordAll()){
			System.out.println(record.toString());
		}
	}
	/**
	 * 查看指定用户的租车记录
	 */
	public void queryRecordByName(){
		System.out.println("请输入指定用户的姓名>>>");
		String name = SCUtil.getScanner().next();
		System.out.println("编号\t汽车编号\t汽车名称\t备注\t品牌\t类型\t金额\t车牌号\t\t租用者\t\t开始租\t\t结束租\t\t每日租金\t总租金");
		for(Record record : irs.queryRecordByName(name)){
			System.out.println(record.toString());
		}
	}
	/**
	 * 查看指定汽车（brand）租赁记录
	 */
	public void queryRecordByCar(){
		System.out.println("请输入指定汽车的租赁记录>>>");
		String carName = SCUtil.getScanner().next();
		System.out.println("编号\t汽车编号\t汽车名称\t备注\t品牌\t类型\t金额\t车牌号\t\t租用者\t\t开始租\t\t结束租\t\t每日租金\t总租金");
		for(Record record : irs.queryRecordByCar(carName)){
			System.out.println(record.toString());
		}
	}
	/**
	 * 添加汽车
	 */
	public void addCar(){
		System.out.println("请输入添加的汽车的信息>>>");
		System.out.println("车牌号>>>");
		String carNumber = SCUtil.getScanner().next();
		System.out.println("车品牌>>>");
		for(Brand brand : ibs.queryAll()){
			System.out.println(brand.getId()+"\t"+brand.getName());
		}
		String brandId = SCUtil.getScanner().next();
		System.out.println("车模式>>>");
		String model = SCUtil.getScanner().next();
		System.out.println("车颜色>>>");
		String color = SCUtil.getScanner().next();
		System.out.println("车类型>>>");
		for(Category category : icts.queryAll()){
			System.out.println(category.getId()+"\t"+category.getName());
		}
		String categoryId = SCUtil.getScanner().next();
		System.out.println("车备注>>>");
		String comments = SCUtil.getScanner().next();
		System.out.println("价格>>>");
		String price = SCUtil.getScanner().next();
		System.out.println("每日租金>>>");
		String rent = SCUtil.getScanner().next();
		System.out.println("是否可租（0可租，1不可租）>>>");
		String status = SCUtil.getScanner().next();
		System.out.println("是否上架（0上架，1不上架）>>>");
		String useable = SCUtil.getScanner().next();
		String str = ics.addCar(new Car(
					0, carNumber,
					Integer.valueOf(brandId),
					model,
					color,
					Integer.valueOf(categoryId),
					comments,
					Integer.valueOf(price),
					Integer.valueOf(rent),
					Integer.valueOf(status),
					Integer.valueOf(useable))
					);
		System.out.println(str);
	}
	/**
	 * 修改汽车信息
	 */
	public void updateCar(){
		this.queryAll();
		System.out.println("请输入你要修改汽车的编号>>>");
		String id = SCUtil.getScanner().next();
		System.out.println("请输入要修改汽车的信息>>>");
		System.out.println("车牌号>>>");
		String carNumber = SCUtil.getScanner().next();
		System.out.println("车品牌>>>");
		for(Brand brand : ibs.queryAll()){
			System.out.println(brand.getId()+"\t"+brand.getName());
		}
		String brandId = SCUtil.getScanner().next();
		System.out.println("车模式>>>");
		String model = SCUtil.getScanner().next();
		System.out.println("车颜色>>>");
		String color = SCUtil.getScanner().next();
		System.out.println("车类型>>>");
		for(Category category : icts.queryAll()){
			System.out.println(category.getId()+"\t"+category.getName());
		}
		String categoryId = SCUtil.getScanner().next();
		System.out.println("车备注>>>");
		String comments = SCUtil.getScanner().next();
		System.out.println("价格>>>");
		String price = SCUtil.getScanner().next();
		System.out.println("每日租金>>>");
		String rent = SCUtil.getScanner().next();
		System.out.println("是否可租（0可租，1不可租）>>>");
		String status = SCUtil.getScanner().next();
		System.out.println("是否上架（0上架，1不上架）>>>");
		String useable = SCUtil.getScanner().next();
		String str = ics.updateCar(new Car(
					Integer.valueOf(id), 
					carNumber,
					Integer.valueOf(brandId),
					model,
					color,
					Integer.valueOf(categoryId),
					comments,
					Integer.valueOf(price),
					Integer.valueOf(rent),
					Integer.valueOf(status),
					Integer.valueOf(useable))
					);
		System.out.println(str);
	}
	/**
	 * End
	 */
}

