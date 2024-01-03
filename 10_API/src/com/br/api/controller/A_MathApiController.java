package com.br.api.controller;

public class A_MathApiController {
	public void mathMethodTest() {
		//java.lang.Math    
		
		//상수
		System.out.println("파이 : " + Math.PI);
		
		//절대값을 알고자 할 떄: abs
		int num1 = -10;
		System.out.println("절대값 : " + Math.abs(num1));
		//System.out.println("절대값 : " + (num1 < 0 ? -num1 : num1));
		/*
		 * 올림:coil
		 */
		double num2 = 4.349;
		System.out.println("올림 : " + Math.ceil(num2));
		
		//반올림 : round    
		System.out.println("반올림 : " + Math.round(num2)); 
		
		//버림 : floor  

		System.out.println("버림 : " + Math.floor(num2)); 
		
		//가장가까운 정수:rint  

		System.out.println("가장 가까운 정수값 : " + Math.rint(num2)); 
		
		//제곱근(루트) : sqrt
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		//제곱:pow
		System.out.println("2의 10제곱근 : " + Math.pow(2, 10));
		
		/*
		 * *Math 툭징
		 * 모든 필드는 상수필드, 모든 메소드는 static메소드로 
		 * ->프로그램 시작시 이미 static 메모리 영역에 올라가있음
		 * ->클래스명. 으로 접근해서 사용 
		 * 
		 * 생성자 private로 해둠
		 * 한 번만 메모리 영역에 올려두고 재사용하는 개념(싱글톤 패턴)
		 * 
		 * 
		 * 
		 */
	}
}
