package com.br.chap01_beforeVSafter.before.model.vo;

public class Desktop {
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allInOne;
	
	//생성부 
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;

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
	
	public void setAllInOne(boolean allInOne){
		this.allInOne = allInOne;
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
	
	public boolean isAllInOne() {  // boolean값을 반환하는 메소드는 get이 아닌 is를 붙인다
		return allInOne = allInOne;
	}
	
	
	//information
	public String information() {
		return brand + ", " +
				pCode + ", " +
				pName + ", " +
				price + ", " +
				allInOne;
				
	}
	
}
