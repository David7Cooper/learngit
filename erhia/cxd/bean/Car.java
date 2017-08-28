package com.erhia.cxd.bean;

public class Car {
	private int id;
	private String carNumber;
	private int brandId;
	private String model;
	private String color;
	private int categoryId;
	private String TComments;
	private int price;
	private int rent;
	private int status;
	private int useable;
//	private List<Brand> listBrand = new ArrayList<>();
//	private List<Category> listCg = new ArrayList<>();
	private	Brand brand;
	private Category category;
	private String statusS;
	private String useableS;
	/**
	 * 	存取器
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getTComments() {
		return TComments;
	}
	public void setTComments(String tComments) {
		TComments = tComments;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getUseable() {
		return useable;
	}
	public void setUseable(int useable) {
		this.useable = useable;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	/**
	 * 构造器
	 */
	public Car() {
		super();
	}
	public Car(int id, String carNumber, int brandId, String model,
			String color, int categoryId, String tComments, int price,
			int rent, int status, int useable) {
		super();
		this.id = id;
		this.carNumber = carNumber;
		this.brandId = brandId;
		this.model = model;
		this.color = color;
		this.categoryId = categoryId;
		TComments = tComments;
		this.price = price;
		this.rent = rent;
		this.status = status;
		this.useable = useable;
	}
	public Car(String carNumber, int brandId, String model, String color,
			int categoryId, String tComments, int price, int rent, int status)
	{
		super();
		this.carNumber = carNumber;
		this.brandId = brandId;
		this.model = model;
		this.color = color;
		this.categoryId = categoryId;
		TComments = tComments;
		this.price = price;
		this.rent = rent;
		this.status = status;
	}
	public Car(int id, Brand brand,  String tComments, String model,
			Category category, int rent, int status,int useable) {
		super();
		this.id = id;
		this.brand = brand;
		this.TComments = tComments;
		this.model = model;
		this.category = category;
		this.rent = rent;
		this.status = status;
		this.useable = useable;
		if(status==0){
			this.statusS = "可租";
		}else{
			this.statusS = "不可租";
		}
		if(useable==0){
			this.useableS = "上架";
		}else{
			this.statusS = "没上架";
		}
	}
		
	public String toString() {
		return id + "\t" + model +"\t"+TComments
				+ "\t" +brand.getName()+"\t"+ category.getName()+ "\t" + rent + "/天\t"+ statusS+"\t"+useableS;
	}
	/**
	 * End
	 */
}
