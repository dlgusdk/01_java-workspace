package javaTest_이현아.test.controller;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 100) {
	
			if(num % 2 == 0) {
				System.out.print("2의 배수입니다.");
			}else {
				System.out.print("2의 배수가 아닙니다.");
			}
			
		}	
	}
}
