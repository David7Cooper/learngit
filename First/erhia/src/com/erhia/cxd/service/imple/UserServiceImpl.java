package com.erhia.cxd.service.imple;

import com.erhia.cxd.bean.User;
import com.erhia.cxd.dao.IUserDao;
import com.erhia.cxd.dao.imple.UserDaoImpl;
import com.erhia.cxd.service.IUserService;

public class UserServiceImpl implements IUserService{
	IUserDao iud = new UserDaoImpl();
	
	@Override
	public String queryUser(User user) {
		// TODO Auto-generated method stub
		User u = iud.queryUser(user);
		if(u != null){
			if(user.getPassword().equals(u.getPassword())){
				if(u.getType()==0){
					return "0";
				}else{
					return "1";
				}
			}else{
				return "用户密码不正确";
			}
		}else{
			return "用户名不存在";
		}
	}
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		if(iud.addUser(user)==0){
			return "用户名或身份证号码已存在，注册失败！！！";
		}else{
			return "注册成功！！！";
		}
	}
	
}
