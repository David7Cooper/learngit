package com.erhia.cxd.view;
import com.erhia.cxd.bean.Car;
import com.erhia.cxd.bean.Record;
import com.erhia.cxd.service.ICarService;
import com.erhia.cxd.service.IRecordService;
import com.erhia.cxd.service.imple.CarServiceImpl;
import com.erhia.cxd.service.imple.RecordServiceImpl;
import com.erhia.cxd.util.SCUtil;
/**
 * 普通用户
 * @author cxd
 * @para
 */
public class OrdinaryUserView {
	ICarService ics = new CarServiceImpl();
	IRecordService irs = new RecordServiceImpl();
	/**
	 * 使用对象初始化语句块，让程序第一次执行时打印汽车的全部信息
	 */
	{
		System.out.println("===============================================================");
		System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t是否上架");
		for(Car car : ics.queryAll()){
			System.out.println(car.toString());
		}
	}
	/**
	 * 用户主界面
	 */
	public void main(){
		boolean b = true;
		while(b){
				System.out.println("输入0退出");
				System.out.println("输入1按价格降序排序");
				System.out.println("输入2按价格升序排序");
				System.out.println("输入3按类型搜索");
				System.out.println("输入4按品牌搜索");
				System.out.println("输入5查看所有汽车");
				System.out.println("输入6看看我的租车记录");
				System.out.println("输入7租车");
				System.out.println("输入8还车");
				switch(SCUtil.getScanner().next()){
				case "0" :
					/**
					 * 可以直接退出总程序
					 * System.exit(0);
					 */
					b = false;
					break;
				case "1" :
					des();
					break;
				case "2" :
					asc();
					break;
				case "3" :
					this.queryKind();
					break;
				case "4" :
					this.queryBrand();
					break;
				case "5" :
					queryAll();
					break;
				case "6" :
					queryRecordByMe();
					break;
				case "7" :
					rentCar();
					break;
				case "8" :
					backCar();
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
	 * 降序
	 */
	public void des(){
		System.out.println("===============================================================");
		System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t是否上架");
		for(Car car : ics.queryAllByDes()){
			System.out.println(car.toString());
		}
	}
	/**
	 * 升序
	 */
	public void asc(){
		System.out.println("===============================================================");
		System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t是否上架");
		for(Car car : ics.queryAllByAsc()){
			System.out.println(car.toString());
		}
	}
	/**
	 * 按照类别（如舒适型 ）查看汽车
	 */
	public void queryKind(){
		System.out.println("请输入汽车的类型>>>");
		String kind = SCUtil.getScanner().next();
		System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t是否上架");
		for(Car car : ics.queryByCategory(kind)){
			System.out.println(car.toString());
		}
	}
	/**
	 *按照品牌（如大众）查看汽车
	 */
	public void queryBrand(){
		System.out.println("请输入汽车的品牌>>>");
		String brand = SCUtil.getScanner().next();
		System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租\t是否上架");
		for(Car car : ics.queryByBrand(brand)){
			System.out.println(car.toString());
		}
	}
	/**
	 * 查看自己的租车记录
	 */
	public void queryRecordByMe(){
		System.out.println("编号\t汽车编号\t汽车名称\t备注\t品牌\t类型\t金额\t车牌号\t\t租用者\t\t开始租\t\t结束租\t\t每日租金\t总租金");
		for(Record record : irs.queryAll()){
			System.out.println(record.toString());
		}
	}
	/**
	 * 租车
	 */
	public void rentCar(){
		System.out.println("请输入你要租赁汽车的编号>>>");
		String n = SCUtil.getScanner().next();
		int carId = Integer.valueOf(n);
		System.out.println(irs.addCarRecord(carId));
	}
	/**
	 * 还车
	 */
	public void backCar(){
		for(Record record : irs.queryAllByBack()){
			System.out.println(record.toString());
		}
		System.out.println("请输入你要归还的汽车的编号>>>");
		String n = SCUtil.getScanner().next();
		int carId = Integer.valueOf(n);
		/**
		 * irs.queryAllByBack()方法返回的是（当前登录用户还没归还的租车记录）
		 * 用途：
		 * 1.你只能归还你自己租的车
		 * 2.你不可以归还你没有租的车
		 */
		String str = "错误：你只能归还自己租过的车！！！";
		for(Record record : irs.queryAllByBack()){
			if(record.getCarId()==carId){
				str = irs.addCarRecordBack(record);
			}
		}	
		System.out.println(str);
	}
	/**
	 * End
	 */
}
