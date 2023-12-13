package com.br.pratice.example;

import java.util.Scanner;

public class VariablePractice {
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이을 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine(); //비워주기
		
		
		
		System.out.print("성별을 입력하세요(F/M) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("키 " + height + "인 " + age +"살 남자 " + name + "님 반갑습니다^^");

	}
	
	
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
	
	public void method4() { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String word = sc.nextLine(); //문자열을 가져와서 변수에 할당 후 인덱스 값을 뽑아내야함.
		
		char first = word.charAt(0);  //char first = sc.nextLine.charAt(0);가 안되는 이유는 첫번재 문자를 가져와 변수에 할당하려는 것이기 때문.
		char second = word.charAt(1);
		char Third = word.charAt(2);

		System.out.println("첫 번째 문자 : " + first);
		System.out.println("두 번째 문자 : " + second);
		System.out.println("세 번째 문자 : " + Third);

	}

	public void inputProduct() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== 상품등록화면 ===== ");
		System.out.println("등록하고자 하는 상품의 정보를 입력하시오");

		
		System.out.print("상품명 : ");
		String product = sc.nextLine();
		
		System.out.print("브랜드명 : ");
		String brand = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();

		sc.nextLine();
		
		System.out.print("제조국가 : ");
		String nation = sc.nextLine();
	
		System.out.print("할인율: ");
		double dc = sc.nextDouble();
		
		sc.nextLine();

		System.out.print("x등급(A~D): ");
		char grade = sc.nextLine().charAt(0);
 
		System.out.println();

		System.out.println("상품명 : " + product);
		System.out.println("브랜드명 : " + brand);
		System.out.println("가격 : " + price + "원");
		System.out.println("제조국가 : maid in " + nation);
		System.out.println("할인율 : " + (int)(dc * 100) + "%");
		System.out.println("x등급 : " + grade + "등급");

	}

	
	
	
	
}
