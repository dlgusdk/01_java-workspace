package com.br.chapter01.condition;

import java.util.Scanner;

	public class A_If {
	
	/*
	 * 기본적으로 위에서 아래로 순차적으로 진행되는 흐름을 직접 제어할 수 있음 -> 제어문 활용
	 
	 * 선택적으로 실행하는 선택문 -> 조건문
	 * 반복적으로 실행하는 실행문 -> 반복문
	 * 그 외의 흐름을 제어할 때 -> 분기문 
	 
	 * 조건문
	 * 조건식을 통해 참이나 거짓이냐를 판단해서 해당 조건에 만족할 경우 해당하는 구문 실행
	 
	 * 조건문 종류
	 * 1.if문 - (단독 if문, if-else, if- else if)
	 * 2.swich문
	 */
	
	
	public void method1() {
		/*단독 if문
		 * 
		 * if(조건식) {
		 *  조건식이 참일 경우 실행할 구문
		 * }
		 * 
		 * 조건식이 true일 경우 -> 중괄호 블럭 안의 코드 실행 후 빠져나감
		 * 조건식이 false일 경우 -> 중괄호 블럭 안의 코드 무시
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
		System.out.println("양수다.");
		}
		
		if(num < 0 ) {
		System.out.println("양수가 아니다.");
		}
		
	}
		public void method2() {
			/*if-else
			 * 
			 * if(조건식) {
			 *  실행코드1
			 * }else {
			 * 실행코드 2
			 * }
			 * 
			 * 조건식이 true일 경우 실행코드 1을 실행 후 if-else문 빠져나감
			 * 단 조건식일 false 일 결우 무조건 실행코드 2 실행
			 * */
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if(num > 0) {
				System.out.println("양수다.");
			}else {
				System.out.println("양수가 아니다.");
			}
	}
		public void method3() {
			/*
			 * if-else if문
			 * 같은 비교대상으로 여러개의 조건을 제시해야하는 경우
			 
			 * if(조건식1) {
			 * 	실행코드1
			 * }else if(조건식2) {
			 * 	실행코드2
			 * }else(생략가능) {
			 *  실행코드3(다 false일 경우 실행)
			 * }
			 * */
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num > 0) {
				System.out.println("양수다.");
			}else if (num == 0) {
				System.out.println("0이다.");
			}else {
				System.out.println("음수다.");
			}
		}
	
			public void method4() { 
				Scanner sc = new Scanner(System.in);
			
				System.out.print("나이(정수만) : ");
				int age = sc.nextInt();
			
				if(age <= 13) {
					System.out.println("어린이");
				}else if(age > 13 && age < 19) {
					System.out.println("정소년");
				}else {
					System.out.println("성인");
				}				
			}
			
			public void method5() {  
				Scanner sc = new Scanner(System.in);
				
				System.out.print("나이(정수만) : ");
				int age = sc.nextInt();
				
				String result; //결과값을 저장할 변수 세팅
				if(age <= 13) {
					result = "어린이";
				}else if(age <= 19) {
					result = "청소년";
				}else {
					result = "성인";
				}				
			
				System.out.println(result);
			}
			
			public void method6() {
				Scanner sc = new Scanner(System.in);
				
				System.out.print("이름 : ");
				String name = sc.nextLine();
								
				System.out.print("성별(M/F) : ");
				char gender = sc.nextLine().charAt(0);
				
				/*if(gender == 'M' || gender == 'm') {
					System.out.println(name + "은 남학생이다.");
				}else if(gender == 'F' || gender == 'f') {
					System.out.println(name + "은 여학생이다.");
				}else {
					System.out.println("잘못입력하셨습니다.");
				}*/
				
				String result = " ";
				if(gender == 'M' || gender == 'm') {
					result = "남학생";
				}else if(gender == 'F' || gender == 'f') {
					result = "여학생";
				}else {
					System.out.println("잘못입력하셨습니다.");
					return; //빠져나가겠다, 현재 속해있는 메소드를 빠져나가는 구문
				} 

				
				System.out.println(name + "님은 " + result + "입니다.");
			}
			public void method7() {
				Scanner sc = new Scanner(System.in);
				
				System.out.print("이름을 입력해주세요 : ");
				String name = sc.nextLine();
				
				/*if(name == "홍길동") {
					System.out.println("홍길동님 반갑습니다.");
				}else {
					System.out.println("홍길동님이 아니신가보네요. 안녕히가세요.");
				}*/
				
				/*
				 * 기본자료형들 끼리는 ==, !=과 같은 동등비교연산자 사용가능.
				 * 참조자료형인 String은 ==, != 은 정상적으로 비교안된다.
				 *  ->equals()메소드를 이용해서 비교해야함
				 *  문자열.equals(문자열)
				 *  !문자열.equals(문자열) 일치하지않는 경우
				 * 
				 */
				
				if("홍길동".equals(name)) {
					System.out.println("홍길동님 반갑습니다.");
				}else {
					System.out.println("홍길동님이 아니신가보네요. 안녕히가세요.");
				}
					
			}
			
			//조건문 중첩사용
			public void method8() {
				//사용자에게 정수입력받아서 양수가 아닐 경우 양수가 아닙니다 출력
				//양수일 경우 3의 배수라면 3의 배수입니다, 아닌경우 3의 배수가 아닙니다 출력
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("정수(양수)를 입력하세요 : ");
				int num = sc.nextInt();
				
				if(num > 0) {

					if(num % 3 == 0) {
						System.out.println("3의 배수입니다.");
					}else {
						System.out.println("3의 배수가 아닙니다.");
					}
					
				}else {
					System.out.println("양수가 아닙니다.");
				}
			}
			
			public void method9() {
				//사용자에게 -포함한 주민번호를 받고
				//-포함하여 잘 입력했을 경우 성별판별해서 여자인지 남자인지 출력
				//-불포함했거나 잘못입력하면 -포함해서 입력해주세요 출력
				Scanner sc = new Scanner(System.in);
				
				System.out.print("주민번호를 입력하세요(-포함) : ");
				String str = sc.nextLine();
				
				//주민번호값의 길이가 14글자일 경우
				if(str.length() == 14) {
					
					char genderNum = str.charAt(7);
					
					if(genderNum == '1' || genderNum == '3') {
						System.out.println("남자");
					}else if(genderNum == '2' || genderNum == '4') {
						System.out.println("여자");
					}else {
						System.out.println("-포함 잘 입력하셨으나 성별을 잘못입력하셨습니다.");
					}
					
				}else {
					System.out.println("-를 포함해서 입력해주세요.");
				}
			}
			
			
			
		}
			
			
			
			
			

			
				
		
			

