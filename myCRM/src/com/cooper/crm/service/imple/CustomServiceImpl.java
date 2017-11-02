package com.cooper.crm.service.imple;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cooper.crm.bean.Custom;
import com.cooper.crm.dao.CustomDao;
import com.cooper.crm.service.CustomService;
@Service("customService")
public class CustomServiceImpl implements CustomService{
	
	@Resource(name="customDao")
	private CustomDao customDao;
	/**
	 * 查（查询全部）
	 */
	@Override
	public List<Custom> selectAll() {
		// TODO Auto-generated method stub
		return customDao.selectAll();
	}
	/**
	 * END
	 */
	/*public static void main(String[] args) {
		for(Custom c : new CustomServiceImpl().selectAll()) {
			System.out.println(c.toString());
		}
	}*/
}
