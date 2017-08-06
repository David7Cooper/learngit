package com.oaec.test.service.imple;

import java.util.List;

import com.oaec.test.bean.User;
import com.oaec.test.dao.IUserDao;
import com.oaec.test.dao.imple.UserDaoImple;
import com.oaec.test.service.IUserService;

public class UserServiceImple implements IUserService {
	@Override
	public boolean loginInUser(String name, String password) {
		IUserDao userDao=new UserDaoImple();
		List<User> list=userDao.queryUser();
		for(User user : list){
			if(user.getName().equals(name)&&user.getPassword().equals(password)){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean loginUpUser(String name, String sex, String password) {
		IUserDao userDao=new UserDaoImple();
		userDao.addUser(name, sex, password);
		return true;
	}
}
