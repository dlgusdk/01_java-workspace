package com.br.operator;

public class B_InDecrease {
	
	/*
	 * *증감연산자 (단항연산자)
	 * ++ : 변수에 담긴 값을 1 증가시켜주는 연산자
	 * 	++변수 변수++
	 * 
	 * -- : 변수에 담긴 값을 1 감소시켜주는 연산자
	 * 	--변수 변수--
	 * 
	 * (증감연산자)변수 : 전위연산 -> "선증감" 후 처리
	 * 변수(증감연산자) : 후위연산 -> 선처리 "후증감"
	 */
	
	public void method1() {
		int num =5;
		num++; //++num;	//num = num + 1;
		
		System.out.println("최종 num : " + num);
		
		System.out.println();
		
		//전위형
		int num1 = 10;
		System.out.println("최초 num1 : " + num1);
		System.out.println("1회 수행 후 : " + ++num1); //num1에 ++1 실행 후 num1 출력 ->11
		System.out.println("2회 수행 후 : " + ++num1);
		System.out.println("3회 수행 후 : " + ++num1);

		System.out.println();

		//후위형
		int num2 = 10;
		System.out.println("최초 num2 : " + num2);
		System.out.println("1회 수행 후 : " + num2++); //num2 실행 및 출력 후 ++1 ->10(다음 구문 실행 시 ++1될 예정)
		System.out.println("2회 수행 후 : " + num2++);
		System.out.println("3회 수행 후 : " + num2++);
		System.out.println("최종 num2 : " + num2);

	}
	
	public void method2() {
		
		int a  = 10;
		int b = ++a; // a가 11로 변하고 b도 11이 된다.
		
		//a : xx, b : xx
		System.out.printf("a : %d, b : %d \n", a, b);
		
		int c  = 10;
		int d = c++; //c는 후위라 변하지않고 d는 변하지않은 c값이 담겨 10이 된다. 실행 후 c는 1 증가	
	
		System.out.printf("c : %d, d : %d \n", c, d); 
		
	}
	
	public void method3() {
		int num1 = 20;
		int result = ++num1 * 3; //21 * 3 = 63
		
		System.out.println(num1 + " " + result);
		
		int num2 = 20;
		int result2 = num2++ * 3; // 20 * 3 = 60(result2) 후 num2 = 21
		
		System.out.println(num2 + " " + result2);

	}
	
	public void method4() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); //10 (++1예정)
		System.out.println((++a) + (b++)); // (11+1) + 20(++1예정) = 32
		System.out.println((a++) + (--b) + (--c)); // 12(++1예정) + (21-1)20 + (30-1)29 = 61
		
		System.out.println("a : " + a); //13
		System.out.println("b : " + b); //20
		System.out.println("c : " + c); //29

		
		
	}
	
}
