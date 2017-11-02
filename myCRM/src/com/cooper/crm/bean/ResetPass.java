package com.cooper.crm.bean;

public class ResetPass {
	private int id;
	private String username;
	private String phoneNo;
	/**
	 * 存取器
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	/**
	 * 构造器
	 */
	public ResetPass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResetPass(String username, String phoneNo) {
		super();
		this.username = username;
		this.phoneNo = phoneNo;
	}
	public ResetPass(int id, String username, String phoneNo) {
		super();
		this.id = id;
		this.username = username;
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "ResetPass [id=" + id + ", username=" + username + ", phoneNo=" + phoneNo + "]";
	}
	/**
	 * END
	 */
}
