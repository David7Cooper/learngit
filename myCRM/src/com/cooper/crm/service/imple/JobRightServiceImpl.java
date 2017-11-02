package com.cooper.crm.service.imple;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cooper.crm.bean.JobRight;
import com.cooper.crm.dao.JobRightDao;
import com.cooper.crm.service.JobRightService;
//@Service("jobRightService")
public class JobRightServiceImpl implements JobRightService {
//	@Resource(name = "jobRightDao")
	private JobRightDao jobRightDao;
	/**
	 * 查（查询全部）
	 */
	@Override
	public List<JobRight> selectAll() {
		// TODO Auto-generated method stub
		return jobRightDao.selectAll();
	}
	/**
	 * END
	 */
}
