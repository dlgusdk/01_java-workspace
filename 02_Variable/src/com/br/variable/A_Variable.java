package com.br.variable;

public class A_Variable {
	public void printValue() {
		System.out.println("변수 사용 전");
		
		System.out.println(10000 * 8);
		System.out.println(10000 * 8 * 5);
		System.out.println(10000 * 8 * 5 * 4);
		System.out.println(10000 * 8 * 5 * 4 * 0.1);

		//변수란: 어떠한 것을 메모리상에 기록하기 위한 박스, 공간
		int pay = 10000; //시급
		int hour = 8;   //하루 중 근무시간
		int day = 5; //일주일 중 근무일수
		int week = 4; //한 달 중 근무주수
		double tex = 0.1; //세금 10%
		
		System.out.println("변수 사용 후");
		
		System.out.println(pay * hour); //하루치 급여
		System.out.println(pay * hour * day); //일주일치
		System.out.println(pay * hour * day * week); //한달치
		System.out.println(pay * hour * day * week * tex); //내야할 세금
		
		System.out.println("시급 : " + pay + "원");
		//*변수 사용 이유
		// 값에 의미를 부여하기 위해 - 가독성이 좋아짐
		// 한 번 값을 저장해두고 계속 사용할 목적
		// 유지보수에 용이
		
	}
	
	public void declareVariable() {
		/*
		 * 변수 선언(==변수 만들기)
		 * 표현법: 자료형 변수명(임의);
		 
		 * 자료형: 어떤 값을 담을건지, 크기는 어느정도인지에 대한 변수의 크기 및 모양을 정하는 키워드
		 
		 * 주의할 점
		 * 변수명은 반드시 첫문자를 소문자로. 단, 여러단어 조합될 경우 낙타표기법
		 * 특정 영역{}에 동일한 변수명으로 선언 불가
		 * 해당영역에 선언된 변수는 그 영역에서만 사용가능(다른 메소드에서는 사용불가) 
		 
		 *  변수 선언 후 값 대입
		 *  표현법 : 변수명 = 값;
		 
		 * 변수 선언과 동시에 값 대입
		 * 표현법 : 자료형 변수명 = 값;   
		 */
		
		 //자료형 종류
		 //1.논리형 : true/false 참 거짓.논리값. 1byte 
		 //boolean bool; // 선언 후
		 //bool = true; //대입
		boolean bool = true; //선언과 동시에 대입
		
		System.out.println("bool의 값: " + bool);
		
		bool = false;
		bool = 1 + 3 < 2;
		 
		System.out.println("bool의 값: " + bool);
		
		//2.숫자형
		//2-1.정수형: byte(1), short(2), int(4), long(8)
		//2-2.실수형: float(4), double(8)
		byte bNum; //1byte
		bNum= -128; 
		
		short sNum = 30000; //2byte		
		int iNum =100000; //4byte;(정수형 기본값)
		long lNum =10000000000L;//8byte
			
	   //2-2.실수형
		float fNum = 4.12345679f; //소수점 6째자리까지 표현
		double dNum = 8.1234456677678676876; //실수형 기본형, 소수점 15째자리까지 표현
		
		System.out.println("sNum의 값 :" + sNum);
		System.out.println("iNum의 값 :" + iNum);
		System.out.println("lNum의 값 :" + lNum);

		System.out.println("bNum의 값 :" + bNum);
		
		System.out.println("fNum의 값 :" + fNum);
		System.out.println("dNum의 값 :" + dNum);

		
		//3.문자형
		//char(2)
		char ch = 'A';
		ch = '강';
		
		System.out.println("ch의 값 :" + ch);

		//---여기까지 기본자료형 
		
		//4.문자열(참조자료형)
		String str = "ABC";
		
		System.out.println("str의 값 :" + str);

		//번외(큰 값을 작성할 때 _사용가능
		int etc = 999_999_999;
		
		System.out.println("etc의 값 :" + etc);
		
		
		//변수 명명규칙
		int number;
		
		//1)변수명 중복시 에러발생(자료형 달라도 에러, 대소문자는 구분 가능)
		
		//2)예약어(자바에서 이미 사용되고 있는 키워드) 사용 불가
		//cher int; int true; int class; 등등
		
		//3)숫자가능. 단, 숫자로 시작은 안된다
		int age1;
		//int 1age;
		
		int number_1;
		int number$;
		int _number;
		int $number; //_,$ 를 제외한 특수문자 불가. 
		
		//여러 단어일 경우 붙여쓰고 두번째 단어부터 첫글자 대문자(낙타표기법)
		String username;
		String userName;//관례상 맞는 표현. 한글 가능하지만 권장x
		
	}
	
	public void constant() {
		//상수: 변수와같이 메모리상에 값을 기록하는 공간이지만 값이 변하지 않는 수. 변경불가. 
		//표현법:final 자료형 상수명;
		final int AGE = 20; //상수와 변수의 구분을 위해 상수는 대문자, 변수는 소문자로 주로 쓴다.
		
		System.out.println(Math.PI);
		//Math.PI = 2.11111;
		
	}
	
	//정리
	//값(data,리터럴):프로그램에 필요한 명시적 데이터 값 /또는 사용자가 마우스, 키보드 등으로 입력한 값
	//변수: 값(리터럴)을 메모리상에 기록하기 위한 박스, 공간. 한 개만 담을 수 있으며 값은 변경 가능.
	//상수: 변수와 같지만 값 변경 불가. 변수 구문 앞에 final붙임. 상수명은 다 대문자로 쓰는걸 권장
	//
	
	
	
	
}
