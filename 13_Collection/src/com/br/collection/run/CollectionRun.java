package com.br.collection.run;

import com.br.collection.A_ListConrtoller;

public class CollectionRun {
	/*
	 * 1.컬렉션이란
	 * "자료구조"를 담당하는 "프레임워크"로 자료구조가 내장되어있는 자바클래스
	 * 
	 * >자료구조
	 * 방대한 데이터들을 효울적(구조적)으로 관리할 수 있는 개념(조회, 정렬, 추가, 삭제, 수정)할 수 있는 것.
	 * 
	 * >프레임워크 
	 * 데이터나 기능들을 보다 쉽게 사용할 수 있도록 제공하는 틀
	 * 
	 * 2.배열과 컬렉션(배열의 단점 vs 컬렉션의 장점)
	 * >배열
	 * -크기에 제약이 많음(크기 지정 필수, 한번 지정된 크기 변경 불가)
	 * -중간 위치에 추가하거나 삭제하는 경우 값을 땡겨주는 알고리즘을 직접 구현해야 됨. ->이미 메소드로 제공하고 있기때문에 단지 호출하면 됨
	 * -여러 타입의 데이터들을 저장 가능
	 * 
	 * >컬렉션
	 * -크기에 제약이 없음(크기지정 안해도 됨,알아서 크기 변경)
	 * 
	 * 3. 컬렉션의 종류 
	 * >List계열
	 * -데이터(value)만 저장
	 * -순서유지(index의 개념있음)
	 * -중복된 데이터 허용
	 * 
	 * >set계열
	  -데이터(value)만 저장
	 * -순서유지 x(index의 개념없음)
	 * -중복된 데이터 허용 x
	 * 
	 * >Map계열
	 * -키값(key)과 데이터를 함께 저장
	 * -순서 유지 x (index의 개념은 없지마 key값이 대신함)
	 * -키값이 중복될 수 없음(단, value는 중복될 수 잇음)
	 */
	public static void main(String[] args) {
		A_ListConrtoller a = new A_ListConrtoller();
		a.arrayListTest();
		
		//B_SetController b = new B_SetController();
		//b.hashSetTest2();
		
		//C_MapController c = new C_MapController();
		//c.propertiesTest2();
	}
	
}
