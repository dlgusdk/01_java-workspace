package javaTest_이현아.test.controller;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
			
		if(num1 < 0 || num1 >= 10 || num2 < 0 || num1 >= 10 ) {
			System.out.print("잘못 입력하셨습니다.");
		}else if(num2 == 0){
			System.out.printf("나누기 : %d\n", 0);
		}else
			System.out.printf("합 : %d\n", num1 + num2);
			System.out.printf("차 : %d\n", num1 - num2);
			System.out.printf("곱 : %d\n", num1 * num2);
			System.out.printf("나누기 : %d\n", num1 / num2);
		}
		
	}



