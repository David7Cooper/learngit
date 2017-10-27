package com.iotek.association.one2many.proj;

import java.io.Serializable;

public class OrderLine implements Serializable {
	private Long id;
	private Double price;
	private Long quantity;
	private String product;
	private Order order;
	/**
	 * 存取器
	 */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	/**
	 * 构造器
	 */
	public OrderLine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderLine(Long id, Double price, Long quantity, String product, Order order) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.product = product;
		this.order = order;
	}
	@Override
	public String toString() {
		return "OrderLine [id=" + id + ", price=" + price + ", quantity=" + quantity + ", product=" + product
				;
	}
	/**
	 * END
	 */
}
