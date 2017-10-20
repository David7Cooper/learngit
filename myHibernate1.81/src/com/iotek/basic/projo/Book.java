package com.iotek.basic.projo;

import java.io.Serializable;

public class Book implements Serializable {
	private String isbn;
	private String name;
	private String author;
	private Double price;
	/**
	 * 存取器
	 */
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * 构造器
	 */
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String isbn, String name, String author, Double price) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	/**
	 * END
	 */
}
