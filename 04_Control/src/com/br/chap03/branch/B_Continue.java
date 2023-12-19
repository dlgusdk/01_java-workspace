package com.br.chap03.branch;

public class B_Continue {
	/*
	 * continue;실행시 곧바로 현재 속해있는 반복문 위로 올라간다 
	 * 
	 */
	
	public void method1() {
		//1부터 10까지 홀수
		//1 3 5 7 9
		
		/*for(int i=1; i <=10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}*/
			
		for(int i=1; i<=10; i++) {
			
			if(i % 2 == 0) {
				continue; // 반복문 내의 뒤에 있는 구문들은 실행되지 않고 반복문 위로 올라감. 
			}
			System.out.print(i + " ");
		}
	}
	
	public void method2() {
		//1부터 100까지의 총 합계
		//단 6의 배수값은 빼고 덧셈 연산

		int sum = 0;
		for(int i=1; i<=100; i++) {
			
			if(i % 6 == 0) {
				continue;
			}
			
			sum += i;
		} 
		System.out.println("총 합계 : " + sum);
	}
	
	public void method3() {
		//2 ~ 9단까지 출력
		//단, 3의 배수단은 제외하고 출력
		
		//2단 -> 곱해지는 수 1 ~ 9
		//3ㄷㅏ ㄴㄴ..
		
		for(int dan=2; dan<=9; dan++) {
			System.out.println("===" + dan + "단 ===");
			for(int su=1; su<=9; su++) {
				System.out.printf("%d x %d = %d\n", dan, su, dan * su);
		}
			System.out.println();

		}
	}
}


	
	

