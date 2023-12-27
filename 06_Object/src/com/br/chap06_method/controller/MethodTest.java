package com.br.chap06_method.controller;

public class MethodTest {
	
	/*
	 * <메소드>
	 * 한 기능을 처리하기 위해서 실행될 코드를 정의해두는 것
	 * 
	 * 접근제한자 [예약어] 반환값의 자료형 메소드명([매개변수, 매개변수,...]) {
	 * 	실행시킬 코드 ;
	 *  [return 반환값;]
	 * }
	 * 
	 */
	
	
	//1.매개변수 없고 반환값도 없는 메소드
	public void method1() {
		System.out.println("매개변수와 반환값 둘 다 없는 메소드");
		//return; //JVM이 자동 생성해줌
		
	}
	
	//2.매개변수 없고 반환값은 있는 메소드
	public String method2() {
		System.out.println("매개변수 없고 반환값은 있는 메소드");
		return "안녕하세요";
	}
	
	//3. 매개변수 있고 반환값은 없는 메소드
	/**
	 * @param num1
	 * @param num2
	 * 전달받은 두 수를 나눗셈 연산해서 결과를 출력
	 * 단, num2가 0일 경우 연산은 진행x.
	 */
	public void method3(int num1, int num2) {
		System.out.println("매개변수 있고 반환값은 없는 메소드");
		
		if(num2 != 0) {
			System.out.println("나눗셈 결과 : " + num1 / num2);
		}else {
			System.out.println("죄송하지만 0으로 나눌 수 없습니다.");
		}
		
	}
	
	
	//4. 매개변수도 있고 반환값도 있는 메소드
	//문자열과 정수값을 전달받아서 해당 문자열의 해당 정수인덱스의 문자값을 뽑아서 반환시켜주는 메소드
	public char method4(String str, int index) {
		System.out.println("매개변수와 반환값 둘 다 있는 메소드");
		
		if(index >= 0 && index < str.length()) {
			return str.charAt(index);
		}else {
			return ' ';
		}
	}
			
	
	//5.정수값 전달 받아서 양수가 아닌지, 맞다면 짝수인지 홀수인지를 판별해서 결과값을 반환
	/**
	 * @param num
	 * @return
	 */
	public String method5(int num) {
		if(num <= 0) {
			return "양수가 아니다";
		
		}else {
			if(num % 2 == 0) {
				return "짝수다";	
			}else {
				return "홀수다";
			}
		}
			
	}
	
	public static void staticMethod1() {
		System.out.println("매개변수x 반환값x static메소드");
	}
	public static int staticMethod2() {
		System.out.println("매개변수x 반환값O static메소드");
		//1 ~ 100 사이의 랜덤값 발생
		int random = (int)(Math.random() * 100 + 1);
		int sum = 0;
		for(int i=1; i<random; i++) {
			sum += i;
		}
		return sum;
	}
	
	//두 문자열을 전달받아서 일치하면 true, 아니면 false
	public static boolean staticMethod3(String str1, String str2) {

		/*
		 * if(str1.equals(str2) {
		 * 	return true;
		 * }else{
		 * 	return false;
		 * }
		 * 
		 */
		return str1.equals(str2);
	}
}
