package com.br.operator;

public class C_Arithmetic {

	/*
	 * 산술연산자(이항 연산자)
	 *  + - * / *
	   
	 * * / %  >  + - 
	 *  
	 */
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("덧셈 : " + (num1 + num2)); //13
		System.out.println("뺄셈 : " + (num1 - num2)); //7
		System.out.println("곱하기 : " + (num1 * num2)); //30 
		System.out.println("몫 : " + (num1 / num2)); //3 나누기했을 때의 몫
		System.out.println("나머지 : " + (num1 % num2)); //1 나누기했을 때의 나머지값

	}
	
	public void method2() {
		int a = 5;
		int b = 10;
		int c = (++a) + b; //a(6) + b(10) = c(16)
		int d = c / a; // c(16) / a(6) = d(2)
		int e = c % a; // c(16) % a(6) = e(4)
		int f = e++; //e(4)(++1예정) = f(4)
		int g = (--b) + (d--); // b(9) + d(2)(--1) = g(11)
		int h = 2; // h(2)
		int i =  a++ + b / ( --c / f) * (g-- - d) % (++e + h);
		//a(6)(++1) + b(9) / (15 / 4) * (11(--1) - 1) % (6 + 2)
		//a(6)(++1) + 6
		//12
		
		System.out.println(a); //a(6)(++1) = 7
		System.out.println(b); //9
		System.out.println(c); //15
		System.out.println(d); //1
		System.out.println(e); //6
		System.out.println(f); //4
		System.out.println(g); //11(--1) = 10
		System.out.println(h); //2
		System.out.println(i); //12

	}

}



