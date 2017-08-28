package com.erhia.cxd.service;

import java.util.List;

import com.erhia.cxd.bean.Record;

public interface IRecordService {
	/**
	 * 查询本人的记录
	 * @return
	 */
	List<Record> queryAll();
	/**
	 * 租车
	 */
	String addCarRecord(int carId);
	/**
	 * 还车
	 * 返回需要归还的车的list
	 */
	List<Record> queryAllByBack();
	
	String addCarRecordBack(Record record);
	/**
	 * 管理员
	 * 查询所有用户的租车记录
	 */
	List<Record> queryRecordAll();
	/**
	 * 管理员
	 * 查看指定用户的租车记录
	 */
	List<Record> queryRecordByName(String name);
	/**
	 * 管理员
	 * 查看指定汽车的租赁记录
	 */
	List<Record> queryRecordByCar(String carName);
	
}
