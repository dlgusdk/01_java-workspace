package com.br.run;

import com.br.first.A_MethodPrinter;

public class RunA {
	public static void main(String[] args) {
		//메소드 호출 ==메소드 실행/ 방벙: 메소드명();
		//methodA(); 같은 클래스만 이렇게 불러올 수 있음. 다른 클래스의 메소드는 호출 불가
		
		/*다른 클래스의 메소드 호출방법
		 * 1. 실행시키고자 하는 메소드가 있는 클래스를 생성(new)
		 * 표현법: 클래스명 사용할이름(임의) = new 클래스명();
		 
		 * A_MethodPrinter a = new A_MethodPrinter(); -에러. 기본적으로 같은 패키지 안에서 클래스를 찾는데 run에는 메소드프린터 클래스가 존재x
		 해결방법 1. 어떤 패키지에 속해있는지 정확히 제시(번거로움)
		 com.br.first.A_MethodPrinter a = new com.br.first.A_MethodPrinter();	 
		
		 해결방법 2. 해당 패키지의 클래스를 가져다 쓰겠다는 의미의 선언문(import) 기입
		 패키지와 클래스 선언의 사이에 작성. 
		 import com.br.first.A_MethodPrinter;
		 */
		 A_MethodPrinter a = new A_MethodPrinter(); 

		 /*2. 해당 클래스 내의 메소드 실행(호출)
		 * 표현법: 사용할이름.실행할메소드();
		 */
		 a.methodA(); 
		// a.methodB();
		// a.methodC();
		 
		
		
	}
}
