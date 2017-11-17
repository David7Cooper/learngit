package com.cooper.crm.bean;

import java.io.Serializable;

public class Rights implements Serializable{
	private int rid;
	private String rightName;
	private String rightType;
	private String url;
	private int pid;
	/**
	 * 存取器
	 */
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRightName() {
		return rightName;
	}
	public void setRightName(String rightName) {
		this.rightName = rightName;
	}
	public String getRightType() {
		return rightType;
	}
	public void setRightType(String rightType) {
		this.rightType = rightType;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	/**
	 * 构造器
	 */
	public Rights() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rights(String rightName, String rightType, String url, int pid) {
		super();
		this.rightName = rightName;
		this.rightType = rightType;
		this.url = url;
		this.pid = pid;
	}
	public Rights(int rid, String rightName, String rightType, String url, int pid) {
		super();
		this.rid = rid;
		this.rightName = rightName;
		this.rightType = rightType;
		this.url = url;
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Rights [rid=" + rid + ", rightName=" + rightName + ", rightType=" + rightType + ", url=" + url
				+ ", pid=" + pid + "]";
	}
	/**
	 * END
	 */
}
