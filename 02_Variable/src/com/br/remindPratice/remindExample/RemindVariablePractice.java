package com.br.remindPratice.remindExample;

import java.util.Scanner;


public class RemindVariablePractice {
	public  void method1() {
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
	
		System.out.printf("키 %.1f인 %d살 %c %s님 반값습니다^^", height, age, gender, name);
		
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int first = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int second = sc.nextInt();	
		
		int sub = first - second;
		
		System.out.printf("더하기 결과 : %d \n", first + second);
		System.out.printf("빼기 결과 : %d \n", sub);
		System.out.printf("곱하기 결과 : %d \n", first * second);
		System.out.printf("나누기 몫 결과 : %d \n", first / second);

	}
	
	public void method3 ( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		double area = width * height;
		
		System.out.printf("면적 : %.2f \n", area);
		System.out.printf("둘레 : %.1f \n", (width + height) * 2);
		
	}
	
	public void method4( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String word = sc.nextLine();

		char second = word.charAt(1);
		char force = word.charAt(3);
		
		System.out.printf("첫 번째 문자 : %c \n", word.charAt(0));
		System.out.printf("두 번째 문자 : %c \n", second);
		System.out.printf("세 번째 문자 : %s \n", word.charAt(2));
		System.out.printf("네 번째 문자 : %s \n", force);

		
	}
}
