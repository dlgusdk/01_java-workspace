package com.hw3.controller;

import org.graalvm.compiler.lir.aarch64.AArch64ArrayEqualsOp;

public class Funtion {
	//1
	public void printLottoNumbers() {
		System.out.print("랜덤 값 : ");

		for(int i=1; i<=6; i++) {
			int random = (int)(Math.random() * 45 + 6);
			System.out.print(random + " ");
			}
		System.out.println();
	}
	//2
	public void outputChar(int num, char c) {
		for(int i=1; i<=num; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
	//3
	public char alphabette() {
		int randomAl = ' ';
		if(randomAl <= 'Z' && randomAl >= 'A') {
		
			randomAl = (int)(Math.random() * 'Z' + 'A');
			return(char)(randomAl);
		
		}else if(randomAl <= 'z' && randomAl >= 'a') {
			randomAl = (int)(Math.random() * 'z' + 'a');
			return(char)(randomAl);
		}
		return(char)(randomAl);
						
	}
	
	//public String mySubstring(String str, int index1, int index2) {
		
	//}
}
