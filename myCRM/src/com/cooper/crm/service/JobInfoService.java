package com.cooper.crm.service;

import java.util.List;

import com.cooper.crm.bean.Department;
import com.cooper.crm.bean.JobInfo;

public interface JobInfoService {
	/**
	 * 查（根据departmentId查询）
	 */
	List<JobInfo> selectByDepartment(Department department);
}
