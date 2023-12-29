package com.br.chap01_beforeVSafter.after.model.vo;

public class Product {

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	public Product() {
		
	}
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		
	}
	
	//메소드부
		public void setBrand(String brand){
			this.brand = brand;
		}
		
		public void setpCode(String pCode){
			this.pCode = pCode;
		}
		
		public void setpName(String pName){
			this.pName = pName;
		}
		
		public void setPrice(int price){
			this.price = price;
		}
		
		
		//getter
		
		public String getBrand() {
			return brand = brand;
		}
		
		public String getpCode() {
			return pCode = pCode;
		}
		
		public String getpName() {
			return pName = pName;
		}
		
		public int getPrice() {
			return price = price;
		}
		
		//information
		public String information() {
			return brand + ", " +
					pCode + ", " +
					pName + ", " +
					price;
	
	
		}
		
			
		
		
}
