package com.hw1.model.vo;

public class Dog extends Animal {
	private int weight;
	public static final String Place = "애견카페";

	public Dog() {
		super();
	}

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}



	@Override
	public void speak() {
		return super.toString() + "Place = " + Place + "Dog weight=" + weight ;
	}

	
	
}
