package com.br.operator;

import java.util.Scanner;

public class E_Logical {

	/*
	 * *논리연산자(이항연산자)
	 * 두 개의 논리값을 연산해주는 연산자 
	 * 논리연산한 결과값마저도 논리값임
	 
	 * 논리값 && 논리값 AND : 왼쪽, 오른쪽 둘 다 true여야만 true가 나온다. 하나라도 false면 false
	 * 논리값 || 논리값 OR : 하나만 true여도 참. 둘다 false여야 false
	 */
	
	
	public void mehod1() {
		//사용자ㅓ가 입력한 값이 1 ~ 100 사이의 값인지 확인
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		
		System.out.println((num >= 1) && (num <= 100));
		//&& ~이고, 그리고, ~ 하면서
		
	}
	public void mehod2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("사용자가 입력한 값이 대문자입니까 : " + ((ch >= 65) && (ch <= 90)));
		//boolean result = (ch >= 65) && (ch <= 90);
		//System.out.println("사용자가 입력한 값이 대문자입니까 : " + result);

	}
	
	public void mehod3() {
		//사용자에게 종료의사를 물어서 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.println("종료하시려면 y를 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		//|| ~이거나, 또는
		// 두 개의 조건 중 하나라도 만족하면 참, 최종 결과값은 true
		System.out.println("사용가자 입력한 값이 y또는 Y입니까 : " + result);

	}

	public void method4() {
		//사용자에게 성별 입력받은 후 남자인지 여자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 입력해주세요(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		boolean result = (gender == 'm') || (gender =='M');
		
		System.out.println("사용자는 남자입니까 : " + result);
		System.out.println("사용자는 여자입니까 : " + ((gender == 'f') || (gender =='F')));
		
	}
	
	public void method5( ) {
		int num = 10;
		
		boolean result1 = (num < 5 ) && (++num > 0); 
		System.out.println("result1 : " + result1);
		System.out.println("&&연산 후의 num : " + num);
		
		boolean result2 = (num < 20) || ( ++num > 0); //결과는 true 지만 ++num > 0를 실행할 필요없이 앞 조건이 참이기에 num값은 증가되지않는다.
		System.out.println(("result2 : ") + result2);
		System.out.println(("||연산 후의 num : ") + num);
	}
	
	public void method6( ) {

	int a = 2;
    int b = 3;
    
    boolean c = a > b;      //false
    boolean d = ++a <= b++; //true
    
    System.out.println("a : " + a); //3 
    System.out.println("b : " + b); //4
    System.out.println("c : " + c);  //false
    System.out.println("d : " + d);  //true
    
    System.out.println("c != d : " + (c != d)); //true
    
    System.out.println("b % a == 1 : " + (b % a == 1)); //true
    System.out.println("a == 3 && b == 4" + (a == 3 && b == 4)); //true 
    System.out.println("!d || a - b > 0 : " + (!d || a - b > 0));  //false
    
    System.out.println( !(c == d) && ( (a * b == 10) || (b % 2 == 0) ) ); //true
	
	}
	
}
