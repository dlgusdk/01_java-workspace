package javaTest_이현아.test.controller;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		if(num1 > 0 || num1 <= 9 || num2 > 0 || num1 <= 9 ) {
			if(num1 * num2 >= 0 && num1 * num2 <= 10) {
				System.out.print("한 자리 수입니다.");
			}else if(num1 * num2 < 100 && num1 * num2 >= 10){
				System.out.print("두 자리 수입니다.");
			}
		}	
	}	
}
