package com.br.operator;

import java.util.Scanner;

public class F_Compound {
	
	/*
	 * 복합 대입 연산자
	 * 산술연산자와 대입연산자가 결합되어있는 형태 
	 * += -= /= %= *=
	 * a = a + 3;  -> a += 3; 
	 */
	
	public void method1() {
		int num = 12;
		
		num += 3; // num = num + 3;
		System.out.println("3 증가시킨 num : " + num);
		
		num -= 5;
		System.out.println("5 감소시킨 num의 값 : " + num);
		
		num *= 6;
		System.out.println("6배 증가시킨 num의 값 : " + num);

		
		num /= 2;
		System.out.println("2배 감소시킨 num의 값 : " + num);
		
		num %= 4;
		System.out.println("최종 num 값 : " + num);
	
		//특이케이스
		String str = "Hello";
		str = str + "World"; //str += "World";
	}
}
	
	
