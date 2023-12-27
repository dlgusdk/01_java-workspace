package com.br.chap05_constructor;

import com.br.chap05_constructor.model.vo.User;

public class Cosmetic {

	/*
	 * <필드>
	 * 
	 * 표현법
	 * 접근제한자 [예약어] 자료형 변수명;
	 * 
	 * 전역변수(클래스 영역에 바로 선언한 변수 == 클래스 전역에서 사용가능)
	 * -멤버변수 (== 인스턴스변수) -> 객체 생성시 메모리 할당 / 객체 소멸시 같이 소멸
	 * -클래스 변수(static) -> 프로그램 실행시 메모리 할당/ 프로그램 종료시 소멸
	 * 
	 * 예약어
     *  - static : 공유의 개념
     *  - final : 상수의 개념
     *  - static fianl : 상수필드


	 * 접근제한자
	 * public > protected > default > private
	 * 
	 *
	 */
	
	/*
	 * 생성자
	 * 
	 * 표현법
	 * 접근제한자 생성자명([매개변수, 매개변수...]) {
	 * 
	 * }
	 * 
	 * 생성자의 목적
	 * -단지 객체생성만이 목적
	 * -객체 생성과 동시에 각 필드에 값을 대입(초기화)하기 위함->매개변수 생성자
	 * 
	 * 생성자 작성시 주의사항
	 * -생성자명은 클래스명과 동일하게 작성해야함
	 * -반환형 기술 x(메소드로 인식된다)
	 * -매개변수 생성자 명시했을 시에는 기본생성자를 JVM이 자동생성하지 않음 -> 기본생성자 생성
	 * 
	 */
	
	/*
	 * <메소드>
	 * 표현법
	 * 접근제한자 반환형 메소드명([매개변수, 매개변수..]){
	 * 	실행내용
	 *  [return 반환값;]
	 * }
	
	 * 
	 * get 메소드: 필드에 담겨있는 값을 반환시켜주기 위한 목적
	 * set 메소드: 필드값을 수정하기 위한 목적 
	 * 
	 * 메소드는 항상 필드와 밀접한 연과이 있게 작성해야함  
	 * 
	 */
	
	
	
	public String cName; //화장품명
	private int price; //화장품 가격
	private String brand; //화장품 브랜드
	private String category; //화장품 분류
	private String[] ingreaient; //화장품 분류(참조자료형)
	private User maker; //화장품 개발자
	
	public Cosmetic() {
		
	}
	
	public Cosmetic(String sName, int price, String brand, String category, String[] ingreaient, User maker) {
		this.cName = cName;
		this.price = price;
		this.brand = brand;
		this.category = category;
		this.ingreaient = ingreaient;
		this.maker = maker;
	}

		
	//메소드부 set
	
	public void setMaker(User maker) {
		this.maker = maker;
	
	}
		
	public void setcName(String cName) {
		this.cName = cName;
	
	}
	
	public void setPrice (int price) {
		this.price = price;

	}
	public void setBrand (String brand) {
		this.brand = brand;

	}
	public void setCategory (String category) {
		this.category = category;

	}
	public void setIngreaient (String[] ingreaient) {
		this.ingreaient = ingreaient;

	}
	
	
	//get
	
	public String getcName() {
		return cName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String[] getIngreaient() {
		return ingreaient;
	}
	
	public User getMaker() {
		return maker = maker;
	
	}
	
	//information
	public String information() {
		String str = "화장품명 : " + cName 
				+ "\n가격 : " + price 
				+ "\n브랜드명 : " + brand
				+ "\n분류 : " + category
				+ "\n성분 : " + ingreaient;
		for(int i=0; i<ingreaient.length; i++) {
			str += ingreaient[i] + " ";
			 if(i< ingreaient.length-1) {
		            str += ", ";
		         }
		      }
		
		if(maker != null) {
			str += "\n화장품개발자 : " + maker.information(); 

		}
		
		//~~성분 : 색소, 알토올, ...
		
		return str;
	}
}
