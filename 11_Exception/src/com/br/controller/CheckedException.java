package com.br.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

	/*
	 * CheckedException
	 * -반드시 예외처리 구문을 작성해놔야하는 예외들(컴파일에러)
	 * -조건식 미리 제시해둘 수 없음(예측이 불가하기 때문)
	 * 보통, 외부 매개체(파일, db, 또다른 프로그램)와 입출력 할때 발생
	 * 
	 */
	public void method() throws IOException {//IOException에 떠넘긴다(위임)_IOException을 호출한 main메소드(ExceptionRun)로 떠넘김
		//Scanner와 같이 키보드로 값을 입력받을 수 있는 객체(단, 문자열로만 읽어들일 수 있음)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무거나 입력 : ");
		/*
		 * 1.try~catch문
		 * try{}: 예외가 발생될 구문을 작성
		 * catch(발생될 수 있는 예외클래스 매개변수){}  :try구문내에 다음과 같은 예외 발생시 실행시킬 구문 작성
		 * 
		 */
		/*try {
			String str = br.readLine();
			System.out.println(str + "의 글자수는 : " + str.length() + "입니다.");
		}catch(IOException e) {
			System.out.println("예외가 발생했습니다.");
		}*/
		
		//2.throws : 발생된 예외에 대해 여기서 처리하지 않고 떠넘기겠다라는 의미(위임한다)
		//해당 메소드를 호출한 곳으로 떠넘긴 것. ->그곳에서 예외처리를 하거나(try-catch) 거기서도 또 throws로 떠넘겨야함(결국은 처리해야함)
		String str = br.readLine();
		System.out.println(str + "의 길이는 : " + str.length() + "입니다.");
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	/*	예외클래스									|에러발생시점|	   예외처리
	 * UnCheckedException RuntimeExceptiong후손   |런타임에러| 		세모(개발사 케바케,조건, try~)
	 * CheckedException RuntimeException의 외  	|컴파일에러| 		필수(예외처리구문 반드시 기술)
	 */ 
}
