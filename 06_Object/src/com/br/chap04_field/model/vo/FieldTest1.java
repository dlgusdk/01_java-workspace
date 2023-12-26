package com.br.chap04_field.model.vo;

public class FieldTest1 { //클래스영역 시작

	/*
	 * 변수구분
	 * 
	 * -전역 변수 : 클래스 영역에 바로 선언한 변수
	 * -지역변수: 클래스 내의 어떤 특정한 구역({})에 선언한 변수 -> 선언된 해당 그 영역에서만 사용 가능
	 *  *특정한 구역: 메소드{}, 제어문(if/for) {}등등
	 * 
	 * >>라이프 사이클(메모리 상에 할당 또는 소멸되는 시점)
	 * 1.전역변수
	 * -멤버변수 ==필드 == 인스턴스변수
	 * 	생성시점 : new 연산자를 통해서 객체 생성시 메모리에 할당 
	 *  소멸시점: 객체 소멸시 같이 소멸

	 * 
	 * -클래스 변수 == static 변수
	 * 	생성시점 : 프로그램 실행(객체생성이 안되도)과 동시에 무조건 메모리 영역에 할당
	 *  소멸시점: 프로그램 종료시 소멸
	 * 
	 * 2.지역변수
	 * 	생성시점: 지역변수가 속해있는 특정 구역이 실행시
	 *  소멸시점: 특정 구역 종료시 소멸
	 */
	
	private int global;
	
	{//초기화블럭(객체 생성시 진행됨)
	global = 100;
	System.out.println("안녕");}
	
	public void test(int num) { //test메소드 영역 시작
		//매개변수(일종의 지역변수 즉,메소드 영역 내에서만 쓸 수 있음)
		
		//지역변수(메소드 영역내에 선언) -> 접근제한자 쓰는거 아님
		int local = 10; //남는공간이 있을 수 있기 때문에 직접 초기화 해줘야함
		
		//멤버변수 출력
		System.out.println(global);
		
		//매개변수 출력
		System.out.println(num);
		
		//지역변수 출력
		System.out.println(local);
		
		
		FieldTest2 f2 = new FieldTest2();
		System.out.println(f2.pub);
		System.out.println(f2.pro); //같은 패키지이기에 접근 가능
		System.out.println(f2.def); //같은 패키지이기에 접근 가능
		System.out.println(f2.pri);
		
	}//test메소드 영역 끝
	
}//클래스영역 끝
