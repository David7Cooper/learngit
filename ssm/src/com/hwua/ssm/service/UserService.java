package com.hwua.ssm.service;

import java.util.List;

import com.hwua.ssm.entity.User;


public interface UserService {
	/*void insertUser(User student);
	void updateUser(User student);
	void deleteById(Integer id);
	User selectById(Integer id);
	List<User> selectByName(String name);*/
	
	
	List<User> selectAllUser();
	User selectUserByName(String username);
	void addUser(User user);
	void removeUser(int id);
	void updateUser(User user);
}
