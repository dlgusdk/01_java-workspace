package com.br.chap01_poly.model.vo;

public class Child1 extends Parent{

	private int z;
	
	public Child1() {
		
	}
	
	public Child1(int x, int y, int z){
		super(x, y);

		this.z = z;
		
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	//get
	
	public int getZ() {
		return z;
	}
	
	public void printChild1() {
		System.out.println("나 자식클래스1이야.");
	}
	
	@Override
	public void print() {
		System.out.println("나 자식클래스1이야");
	}
}
