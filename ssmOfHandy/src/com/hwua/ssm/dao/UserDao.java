package com.hwua.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hwua.ssm.entity.User;


public interface UserDao {
	void insertUser(User student);
	void updateUser(User student);
	void deleteById(Integer id);
	User selectById(Integer id);
	List<User> selectAllUser();
	
	public List<User> queryForPage(
			@Param(value="startPos") Integer startPos, 
			@Param(value="pageSize") Integer pageSize) ;

	public Integer getCount() ;
}
