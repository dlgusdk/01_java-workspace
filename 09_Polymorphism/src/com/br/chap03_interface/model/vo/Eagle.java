package com.br.chap03_interface.model.vo;

public class Eagle extends Animal implements Flyable, Moveable{

	public Eagle() {
	
	}
	
	public Eagle(String name, String kind) {
		super(name, kind);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println(getName() + "가 큰 날개를 펼치며 날아갑니다.");
	}

	@Override
	public String bark() {
		// TODO Auto-generated method stub
		return "끼룩";
	}

	@Override
	public void forward() {
		System.out.println(getName() + "가 두 발로 걸어갑니다.");
		
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "가 뒤로 걷습니다.");

	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "점프할 순 없습니다.");

	}
}
