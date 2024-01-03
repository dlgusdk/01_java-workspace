package com.br.chap03_interface.model.vo;

public class Baby extends Person implements Basic{

	public Baby() {
		super();
	}

	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}

	@Override
	public String toString() {
		return "Baby [" + super.toString() +"]";
	}

	public void eat() {
		setWeight(getWeight() + 3);
		setHealth(getHealth() + 2);
	}

	@Override
	public void sleep() {
		setHealth(getHealth() + 3);
	}
	
	
}
