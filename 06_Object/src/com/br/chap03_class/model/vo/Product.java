package com.br.chap03_class.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	//기본생성자(매개변수 없는 생성자)
	public Product(){
		//객체 생성만
	}

	//매개변수 3개짜리 생성자(객체 생성과 동시에 각 필드에 값 초기화)
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	

	
	
	
	
	//setter
	public void setpName(String pName) { //set이나 get 다음에 pName처럼 낙타표기법을 어떻게 해야할지 모르는게 올 때 -> setPName아니고 그냥 pName이라고 적기.
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	//getter
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	
	//information
	public String information() {
		String result =  pName + "\n" 
			 + price + "\n" 
			 + brand + "\n";
		return result;
	}
	
}
