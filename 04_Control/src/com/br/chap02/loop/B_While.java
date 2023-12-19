package com.br.chap02.loop;

import java.util.Scanner;

public class B_While {

	/*
	 * [초기식;]
	 * while문
	 * while() {
	 * 	반복적으로 실행할 코드
	 *  [증감식;]
	 * }
	 * 조건식이 true일 경우 해당 코드 실행
	 */
	public void method1() {
		//안녕하세요 5번 출력
		
		int i = 1;
		while(i <= 5) {
			System.out.println("안녕하세요");
			i++;
			//System.out.println(i++ + "");
		}

		System.out.println(i);
	}
	
	public void method2() {
		//1 2 3 4 5 
		int i = 1;
		while(i <= 5) {
			System.out.print(i + " ");
			i++; 
			//System.out.print(i++ + " ");
		}		
	}
	
	public void method3() {
		//1~10까지 홀수만 출력
		int i = 1;
		while(i <= 10) {
			/*System.out.print(i + " ");
			i += 2;*/
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}

			i++; //증감연산자가 if안에 있으면 홀수일때만 1증가하므로 1만 출려된다.
		}
	}
	
	public void method4() {
		//1부터 랜덤값까지의(1~100사이) 총합계
		
		int random = (int)(Math.random() * 100 + 1); //1부터 100개의 랜덤값을 발생
		
		int sum = 0;
		int i = 1;
		while(i <= random) {
			sum += i++;
			//i++;
		}
		System.out.println("1에서부터 " + random + "까지의 총합계 : " + sum);
	}

	public void method5() {
		//사용자에게 문자열 입력받아 각 인덱스의 문자를 모두 추출해서 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		int i = 0;
		while(i<= str.length()-1) {
			System.out.println(str.charAt(i));
			i++;
		}
	}
	
	public void method6() {
		//무한반복
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n===== 메뉴  ======");
			System.out.println("1.안녕하세요 5번 출력");
			System.out.println("2.1부터 5까지 출력");
			System.out.println("3.1부터 10까지 홀수 출력");
			System.out.println("4.1부터 랜덤값까지 총합계 출력");
			System.out.println("5.문자열의 각 문자를 출력");
			System.out.println("0.프로그램 종료");
			System.out.print("\n메뉴입력 > ");
			int menu = sc.nextInt();
		
			switch(menu) {
			case 1:  method1(); break; //같은 클래스 안의 메소드일 경우 바로 호출가능
			case 2:  method2(); break;
			case 3:  method3(); break;
			case 4:  method4(); break;
			case 5:  method5(); break;		
			case 0:  System.out.println("이용해주셔서 감사합니다. 프로그램을 종료합니다."); return;
			default: System.out.println("메뉴 번호를 잘못 입력하셨습니다.다시 입력해주세요."); break;
			}
			
		}
	}
	
	public void method7() {
		
		/*do-while
		 * 
		 * do {
		 * 반복실행할 코드
		 * }while(조건식);
		 * 조건검사없이 무조건 처음에 한 번은 실행
		 * 
		 */
		
		int num = 1;
		do {
			System.out.println(num);
		}while(false);
	}
		
	public void method8() {
		//1부터 사용자가 입력한 수까지의 총 합계
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		}while(i<=num); //i가 num이 될 때까지 증가하고 num이 되면 실행 끝. 무조건 한 번 실행 후 조건검사를 나중에 함.
	
		System.out.print("1부터" + num + "까지의 총 합계 :" + sum);

	}

	public void method9() {
		//사용자에게 문자열 입력받고 해당 문자열의 길이 출력해주는걸 매번 반복
		//단, 사용자가 입력한 문자열이 "exit"과 일치할 경우 반복을 멈춤

		Scanner sc = new Scanner(System.in);
		
		String str = "";
		do {
			System.out.print("문자열 입력(종료를 원한다면 exit 입력) : ");
			str = sc.nextLine();	

			if(str.equals("exit")) {
				break;
			} else {
			System.out.println(str + "의 글자수는 " + str.length() + "글자 입니다.\n");
			}
		}while(!str.equals("exit")); //str이 exit가 아닐 경우 반복. 나중에 조건검사를 함.
	}
}