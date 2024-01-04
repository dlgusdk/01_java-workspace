package com.br.api.controller;

import java.util.Scanner;

public class C_WrapperApiController {
	
	/*
	 * Wrapper클래스
	 * -> 기본자료형을 객체로 포장해 줄 수 있는 클래스 
	 *
	 *기본자료형 <--> Wrapper 클래스
	 *boolean     Boolean(클래스라 대문자)
	 *char		  Character  
	 *byte		  Byte
	 *short		  Short
	 *int		  Integer
	 *long		  Long
	 *float  	  Float
	 *double	  Double
	 * 
	 * ->기본자료형을 객체로 취급해야되는 경우
	 *  -메소드 호출해야될 경우
	 *  -메소드 매개변수로 기본자료형이 아닌 객체타입을 요구할 때 
	 *  -다형성 적용시키고 싶을 때 
	 */
	
	public void boxingTest() {
		//Boxing : 기본자료형 ->Wrapper클래스 자료형(객체화)
		int num1 = 10;
		int num2 = 15;
		
		//System.out.println(num1.equals(num2));
		//1.객체생성을 통한 방법(jdk9버전이상부터 deprecated ->실행은 되나 언젠가 없어짐. 권장 x
		Integer i1 = new Integer(num1); //num1 -> i1
		Integer i2 = new Integer(num2); //num2 -> i2
		
		System.out.println(i1);
		System.out.println(i2/*.toString()*/); //15
		
		System.out.println(i1.equals(i2)); //false
		System.out.println(i1.compareTo(i2)); //두 값을 대소비교해서 앞의 숫자가 더 크면 1반환, 뒤의 숫자가 더 크면 -1, 일치하면 0을 반환

		//2.곧바로 대입하는 방법
		Integer i3 = num1; //10
		System.out.println(i3);
		
		//3.문자열 안의 숫자값을 Integer타입으로 변경하고자 할 떄 
		//String -> Integer
		Integer i4 = Integer.valueOf(10); // 문자 x
		System.out.println(i4); //10
		
	}
	
	public void unboxingTest() {
		//UnBoxing : Wrapper 클래스 자료형 -> 기본자료형
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(15); 	
	
		//1.해당 Wrapper클래스에 제공하는 xxxValue() 메소드 통해
		int num1 = i1.intValue();
		int num2 = i2.intValue();
		
		//2.곧바로 대입(AutoUnBoxing)
		int num3 = i1;

	}
	
	public void stringToPrimitive() {//문자열을 기본자료형화 시킬 때

		//웹개발하게 되면 화면으로부터 입력된 값 무조건 문자열로 넘어옴
		//즉, 사용자가 입력한 나이가 넘어올때 "20"과 같은 문자열로 넘어옴
		//"20" -> 20
		//"170.1" ->170.1
		
		//기본자료형 <-> 문자열
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); //문자열로 작업됨
		
		//1.String -> 기본자료형 (파싱한다)
		// "10"   -> 10
		// "15.3" ->15.3
		//해당 Wrapper클래스.parsexxx(변환시키고자하는 문자열) : 기본자료형
		Integer.parseInt(str1);
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		
		System.out.println(i + d);
		
		//2.기본자료형 -> String
		// 10 ->"10"
		//15.3 -> "15.3"
		//String.valueOf(변환시키고자하는 기본자료형값) : String
		
		String strI = String.valueOf(i); //10 ->"10"
		String strD = String.valueOf(d);
		
	}	
}
