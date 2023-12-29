package com.br.chap02_inherit.model.vo;

public class Vehicle {
	private String name;
	private double mileage;
	private String kind;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String name, double mileage, String kind) {
		this.kind = kind;
		this.name = name;
		this.mileage = mileage;
		
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	//getter
	
	public String getName() {
		return name = name;
	}
	
	public double getMileage() {
		return mileage = mileage;
	}
	
	public String getKind() {
		return kind = kind;
	}
	
	//information
	public String information() {
		return name + ", " +  mileage + ", " +  kind;
	}
}
