package com.hw1.model.vo;

public class Product {
	
	//필드부
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	
	//생성부(매개변수)
	public Product() { //기본매개변수
		
	}
	
	public Product(String productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}
	
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this(productId, productName);
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	//set,get 메소드 부분
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	//getter
	public String getProductId(){
		return productId;
	}
	
	public String getProductName(){
		return productName;
	}
	
	public String getProductArea(){
		return productArea;
	}
	
	public int getPrice(){
		return price;
	}
	
	public double getTax(){
		return tax;
	}
	
	
	//information
	public String information() {
		return productId + ", " + productName + ", " + productArea + ", " + price + ", " + tax;
	}
	
	

}

	
	
