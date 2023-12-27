package com.hw3.run;

import java.util.Scanner;

import com.hw3.controller.Funtion;

public class Run {
	public static void main(String[] args) {
		//1
		Funtion f = new Funtion();
		f.printLottoNumbers();	
		
		//2
		/*System.out.println("==================");
		Scanner sc = new Scanner(System.in);
		System.out.print("갯수입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("문자입력 : ");
		char str = sc.nextLine().charAt(0);
		
		f.outputChar(num, str);
		*/
		//3
		System.out.println("==================");
		System.out.println(f.alphabette());
		
		
	}
}
