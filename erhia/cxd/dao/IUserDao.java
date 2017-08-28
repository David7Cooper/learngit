package com.erhia.cxd.dao;

import com.erhia.cxd.bean.User;

public interface IUserDao {
	/**
	 * 用户名登录查询
	 * @param user
	 * @return
	 */
	public abstract User queryUser(User user);
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	public abstract int addUser(User user);
}
