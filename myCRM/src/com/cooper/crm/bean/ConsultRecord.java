package com.cooper.crm.bean;

import java.util.Date;

public class ConsultRecord {
	private int id;
	private int customId;
	private String consultStatu;
	private int consultManId;
	private Date consultDate;
	private String result;
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
	public String getConsultStatu() {
		return consultStatu;
	}
	public void setConsultStatu(String consultStatu) {
		this.consultStatu = consultStatu;
	}
	public int getConsultManId() {
		return consultManId;
	}
	public void setConsultManId(int consultManId) {
		this.consultManId = consultManId;
	}
	public Date getConsultDate() {
		return consultDate;
	}
	public void setConsultDate(Date consultDate) {
		this.consultDate = consultDate;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * 构造器
	 */
	public ConsultRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConsultRecord(int customId, String consultStatu, int consultManId, Date consultDate, String result) {
		super();
		this.customId = customId;
		this.consultStatu = consultStatu;
		this.consultManId = consultManId;
		this.consultDate = consultDate;
		this.result = result;
	}
	public ConsultRecord(int id, int customId, String consultStatu, int consultManId, Date consultDate, String result) {
		super();
		this.id = id;
		this.customId = customId;
		this.consultStatu = consultStatu;
		this.consultManId = consultManId;
		this.consultDate = consultDate;
		this.result = result;
	}
	@Override
	public String toString() {
		return "ConsultRecord [id=" + id + ", customId=" + customId + ", consultStatu=" + consultStatu
				+ ", consultManId=" + consultManId + ", consultDate=" + consultDate + ", result=" + result + "]";
	}
	/**
	 * END
	 */
}
