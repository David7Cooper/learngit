package com.cooper.crm.dao;

import java.util.List;

import com.cooper.crm.bean.JobInfo;

public interface JobInfoDao {
	/**
	 * 查（查询全部）
	 */
	List<JobInfo> selectAll();
}
