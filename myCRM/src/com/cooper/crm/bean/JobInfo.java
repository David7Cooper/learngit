package com.cooper.crm.bean;

public class JobInfo {
	private int id;
	private String job;
	private int departmentId;
	private Department department;
	/**
	 * 存取器
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	/**
	 * 构造器
	 */
	public JobInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobInfo(String job, int departmentId) {
		super();
		this.job = job;
		this.departmentId = departmentId;
	}
	public JobInfo(int id, String job, int departmentId) {
		super();
		this.id = id;
		this.job = job;
		this.departmentId = departmentId;
	}
	@Override
	public String toString() {
		return "JobInfo [id=" + id + ", job=" + job + ", departmentId=" + departmentId + "]";
	}
	/**
	 * END
	 */
}
