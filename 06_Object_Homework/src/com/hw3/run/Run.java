package com.hw3.run;

import java.util.Scanner;

import com.hw3.controller.Funtion;

public class Run {
	public static void main(String[] args) {
		//1
		Funtion f = new Funtion();
		f.printLottoNumbers();	
		
		//2
		System.out.println("==================");
		Scanner sc = new Scanner(System.in);
		System.out.print("갯수입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("문자입력 : ");
		char str1 = sc.nextLine().charAt(0);
		
		f.outputChar(num, str1);
		
		//3
		System.out.println("==================");
		f.alphabette();
		
		//4
		System.out.println("\n==================");

		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("시작 인덱스 : ");
		int index1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("끝 인덱스 : ");
		int index2 = sc.nextInt();
		sc.nextLine();
		
		f.mySubstring(str, index1, index2);

	}
}
