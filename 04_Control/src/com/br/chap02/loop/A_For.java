package com.br.chap02.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * <반복문> 특정 코드를 반복적으로 수행시켜주는 제어문
	 * 
	 * 크게 두 종류로 나뉨(for문/while문(do-while)
	 * 
	 * for문 for(초기식; 조건식; 증감식) { //반복 횟수를 지정하기 위해 제시 반복시키고자하는 구문; }
	 *
	 * 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행되는 구문"(보통 반복문 안에서 사용될 변수를 선언 및 초기화하는 구문)
	 *
	 * 조건식 : "반복문이 수행될 조건"을 작성. 조건식이 true일 경우 해당 구문 실행, 반대일경우 반복을 멈추고 빠져나옴 (보통 초기식에
	 * 제시된 변수를 가지고 조건식 작성)
	 *
	 * 증감식 : 반복문을 제어하는 변수 값을 증감시키는 구문(보통 초기식에 제시된 변수를 가지고 증감연산자 사용
	 *
	 * for(;;){ } 무한반복일 때 사용 for문 안에 초기식 조건식 증감식 생략 가능. 단, ;은 필수
	 */

	public void method1() {
		// "안녕하세요"를 5번 반복해서 출력
		for (int i = 1; i <= 5; i++) {
			System.out.println("안녕하세요");
		}

		for (int i = 0; i <= 4; i++) { // 0부터 4까지 1씩 증가되는 동안 반복
			System.out.println("true");

		}

		for (int i = 11; i <= 15; i++) {
			System.out.println("잘가세요");
		}

		for (int i = 1; i <= 9; i += 2) { // 1에서 (1,3,5,7,9) -> 5회 반복
			System.out.println("good");
		}

		for (int i = 0; i < 7; i++) { // 1에서 (1,3,5,7,9) -> 5회 반복
			System.out.println("goodbye");

		}
	}

	public void method2() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		for (int i=1; i<6; i++) {
			System.out.println(i);
		}

		for (int i=0; i<5; i++) {
			System.out.println(i + 1);
		}
	}

	public void method3() {
		// 5 4 3 2 1
		for (int i=5; i>=1; i--) {
			System.out.println(i);

		}

	}

	public void method4() {
		//1부터 10사이의 
		/*for(int i=1; i<=10; i+=2) {
			System.out.println(i + " ");
		}*/
		
		for(int i=1; i<=10; i++) { //10회 반복
			if(i % 2 == 1) {
			System.out.print(i + " ");
			}
		}
	}
	
	public void method5() {
		//1에서 10까지의 총 합계 출력
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		} 
		
		System.out.println("1에서부터 10까지의 총 합계 : " + sum);
		
	}
	
	public void method6() {
		//1에서부터 사용자가 입력한 수까지의 총 합계
		//1.사용자에게 값 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수 : ");
		int num = sc.nextInt();
		
		//2.총 합계 구하기
		int sum = 0;
		if(num > 0) {
			
			for(int i=1; i<=10; i++) {
			 sum += i;	
			}
			
		}else {
			System.out.print("양수로 입력해야합니다.");
		}
				
		//3.결과 출력
		//1에서 xx까지의 총 합계:xxx
		System.out.print("1부터 10까지의 총 합계 : " + sum);

	}
	
	public void method7() {
	//1부터 랜덤값	java.lang.Math 킄래스에서 제공하는 random()메소드. 
	//0.0 ~ 0.999999999 사이의 랜덤값 발생
	//특이사항: Math클래스 안의 메소드를 호출하려하면 Math.xxx() 
	
	//int random = Math.random(); //double형이라 안된다.
		//int random = Math.random() * 10; //0.0 ~ 10.0
		//int random = Math.random() * 10; //1.0 ~11.0
		int random =(int)(Math.random() * 10); //1<= <11
		
	/* tip. 랜덤값 발생 범위 지정
	 * (int)(Math.random() * 발생시킬랜덤값갯수 + 시작수)	
	 */
		
		
		int sum = 0;
		for(int i=1; i<=random; i++) {
			sum += i; 
		}
		
		System.out.println("1에서부터 " + random +"까지의 총합계 : " + sum);
	
	}
	
	public void method8() {
		String str = "Hello";
		
		//각 인덱스의 문자 뽑아서 출력
		/*
		 * H -> 출력(str.charAt(0));
		 * e -> 출력(str.charAt(1));
		 * l -> 출력(str.charAt(2);
		 * l -> 출력(str.charAt(3));
		 * o -> 출력(str.charAt(4));
		 * 
		 * 0번에서 4번 인덱스까지 1씩 증가
		 */
		
		for(int i=0; i<5; i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method9() {
		//사용자에게 문자열 입력받아 각 인덱스의 문자를 모두 추출해서 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		for(int i=0; i<=(str.length())-1; i++) { //i<str.length()
			System.out.println(str.charAt(i));
		}
	}
	
	public void method10() {
		//2단 출력 2 x 1 = 2 ~
				
		for(int i=1; i<=9; i++) {
			System.out.printf("2 x %d = %d\n", i, i * 2);
		}
	}
	
	public void method11() {
		//사용자에게 출력하고자하는 단을 입력받고(정수)
		//2~9사이의 정수맇 경우 -> 해당 단을 출력
		//그게 아닐 경우 -> 2~9사이의 숫자를 입력해야합니다 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단(2~9)을 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 2 && num <= 9) {
		
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d\n", num, i, num * i);
			}
			
		}else {
			System.out.println("2에서 9사이의 숫자를 입력해야합니다.");
		}		
	}

	public void method12() {
		//2부터 9사이의 랜덤 단을 출력
		
		int random =(int)(Math.random() * 8 + 2);	//
		
		System.out.println("===== " + random + " =====");
			
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d\n", random, i, random * i);
			}
			
		}		
	
	//중첩 for문
	public void method13() {
		//1 2 3 4 5 세 번 출력
		
		for(int j=1; j<=3; j++) {
			
			for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
			}
			
			System.out.println();
		}
	}
	
	public void method14() {
		for(int j=1; j<=4; j++) {		
		
			for(int i=1; i<=4; i++) {
				System.out.printf("%c", '*');
			}
			
			System.out.println();
		}
	}
	
	public void method15() {
		for(int j=1; j<=4; j++) {		
			
			for(int i=1; i<=4; i++) {
				
				if(j == i) {
					System.out.print(i);
				}else
					System.out.print('*');
			}
			
			System.out.println();
		}
	}
	
	public void method16() {
		//2~9단 출력 1씩 증가 
		//홀수단만 출력
		
		for(int j=2; j<=9; j++){

			if(j % 2 == 1) {
				System.out.println("=====" + j + "=====");

				for(int i=1; i<=9; i++) {
					System.out.printf("%d x %d = %d\n", j, i, j * i);
				}
			}
			System.out.println();
		}
	}
	
	public void method17() {
		//0시 0분 ~ 0시 59분까지 출력 -> 1시 0분 ~ 1시 59분 -> 23시~ 까지 출력
		
		for(int time=0; time<=23; time++) {
			System.out.println("==" + time + "시 ==");

			for(int min=0; min<=59; min++) {
				System.out.printf("%d시 %d분\n", time, min);
			}
			
			System.out.println();
		}
		
	}
	
	public void homework() { 
	      /*
	      아래와 같은 형식으로 출력될 수 있도록 중첩 for문을 작성해오시오.
	      (5행 10열짜리 *을 먼저 출력해놓고 거기서 응용한다고 생각해보시오)
	      
	      **********
	      *        *
	      *        *
	      *        *
	      **********

	      */
		for(int j=1; j<=5; j++) {		
			
			for(int i=1; i<=10; i++) {
				
				if(j == 2 && (i >= 2 && i < 10)) {
					System.out.print(" ");
				}else if(j == 3 && (i >= 2 && i < 10)) {
					System.out.print(" ");
				}else if(j == 4 && (i >= 2 && i < 10)) {
					System.out.print(" ");
				}else
					System.out.print('*');
			}
			
			System.out.println();
		}
	}
}


	
	
