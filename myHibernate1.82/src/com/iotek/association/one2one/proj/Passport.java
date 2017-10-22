package com.iotek.association.one2one.proj;

import java.io.Serializable;

public class Passport implements Serializable {
	private Long id;
	private String bh;
	private Person person;
	/**
	 * 存取器
	 */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBh() {
		return bh;
	}
	public void setBh(String bh) {
		this.bh = bh;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	/**
	 * 构造器
	 */
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passport(Long id, String bh, Person person) {
		super();
		this.id = id;
		this.bh = bh;
		this.person = person;
	}
	@Override
	public String toString() {
		return "Passport [id=" + id + ", bh=" + bh + ", person=" + person + "]";
	}
	/**
	 * END
	 */
}
