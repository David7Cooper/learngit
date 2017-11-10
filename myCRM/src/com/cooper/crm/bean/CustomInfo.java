package com.cooper.crm.bean;

import java.util.Date;

public class CustomInfo {
	private int id;
	private int customId;
	private int followManId;
	private String statu;
	private Date startDate;
	private Date planDate;
	private Date lastFollowDate;
	private String mark;
	/**
	 * 存取器
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomId() {
		return customId;
	}
	public void setCustomId(int customId) {
		this.customId = customId;
	}
	public int getFollowManId() {
		return followManId;
	}
	public void setFollowManId(int followManId) {
		this.followManId = followManId;
	}
	public String getStatu() {
		return statu;
	}
	public void setStatu(String statu) {
		this.statu = statu;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getPlanDate() {
		return planDate;
	}
	public void setPlanDate(Date planDate) {
		this.planDate = planDate;
	}
	public Date getLastFollowDate() {
		return lastFollowDate;
	}
	public void setLastFollowDate(Date lastFollowDate) {
		this.lastFollowDate = lastFollowDate;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	/**
	 * 构造器
	 */
	public CustomInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomInfo(int customId, int followManId, String statu, Date startDate, Date planDate, Date lastFollowDate,
			String mark) {
		super();
		this.customId = customId;
		this.followManId = followManId;
		this.statu = statu;
		this.startDate = startDate;
		this.planDate = planDate;
		this.lastFollowDate = lastFollowDate;
		this.mark = mark;
	}
	public CustomInfo(int id, int customId, int followManId, String statu, Date startDate, Date planDate,
			Date lastFollowDate, String mark) {
		super();
		this.id = id;
		this.customId = customId;
		this.followManId = followManId;
		this.statu = statu;
		this.startDate = startDate;
		this.planDate = planDate;
		this.lastFollowDate = lastFollowDate;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "CustomInfo [id=" + id + ", customId=" + customId + ", followManId=" + followManId + ", statu=" + statu
				+ ", startDate=" + startDate + ", planDate=" + planDate + ", lastFollowDate=" + lastFollowDate
				+ ", mark=" + mark + "]";
	}
	/**
	 * END
	 */
}
