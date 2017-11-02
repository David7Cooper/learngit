package com.cooper.crm.bean;

public class Department {
	private int id;
	private String dname;
	/**
	 * 存取器
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	/**
	 * 构造器
	 */
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String dname) {
		super();
		this.dname = dname;
	}
	public Department(int id, String dname) {
		super();
		this.id = id;
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", dname=" + dname + "]";
	}
	/**
	 * END
	 */
}
