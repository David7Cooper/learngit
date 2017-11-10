package com.cooper.crm.service.imple;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cooper.crm.bean.Department;
import com.cooper.crm.bean.JobInfo;
import com.cooper.crm.dao.JobInfoDao;
import com.cooper.crm.service.JobInfoService;
@Service("jobInfoService")
public class JobInfoServiceImpl implements JobInfoService {
	@Resource(name="jobInfoDao")
	private JobInfoDao jobInfoDao;

	@Override
	public List<JobInfo> selectByDepartment(Department department) {
		// TODO Auto-generated method stub
		return this.jobInfoDao.selectByDepartment(department);
	}

	
}
