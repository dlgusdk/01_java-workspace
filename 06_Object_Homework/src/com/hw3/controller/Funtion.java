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
		System.out.print(c + "문자 " + num + "개 출력 : ");
		for(int i=1; i<=num; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
	//3
	public char alphabette() {
		int randomAl = (int)(Math.random() * 26);	//0부터 25까지 ->그래서 26까지라고 써야 z가 나온다
		int upper = ('A' + randomAl); // A = 65 에 25을 더한 값 Z=90까지의 범위로 설정
		int smallletter = ('a' + randomAl); //a=97 + 25를 한 값 z=122까지의 범위
		
			if (upper >= 'A' && upper <= 'Z') { // A 65 Z 90 대문자일때 
				System.out.print("랜덤 영문자 출력 : " + (char)upper);
		        return (char) upper;  //대문자일때 upper를 리턴

			}else if(smallletter >= 'a' && smallletter <= 'z'){ //소문자 a 97 z 122
				System.out.print("랜덤 영문자 출력 : " + (char)smallletter);
		        return (char) smallletter;//소문자일때 smallletter를 리턴

			}
			return '\0';//그 외에 null을 리턴 char형에서는 널문자를 '\0'이라고 쓴다. 값 없음.
		
	}
	
	public String mySubstring(String str, int index1, int index2) {
		String str1 = "";
		
		if(index1 > str.length() || index2 > str.length() || index1 < 0 || index2 < 0){
			return null; //받을 값 x
			
		}else {
		
			for(int i=index1; i<=index2; i++) { //index1 ~ index2범위만큼 설정
				str1 += str.charAt(i);			//i=index1이니까 str(index1)부터 
			}
	
			System.out.printf("%s의 %d번 %d번 인덱스 사이의 값 출력 : %s", str, index1, index2, str1);
				return str1; 
		
		}
		
	}
}
