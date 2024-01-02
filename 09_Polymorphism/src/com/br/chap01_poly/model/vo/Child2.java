package com.br.chap01_poly.model.vo;

public class Child2 extends Parent {
	private int n;
	
	public Child2() {
		//super(); 기본적으로 작성되어있으며 jVM이 자동으로 만들어주므로 쓰지않아도 된다.(따라서 자식객체 생성시 부모객체가 먼저 생성()
	}
	
	public Child2(int x, int y, int n){
		super(x, y);
		this.n = n;
		
	}
	
	public void setN(int n) {
		this.n = n;
	}
	//get
	
	public int getN() {
		return n;
	}
	
	public void printChild2() {
		System.out.println("나 자식클래스2야.");
	}
	
	@Override
	public void print() {
		System.out.println("나 자식클래스2이야");
	}
}


