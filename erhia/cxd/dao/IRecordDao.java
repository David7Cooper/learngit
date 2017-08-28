package com.erhia.cxd.dao;

import java.util.List;
import com.erhia.cxd.bean.Record;

public interface IRecordDao {
	/**
	 * 查询所有用户记录
	 * @return
	 */
	List<Record> queryAll();
	/**
	 * 租车
	 */
	void addCarRecord(int Id,int carId);
	/**
	 * 还车
	 */
	void addCarRecordBack(Record record);
}
