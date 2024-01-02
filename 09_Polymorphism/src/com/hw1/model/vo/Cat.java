package com.hw1.model.vo;

public class Cat extends Animal{
	private String location;
	private String color;
	
	public Cat() {
		super();
	}
	
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.color = color;
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void speak() {
		return super.toString() + "Cat location= " + location + ", color=" + color;
	}

	
	
}
