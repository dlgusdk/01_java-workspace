package com.br.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 * 삼항연산자
	 * [표현법] 조건식 ? : true일 경우 돌려줄 결과값 : false일 경우 돌려줄 결과값
	 * */
	
	public void method1( ) {
		//사용자에게 정수값 입력받아서 양수인지아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다 \n" : "양수가 아니다 \n";
		System.out.println(num + "는 " + result);
		//System.out.println(num + "는 " + (num > 0 ? "양수다 \n" : "양수가 아니다 \n"));    
	}

	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num1 = sc.nextInt();
		
		String result = num1 % 2 == 0 ? "짝수이다. \n" : "홀수이다. \n";
		System.out.println(num1 + "는 " + result);
		//System.out.println(num1 + "는 " + (num1 % 2 == 0 ? "짝수이다. \n" : "홀수이다. \n"));    	
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		//사용자에게 종료의사여부 입력받은 후 판별해서 출력

		System.out.print("종료하시려면 Y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == 'Y' || ch == 'y') ? ("프로그램을 종료합니다.") : ("계속 진행하겠습니다.");
		System.out.println(result);
		//System.out.println((ch == 'Y' || ch == 'y') ? ("프로그램을 종료합니다.") : ("계속 진행하겠습니다."));	
	}

	public void method4() {
		//입력받은 문자값이 영문자인지 아닌지 판별 및 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) ? "영문자입니다." : "영문자가 아닙니다.";
		//String result = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) ? "영문자입니다." : "영문자가 아닙니다.";
		System.out.println(result);
		//System.out.println((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90) ? "영문자입니다." : "영문자가 아닙니다.");;	

        }
	//삼항연산자 중첩 사용(입력한게 양수인지 0인지 음수인지 알려주는 것)
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수입니다." : (num == 0 ? "0입니다." : "음수입니다.");
		System.out.println(result);

	}

	public void method6() {
		//사용자에게 두개의 정수값을 받고
		// + 또는 -를 입력받아 그에 맞는 연산결과를 출력해주기
		//+일 경우 덧셈연산결과 출력, -일 경우 뺄셈결과 출력
		//연산자가 +,- 외일 경우 잘못입력했습니다 출력
		
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수를 입력해주세요 : ");
		int first = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("두번째 정수를 입력해주세요 : ");
		int second = sc.nextInt();

		sc.nextLine();

		System.out.print("연산자를 입력해주세요(+,-) : ");
		char op = sc.nextLine().charAt(0);
		
		String result = ((op == '-') ? first - second + " " : ((op == '+') ? first + second + " " : "잘못입력하셨습니다.")); 
		//숫자 계산 후 문자 자동형변환 
		System.out.println(result);
	}
	
}
