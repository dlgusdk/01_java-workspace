package com.br.variable;

public class D_Printf {
	public void printfTest() {
		//System.out.printf("내가출력하고자하는형식(포맷)", 출력하고자하는 값(변수나 상수도 가능));
		//:내가 나열한 값들을, 내가 제시한 형식대로 출력만(줄바꿈 x) 해주는 역할.
		
		/*
		 * *포멧 안에서 쓸 수 있는 키워드
		 * %d 정수형
		 * %s 문자열
		 * %c 문자형
		 * %f 실수형
		 */
		
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		System.out.println(iNum1 + " " + iNum2);
		System.out.printf("%d %d%%   \n", iNum1, iNum2);
		
		System.out.printf("%5d\n", 3000);
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", 10);
		//양수잘성시 : 해당 수만큼의 칸수를 확보 한 후 오른쪽 정렬, 음수는 반대

		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%.3f %.1f\n", dNum1, dNum2);
		//%f는 소수점아래 6째까지 표현
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s %s \n", ch, str, ch);
		System.out.printf("%C %S\n", ch, str);


		
	}
	
	
	
	
	
	
	
}
