package com.hwua.ssm.service;

import java.util.List;

import com.hwua.ssm.PageBean;
import com.hwua.ssm.entity.User;


public interface UserService {
	void insertUser(User student);
	void updateUser(User student);
	void deleteById(Integer id);
	User selectById(Integer id);
	public PageBean queryForPage(int pageSize, int Page);
	List<User> selectAllUser();
}
