package com.cooper.crm.service.imple;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cooper.crm.bean.Rights;
import com.cooper.crm.dao.RightsDao;
import com.cooper.crm.service.RightsService;
@Service("rightsService")
public class RightsServiceImpl implements RightsService {
	@Resource(name = "rightsDao")
	private RightsDao rightsDao;
	/**
	 * 查（查询全部）
	 */
	@Override
	public List<Rights> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * END
	 */
}
