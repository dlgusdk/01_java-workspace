package com.br.chap03_interface.model.vo;

public interface Basic {

	/*
	 * 추상클래스(abstract) 일반필드 + 일반메소드 + 추상메소드(생략가능)
	 * 인터페이스(interface) 상수필드만 가능 + 추상메소드만 가질 수 있음
	 */
	
	public static final int NUM = 10; //상수필드만 가능
	
	/*
	public void test() {
		
	} - 불가*/
	
	/*public abstract 생략가능 인터페이스는 추상메소드만 사용가능하기 때문*/ void eat();
	public abstract void sleep();
	
}
