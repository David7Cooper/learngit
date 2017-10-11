package com.struts.cooper.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.cooper.bean.User1;

public class ActionUser1 extends ActionSupport{
	private User1 user1;
	/**
	 * 存取器
	 */ 
	public User1 getUser1() {
		return user1;
	}
	public void setUser1(User1 user1) {
		this.user1 = user1;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
}
