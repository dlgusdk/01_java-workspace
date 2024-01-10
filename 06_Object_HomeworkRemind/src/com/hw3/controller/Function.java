package com.hw3.controller;

public class Function {

	public void printLottoNumbers() {
		
		int rd = 0;		
		for (int i=0; i<6; i++) {
			rd = (int)(Math.random() * 45 + 1);
			System.out.print(rd + " ");
		} 
	}
	
	public void outputChar(int num, char c) {
		System.out.print(c + "문자 " + num + "개 출력 : ");
		for(int i=0; i<num; i++) {
			System.out.print(c + " ");
		}
		
	}
	
	public char alphabette() {
		
	//		Math.random() * 90 + 65 => 25
	//	Math.random() * 122 + 97  => 25
	 int ran = (int)(Math.random() * 26);
	 int upper = 'A' + ran; //Z
	 int down = 'a' + ran; //z

	 if(down >= 'a' && down <= 'z') {
		System.out.print("랜덤 영문자 출력: " + (char)down);
		    return (char)down;
		    	
	 }else if(upper >= 'A' && upper <= 'Z') {
	 	System.out.print("랜덤 영문자 출력: " + (char)upper);
	    	return (char)upper;
	 }
	 return ' ';
			
	}
	
	public String mySubstring(String str, int index1, int index2) {
		return str;
		
	}
}
