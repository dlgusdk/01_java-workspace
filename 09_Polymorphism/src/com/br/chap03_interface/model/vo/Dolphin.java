package com.br.chap03_interface.model.vo;

public class Dolphin extends Animal implements Swimable{
	public Dolphin() {
		
	}
	
	public Dolphin(String name, String kind) {
		super(name, kind);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "가 수영합니다.");
	}

	@Override
	public void dive() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "가 포물선을 그리며 다이빙합니다.");

	}

	@Override
	public String bark() {
		// TODO Auto-generated method stub
		return "끼이이";
	}
	
	

}
