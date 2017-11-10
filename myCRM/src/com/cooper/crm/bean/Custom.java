package com.cooper.crm.bean;

import java.util.Date;
import java.util.List;

public class Custom {
	private int id;
	private String name;
	private String education;
	private String phoneNo;
	private String qq;
	private String email;
	private String customStatu;
	private Date createDate;
	private String inviteName;
	private CustomInfo customInfo;
	private List<ConsultRecord> consultRecords;
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
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCustomStatu() {
		return customStatu;
	}
	public void setCustomStatu(String customStatu) {
		this.customStatu = customStatu;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getInviteName() {
		return inviteName;
	}
	public void setInviteName(String inviteName) {
		this.inviteName = inviteName;
	}
	
	public CustomInfo getCustomInfo() {
		return customInfo;
	}
	public void setCustomInfo(CustomInfo customInfo) {
		this.customInfo = customInfo;
	}
	public List<ConsultRecord> getConsultRecords() {
		return consultRecords;
	}
	public void setConsultRecords(List<ConsultRecord> consultRecords) {
		this.consultRecords = consultRecords;
	}
	/**
	 * 构造器
	 */
	public Custom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Custom(String name, String education, String phoneNo, String qq, String email, String customStatu,
			Date createDate, String inviteName) {
		super();
		this.name = name;
		this.education = education;
		this.phoneNo = phoneNo;
		this.qq = qq;
		this.email = email;
		this.customStatu = customStatu;
		this.createDate = createDate;
		this.inviteName = inviteName;
	}
	public Custom(int id, String name, String education, String phoneNo, String qq, String email, String customStatu,
			Date createDate, String inviteName) {
		super();
		this.id = id;
		this.name = name;
		this.education = education;
		this.phoneNo = phoneNo;
		this.qq = qq;
		this.email = email;
		this.customStatu = customStatu;
		this.createDate = createDate;
		this.inviteName = inviteName;
	}
	@Override
	public String toString() {
		return "Custom [id=" + id + ", name=" + name + ", education=" + education + ", phoneNo=" + phoneNo + ", qq="
				+ qq + ", email=" + email + ", customStatu=" + customStatu + ", createDate=" + createDate
				+ ", inviteName=" + inviteName + "]";
	}
	/**
	 * END
	 */
}
