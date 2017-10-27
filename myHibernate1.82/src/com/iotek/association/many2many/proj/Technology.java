package com.iotek.association.many2many.proj;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Technology implements Serializable {
	private long id;
	private String name;
	private String category;
	private Set<Engineer> engineers = new HashSet<>();
	/**
	 * 存取器
	 */
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Set<Engineer> getEngineers() {
		return engineers;
	}
	public void setEngineers(Set<Engineer> engineers) {
		this.engineers = engineers;
	}
	/**
	 * 构造器
	 */
	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technology(long id, String name, String category, Set<Engineer> engineers) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.engineers = engineers;
	}
	/**
	 * END
	 */
}
