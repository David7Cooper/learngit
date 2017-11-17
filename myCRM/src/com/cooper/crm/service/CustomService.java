package com.cooper.crm.service;

import java.util.Date;
import java.util.List;

import com.cooper.crm.bean.Custom;

public interface CustomService {
	/**
	 * 查（查询全部）
	 */
	List<Custom> selectAll();
	/**
	 * 查（按照客户姓名查询）
	 */
	List<Custom> selectByName(String name);
	/**
	 * 查（按照客户状态查询）
	 */
	List<Custom> selectByCustomStatu(String statu);
	/**
	 * 查（按照邀约人查询）
	 */
	List<Custom> selectByInviteName(String inviteName);
	/**
	 * 查（按照电话号码查询）
	 */
	List<Custom> selectByPhoneNo(String phoneNo);
	/**
	 * 查（按照创建日期查询）
	 */
	List<Custom> selectByCreateDate(Date createDate);
	/**
	 * 改（保存修改）
	 */
	void updateCustom(Custom custom);
	/**
	 * 分页
	 */
	void page1(Custom custom,int start,int limit);
}
