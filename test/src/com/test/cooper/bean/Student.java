package com.test.cooper.bean;

public class Student {
	private int id;
	private String name;
	private String sex;
	/**
	 * 存取器
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 构造器
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	/**
	 * End
	 */
}
