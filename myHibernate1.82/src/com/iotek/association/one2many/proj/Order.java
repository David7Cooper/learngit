package com.iotek.association.one2many.proj;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Order implements Serializable{
	private Long id;
	private Date orderedDate;
	private Date shippedDate;
	private Double total;
	private Set<OrderLine> orderlines = new HashSet<>();
	/**
	 * 存取器
	 */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getOrderedDate() {
		return orderedDate;
	}
	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}
	public Date getShippedDate() {
		return shippedDate;
	}
	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Set<OrderLine> getOrderlines() {
		return orderlines;
	}
	public void setOrderlines(Set<OrderLine> orderlines) {
		this.orderlines = orderlines;
	}
	/**
	 * 构造器
	 */
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Long id, Date orderedDate, Date shippedDate, Double total, Set<OrderLine> orderlines) {
		super();
		this.id = id;
		this.orderedDate = orderedDate;
		this.shippedDate = shippedDate;
		this.total = total;
		this.orderlines = orderlines;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderedDate=" + orderedDate + ", shippedDate=" + shippedDate + ", total=" + total
				+ "]";
	}
	/**
	 * END
	 */
}
