package com.br.chap01_poly.model.vo;

public class Parent {

	private int x;
	private int y;
	
	public Parent() {
		
	}
	
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;

	}
	
	//set
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	//get
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void printParent() {
		System.out.println("나 부모클래스야.");
	}
	
	public void print() {
		System.out.println("나 부모클래스야.");

	}
}
