package com.br.chap01_beforeVSafter.before.model.vo;

public class Tv {
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private int inch;

	
	//생성부 
	
	public Tv() {
		
	}//기본
	
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.inch = inch;

	}//기본
	
	
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
	
	public void setinch(int inch){
		this.inch = inch;
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
	
	public int getmobileAgency() {
		return inch = inch;
	}
	
	
	//information
	public String information() {
		return brand + ", " +
				pCode + ", " +
				pName + ", " +
				price + ", " +
				inch;
				
	}
}


