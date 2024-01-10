package com.hw1.model.vo;

public class Product {
	//필드
	private String productld;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	//매개변수

	public Product() {
		
	}
	
	public Product(String productld, String productName, String productArea, int price, double tax) {
		super();
		this.productld = productld;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}

	//get set 메소드부

	public String getProductld() {
		return productld;
	}

	public void setProductld(String productld) {
		this.productld = productld;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductArea() {
		return productArea;
	}

	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	//informaion
	public String information() {
		return "Product [productld=" + productld + ", productName=" + productName + ", productArea=" + productArea
				+ ", price=" + price + ", tax=" + tax + "]";
	}
	

	
	
	
}
