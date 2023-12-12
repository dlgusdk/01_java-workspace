package com.br.pratice.example;

import java.util.Scanner;

public class VariablePractice {
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번재 정수를 입력하세요 : ");
		int first = sc.nextInt();
		
		System.out.print("두 번재 정수를 입력하세요 : ");
		int second = sc.nextInt();

		int add = (first + second);
		int sub = (first - second);
		int mul = (first * second);
		int div = (first / second);
		
		System.out.println();
		
		System.out.println("더하기 결과 : " + add );
		System.out.println("빼기 결과 : " + sub);
		System.out.println("곱하기 결과 : " + mul);
		System.out.print("나누기 결과 : " + div);

	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 값을 입력하세요 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 값을 입력하세요 : ");
		double height = sc.nextDouble();

		double area = (width * height);
		double circumference = (width + height) * 2;
		
		System.out.println();

		System.out.println("면적 : " + area );
		System.out.println("둘레 : " + circumference );

	}
	
	
	
	
	
	
}
