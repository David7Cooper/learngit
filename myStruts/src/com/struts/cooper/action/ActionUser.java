package com.struts.cooper.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.cooper.bean.User;
import com.struts.cooper.bean.User1;
import com.sun.xml.internal.ws.wsdl.writer.document.Fault;
/**
 * 一个ActionUser可以对应很多<form></form>表单
 * @author Administrator
 *
 */
public class ActionUser extends ActionSupport {
	private User user;

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * 运用这种方法无法的缺点:
	 * 1.没有用到JavaBean，多写了代码
	 */
	/*private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}*/
	/**
	 * 方法
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if("Cooper".equals(user.getName()) && "123".equals(user.getPassword())) {
			return SUCCESS;
		}else {
			return ERROR;
		}
	}
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if("".equals(user.getName())) {
			addFieldError("user.name", "用户名不能为空");
		}
		if("".equals(user.getPassword())) {
			addFieldError("user.password","密码不能为空");
		}
	}
	/**
	 * End
	 */
}
