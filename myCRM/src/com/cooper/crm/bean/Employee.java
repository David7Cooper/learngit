package com.cooper.crm.bean;

public class Employee {
	private int id;
	private String username;
	private String pass;
	private String nickname;
	private String realname;
	private int jobInfoId;
	private int departmentId;
	private String phoneNo;
	private String officeTel;
	private String workStatu;
	private JobInfo jobInfo;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public int getJobInfoId() {
		return jobInfoId;
	}
	public void setJobInfoId(int jobInfoId) {
		this.jobInfoId = jobInfoId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getOfficeTel() {
		return officeTel;
	}
	public void setOfficeTel(String officeTel) {
		this.officeTel = officeTel;
	}
	public String getWorkStatu() {
		return workStatu;
	}
	public void setWorkStatu(String workStatu) {
		this.workStatu = workStatu;
	}
	
	public JobInfo getJobInfo() {
		return jobInfo;
	}
	public void setJobInfo(JobInfo jobInfo) {
		this.jobInfo = jobInfo;
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
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String username, String pass, String nickname, String realname, int jobInfoId, int departmentId,
			String phoneNo, String officeTel, String workStatu) {
		super();
		this.username = username;
		this.pass = pass;
		this.nickname = nickname;
		this.realname = realname;
		this.jobInfoId = jobInfoId;
		this.departmentId = departmentId;
		this.phoneNo = phoneNo;
		this.officeTel = officeTel;
		this.workStatu = workStatu;
	}
	public Employee(int id, String username, String pass, String nickname, String realname, int jobInfoId,
			int departmentId, String phoneNo, String officeTel, String workStatu) {
		super();
		this.id = id;
		this.username = username;
		this.pass = pass;
		this.nickname = nickname;
		this.realname = realname;
		this.jobInfoId = jobInfoId;
		this.departmentId = departmentId;
		this.phoneNo = phoneNo;
		this.officeTel = officeTel;
		this.workStatu = workStatu;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", pass=" + pass + ", nickname=" + nickname
				+ ", realname=" + realname + ", jobInfoId=" + jobInfoId + ", departmentId=" + departmentId
				+ ", phoneNo=" + phoneNo + ", officeTel=" + officeTel + ", workStatu=" + workStatu + "]";
	}
	/**
	 * END
	 */
}
