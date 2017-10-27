package com.hwua.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwua.ssm.dao.UserDao;
import com.hwua.ssm.entity.User;
import com.hwua.ssm.service.UserService;

//���������ļ�
@Service("userService")
public class UserServiceImpl implements UserService{
	//
	@Resource(name="userDao")
	private UserDao userDao;
	
	/*@Override
	public void insertUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		userDao.deleteById(id);
	}

	@Override
	public User selectById(Integer id) {
		// TODO Auto-generated method stub
		System.out.println((userDao==null)+"+++++++++++++++++");
		return userDao.selectById(id);
	}

	@Override
	public List<User> selectByName(String name) {
		// TODO Auto-generated method stub
		return userDao.selectByName(name);
	}*/
/*****************************************************************/
	@Override
	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		/*for(User user : userDao.selectAllUser()) {
			System.out.println("qwer"+user.getUserpass()+","+user.getUsername());
		}*/
		return userDao.selectAllUser();
	}

	@Override
	public User selectUserByName(String username) {
		// TODO Auto-generated method stub
		return userDao.selectUserByName(username);
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	@Override
	public void removeUser(int id) {
		// TODO Auto-generated method stub
		userDao.removeUser(id);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}


}
