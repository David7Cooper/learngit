package com.cooper.crm.service.imple;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cooper.crm.bean.ResetPass;
import com.cooper.crm.dao.ResetPassDao;
import com.cooper.crm.service.ResetPassService;
@Service("resetPassService")
public class ResetPassServiceImpl implements ResetPassService{
	@Resource(name="resetPassDao")
	private ResetPassDao resetPassDao;
	
	
	@Override
	public List<ResetPass> selectAll() {
		// TODO Auto-generated method stub
		return resetPassDao.selectAll();
	}
	

}
