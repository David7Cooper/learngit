package com.cooper.crm.service.imple;

import java.util.ArrayList;
import java.util.Date;
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
	private List<Custom> list;
	/**
	 * 查（查询全部）
	 */
	@Override
	public List<Custom> selectAll() {
		// TODO Auto-generated method stub
		/*对Custom多表连接
		for(Custom c : customDao.selectAll()) {
			System.out.println(c.getCustomInfo().getPlanDate());
			System.out.println(c.getConsultRecords());
			System.out.println("+++++++++++++++++++++++++++");
		}*/
		return customDao.selectAll();
	}
	/**
	 * 查（按照客户姓名查询）
	 */
	@Override
	public List<Custom> selectByName(String name) {
		// TODO Auto-generated method stub
		list = new ArrayList<>();
		for(Custom c : this.customDao.selectAll()) {
			if(c.getName().equals(name)) {
				list.add(c);
			}
		}
		return list;
	}
	/**
	 * 查（按照客户状态查询）
	 */
	@Override
	public List<Custom> selectByCustomStatu(String statu) {
		// TODO Auto-generated method stub
		list = new ArrayList<>();
		for(Custom c : this.customDao.selectAll()) {
			if(c.getCustomStatu().equals(statu)) {
				list.add(c);
			}
		}
		return list;
	}
	/**
	 * 查（按照邀约人查询）
	 */
	@Override
	public List<Custom> selectByInviteName(String inviteName) {
		// TODO Auto-generated method stub
		System.out.println("service"+inviteName);
		list = new ArrayList<>();
		for(Custom c : this.customDao.selectAll()) {
			if(inviteName.equals(c.getInviteName())) {
				list.add(c);
			}
		}
		return list;
	}
	/**
	 * 查（按照电话号码查询）
	 */
	@Override
	public List<Custom> selectByPhoneNo(String phoneNo) {
		// TODO Auto-generated method stub
		list = new ArrayList<>();
		for(Custom c : this.customDao.selectAll()) {
			if(c.getPhoneNo().equals(phoneNo)) {
				list.add(c);
			}
		}
		return list;
	}
	/**
	 * 查（按照创建日期查询）
	 */
	@Override
	public List<Custom> selectByCreateDate(Date createDate) {
		// TODO Auto-generated method stub
		list = new ArrayList<>();
		for(Custom c : this.customDao.selectAll()) {
			if(c.getCreateDate().equals(createDate)) {
				list.add(c);
			}
		}
		return list;
	}
	/**
	 * 改（保存修改）
	 */
	@Override
	public void updateCustom(Custom custom) {
		// TODO Auto-generated method stub
		this.customDao.updateCustom(custom);
	}
	/**
	 * 分页
	 */
	@Override
	public void page1(Custom custom,int start,int limit) {
		// TODO Auto-generated method stub
		this.customDao.page1(custom,start,limit);
	}
}
