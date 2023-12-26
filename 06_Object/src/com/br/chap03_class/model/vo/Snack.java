package com.br.chap03_class.model.vo;

public class Snack {

	private String sName;
	//private String brand;
	private int price;
	private int Kcal;
	
	public static final String BRAND = "농심";
	
	
	//기본생성자
	public Snack() {
		
	}
	
	//매개변수 생성자 
	public Snack(String sName, int price, int Kcal) {
		this.sName = sName;
		this.Kcal = Kcal;
		this.price = price;
		
	}
	
	
	public void setsName(String name){
		this.sName = sName;
	}
	
	/*public void setBrand(String brand){
		this.brand = brand;
	}*/
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public void setKcal(int Kcal){
		this.Kcal = Kcal;
	}
	

	
	public String getsName() {
		return sName;
	}
	public int getPrice() {
		return price;
	}
	
	/*public String getBrand() {
		return brand;
	}*/
	
	public int getKcal() {
		return Kcal;
	}
	

	
	//information
	   public String information() {
		      
		      return "sName : " + sName + ", brand : " + BRAND + ", price : " + price + ", kcal : " + Kcal;

	}
	
}
