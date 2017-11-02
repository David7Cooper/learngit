package com.cooper.crm.service;

import java.util.List;

import com.cooper.crm.bean.JobInfo;

public interface JobInfoService {
	/**
	 * 查（查询全部）
	 */
	List<JobInfo> selectAll();
}
