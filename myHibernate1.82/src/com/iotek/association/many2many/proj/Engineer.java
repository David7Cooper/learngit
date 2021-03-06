package com.iotek.association.many2many.proj;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Engineer implements Serializable {
	private Long id;
	private String name;
	private String gender;
	private Integer age;
	private String company;
	private Set<Technology> technologies = new HashSet<>();
	/**
	 * 存取器
	 */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Set<Technology> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(Set<Technology> technologies) {
		this.technologies = technologies;
	}
	/**
	 * 构造器
	 */
	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engineer(Long id, String name, String gender, Integer age, String company, Set<Technology> technologies) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.company = company;
		this.technologies = technologies;
	}
	/**
	 * END
	 */
}
