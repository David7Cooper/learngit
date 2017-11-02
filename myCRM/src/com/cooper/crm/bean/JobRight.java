package com.cooper.crm.bean;

public class JobRight {
	private int id;
	private int jobInfoId;
	private int rightId;
	/**
	 * 存取器
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getJobInfoId() {
		return jobInfoId;
	}
	public void setJobInfoId(int jobInfoId) {
		this.jobInfoId = jobInfoId;
	}
	public int getRightId() {
		return rightId;
	}
	public void setRightId(int rightId) {
		this.rightId = rightId;
	}
	/**
	 * 构造器
	 */
	public JobRight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobRight(int jobInfoId, int rightId) {
		super();
		this.jobInfoId = jobInfoId;
		this.rightId = rightId;
	}
	public JobRight(int id, int jobInfoId, int rightId) {
		super();
		this.id = id;
		this.jobInfoId = jobInfoId;
		this.rightId = rightId;
	}
	@Override
	public String toString() {
		return "jobRight [id=" + id + ", jobInfoId=" + jobInfoId + ", rightId=" + rightId + "]";
	}
	/**
	 * END
	 */
}
