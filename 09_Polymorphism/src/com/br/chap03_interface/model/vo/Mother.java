package com.br.chap03_interface.model.vo;

public class Mother extends Person implements Basic  {
	private String babyBirth;

	public Mother() {
	}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	@Override
	public String toString() {
		return "Mother [" + super.toString() + "Mother babyBirth= " + babyBirth + "]";
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		setWeight(getWeight() + 10);
		setHealth(getHealth() - 10);
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
