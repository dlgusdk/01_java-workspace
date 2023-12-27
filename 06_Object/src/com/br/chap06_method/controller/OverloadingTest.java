package com.br.chap06_method.controller;

public class OverloadingTest {

	//오버로딩: 한 클래스 내에 같은 메소드명으로 정의할 수 있는 것
	public void test() {
		
		
	}
	
	public void test(int a) {
		
		
	}
	
	public void test(int a, String s) {
		
		
	}
	
	public void test(String s, int a) {
		
	}
	
	public void test(int a, int b) {
		
	}

	//매개변수 명이랑은 상관없이 매개변수의 자료형, 갯수, 순서가 다르게 작성이 되어있어야만 한다.오버로드 성립 가능.(자료형이 중요!- 중복x)
	
	  public void test(String str) {
	      
	   }
	   
	   /*
	       public int test(String str) {
	    
	      return 0;
	   }
	   */
	   // 반환형이랑 상관없이, 무조건 매개변수가 달라야한다.
	   
	   /*
	   private void test(String str) {
	      
	   }
	   */
	   // 접근제한자와도 무관하다.
	   
	   // * 결론 : 오버로딩의 성립조건은
	   //        매개변수명, 접근제한자, 반환형을 다 떠나서
	   //        매개변수의 자료형, 갯수, 순서가 다르게 작성되어야 한다.
	   
	   

}
