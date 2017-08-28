package com.erhia.cxd.service;

import com.erhia.cxd.bean.User;

public interface IUserService {
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	public abstract String addUser(User user);
	/**
	 * 判断是否有该用户
	 * @param user
	 * @return
	 */
	public abstract String queryUser(User user);
}
