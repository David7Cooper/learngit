package com.oaec.cooper.model.bean;

public class Student {
	private int id;
	private String name;
	private int age;
	private String sex;
	private int teacherId;
	private Teacher teacher;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	/**
	 * 构造器
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, String sex, int teacherId) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.teacherId = teacherId;
	}
	public Student(int id, String name, int age, String sex, int teacherId, Teacher teacher) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.teacherId = teacherId;
		this.teacher = teacher;
	}
	/**
	 * End
	 */
}
