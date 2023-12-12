package com.br.first;

public class A_MethodPrinter {
	//클래스마다 무조건 메인메소드 작성할 필요 없음. 다만, 실행은 안된다. 실행을 담당하는 메소드 존재x.실행을 담당하는 메소드는 주로 run 패키지 안에 있음.
	public void methodA() {
		System.out.println("메소드A 실행");
		methodB();
		methodC(); //methodA만 호출해도 B,C까지 다 호출된다.

	}
	
	public void methodB() {
		System.out.println("메소드B 실행");
	}
	
	public void methodC() {
		System.out.println("메소드C 실행");
	}
}