package com.oaec.test.bean;

public class Dvd {
	private int id;
	private String name;
	private int rent;
	private int storage;
	private int rentNumber;
	
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
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getRentNumber() {
		return rentNumber;
	}
	public void setRentNumber(int rentNumber) {
		this.rentNumber = rentNumber;
	}
	
	public Dvd(int id, String name, int rent, int storage, int rentNumber) {
		super();
		this.id = id;
		this.name = name;
		this.rent = rent;
		this.storage = storage;
		this.rentNumber = rentNumber;
	}
	
	@Override
	public String toString() {
		return "Dvd [id=" + id + ", name=" + name + ", rent=" + rent + ", storage=" + storage + ", rentNumber="
				+ rentNumber + "]";
	}
	
	public String input(){
		return this.id+","+this.name+","+this.rent+","+this.storage+","+this.rentNumber+"\n";
	}
}
