package com.erhia.cxd.service.imple;

import java.util.ArrayList;
import java.util.List;
import com.erhia.cxd.bean.Record;
import com.erhia.cxd.dao.IRecordDao;
import com.erhia.cxd.dao.imple.RecordDaoImpl;
import com.erhia.cxd.service.IRecordService;
import com.erhia.cxd.util.CurrName;

public class RecordServiceImpl implements IRecordService{
	IRecordDao ird = new RecordDaoImpl();
	private List<Record> list = null;
	private List<Record> list1;
	/**
	 * 查询本人的记录
	 * @return
	 */
	@Override
	public List<Record> queryAll() {
		// TODO Auto-generated method stub
		list = new ArrayList<>();//NullPointerException
		/**
		 * ird.queryAll()方法返回的是所有用户的租车记录
		 * list集合中存放的是当前登录用户的租车记录
		 */
		for(Record record : ird.queryAll()){
			if(record.getUser().getUserName().equals(CurrName.getName())){
				list.add(record);
			}
		}
		
		return list;
	}
	/**
	 * 租车
	 */
	@Override
	public String addCarRecord(int carId) {
		// TODO Auto-generated method stub
		/*list1 = new ArrayList<>();
		for(Record record : queryAll()){
			if(record.getPayment()==0){
				list1.add(record);
			}
		}
		boolean b = true;
		for(Record record : list1){//list中此刻有值
			if(record.getCarId()==carId){
				b = false;
				break;
			}
		}
		if(b){
			ird.addCarRecord(CurrName.getId(),carId);
			return "租车成功！！！";
		}else{
			return "租车失败（同一辆车）";
		}*/
	/****************************/
		list = new ArrayList<>();
		/**
		 * ird.queryAll()为所有用户记录
		 * list集合里面存放的是所有没有还车的记录
		 * carId是你要租用汽车的编号
		 * 只要你要租用的汽车是在list集合里面b=false;
		 */
		for(Record record : ird.queryAll()){
			if(record.getPayment()==0){
				list.add(record);
			}
		}
		boolean b = true;
		for(Record record : list){
			if(record.getCarId()==carId){
				b = false;
			}
		}
		if(b){
			ird.addCarRecord(CurrName.getId(), carId);
			return "租车成功！！！";
		}else{
			return "此车以被租用！！！";
		}
	}
	/**
	 * 还车
	 * 返回需要归还的车的list
	 */
	@Override
	public List<Record> queryAllByBack() {
		// TODO Auto-generated method stub
		list1 = new ArrayList<>();
		/**
		 * queryAll()方法返回的是（当前登录用户租车记录）的集合
		 * list1集合中存放的是（当前登录用户还没归还的租车记录）
		 */
		for(Record record : queryAll()){
			if(record.getPayment()==0){
				list1.add(record);
			}
		}
		return list1;
	}
	@Override
	public String addCarRecordBack(Record record) {
		// TODO Auto-generated method stub
//		System.currentTimeMillis();
//		record.getStartDate();
//		Date date =new Date();
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy:MM:dd");
//		String backdate =sdf.format(date);
//		for(Record record1 : queryAllByBack()){
//			if(record1.getCarId()==record.getCarId()){
//				ird.addCarRecordBack(record1);
//			}
//		}
		ird.addCarRecordBack(record);
		return "还车成功！！！祝你愉快";
	}
	/**
	 * 管理员
	 * 查询所有用户的租车记录
	 */
	@Override
	public List<Record> queryRecordAll() {
		// TODO Auto-generated method stub
		return ird.queryAll();
	}
	/**
	 * 管理员
	 * 查看指定用户的租车记录
	 */
	@Override
	public List<Record> queryRecordByName(String name) {
		// TODO Auto-generated method stub
		list = new ArrayList<>();
		for(Record record : ird.queryAll()){
			if(record.getUser().getUserName().equals(name)){
				list.add(record);
			}
		}
		return list;
	}
	/**
	 * 管理员
	 * 查看指定汽车的租赁记录
	 */
	@Override
	public List<Record> queryRecordByCar(String carName) {
		// TODO Auto-generated method stub
		list = new ArrayList<>();
		for(Record record : ird.queryAll()){
			if(record.getCar().getBrand().getName().equals(carName)){
				list.add(record);
			}
		}
		return list;
	}
	/**
	 * End
	 */
}
