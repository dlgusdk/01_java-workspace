package com.br.chap02_abstract.model.vo;

public class BasketBall extends Sports{
	//추상메소드가 존재하는 추상클래스를 상속받는 순간 부모클래스에 있던 추상 메소드를 오버라이딩해야함(완성시켜야함)
	
	@Override
	public void rule() {
		System.out.println("공은 항상 손으로만 쳐야된다.");
	}
	
}
