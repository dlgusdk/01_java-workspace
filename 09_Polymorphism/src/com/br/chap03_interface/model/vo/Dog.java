package com.br.chap03_interface.model.vo;

public class Dog extends Animal implements Moveable, Swimable{

	public Dog() {
		super();
	}

	public Dog(String name, String kind) {
		super(name, kind);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "가 개헤엄을 첨벙첨벙칩니다.");
	}

	@Override
	public void dive() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "가 꼬로록 물 속으로 다이빙을 합니다.");

	}

	@Override
	public void forward() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "가 네 발로 걸어갑니다.");

	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "가 뒤로 걸어갑니다.");

	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "가 껑충 뜁니다");

	}

	@Override
	public String bark() {
		// TODO Auto-generated method stub
		return "망망";
	}

	
	
}
