package com.erhia.cxd.bean;

public class User {
	private int id;
	private String userName;
	private String password;
	private int sex;
	private String idNumber;
	private String tel;
	private String addr;
	private int type;
	/**
	 * 存取器
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	/**
	 * 构造器
	 */
	public User() {
		super();
	}
	public User(int id, String userName, String password, int sex,
			String idNumber, String tel, String addr, int type) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.sex = sex;
		this.idNumber = idNumber;
		this.tel = tel;
		this.addr = addr;
		this.type = type;
	}
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public User(String userName, String password, int sex, String idNumber,
			String tel, String addr) {
		super();
		this.userName = userName;
		this.password = password;
		this.sex = sex;
		this.idNumber = idNumber;
		this.tel = tel;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", sex=" + sex + ", idNumber=" + idNumber
				+ ", tel=" + tel + ", addr=" + addr + ", type=" + type + "]";
	}
	/**
	 * End
	 */
}
