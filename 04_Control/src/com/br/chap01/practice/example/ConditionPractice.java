package com.br.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");

		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = "";
		switch(num) {
		case 1: result  = "입력"; break;
		case 2: result  = "수정"; break;
		case 3: result  = "조회"; break;
		case 4: result  = "삭제"; break;
		case 9: break;
		}
		
		if (num != 9) {
			System.out.println(result + " 메뉴입니다.");
		} else if (num == 9) {
			System.out.println("프로그램이 종료됩니다.");
		}
	}
	
	public void practice2(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();

		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수다.");
			}else {
				System.out.println("홀수다.");
			}
		
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}

	public void practice3(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int language = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		
		int add = language + math + english;
		double aver = (language + math + english)/3.0;
		
		if(add >= 40) {
			if(aver >= 60) {
				System.out.printf("국어 : %d \n", language);
				System.out.printf("수학 : %d \n", math);
				System.out.printf("영어 : %d \n", english);
				System.out.printf("합계 : %d \n", add);
				System.out.printf("평균 : %.1f \n", aver);
				System.out.println("축하합니다, 합격입니다!");
			}else {
				System.out.printf("국어 : %d \n", language);
				System.out.printf("수학 : %d \n", math);
				System.out.printf("영어 : %d \n", english);
				System.out.printf("합계 : %d \n", add);
				System.out.printf("평균 : %.1f \n", aver);
				System.out.println("불합격입니다.");
			}
			
		}else {
			System.out.println("불합격입니다.");
		}
	}

	public void practice4(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 12사이의 정수 입력 : ");
		int month = sc.nextInt();

		String season = "";
		/*if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			} else if(month >= 3 && month <= 5) {
			season = "봄";
			} else if(month >= 6 && month <= 8) {
			season = "여름";
			} else if(month >= 9 && month <= 11) {
			season = "가을";
			} else {
			season = "해당하는 계절이 없습니다.";
			}*/
		
		switch(month) {
		case 1: case 2: case 12:
			season ="겨울"; break;
			
		case 3: case 5:
			season ="봄"; break;

		case 6: case 8: case 7:
			season ="여름"; break;
			
		case 9: case 11:
			season ="가을"; break;
		default: System.out.println(month + "은 잘못 입력된 달입니다."); return;
		}
		
		System.out.printf("%d월은 %s입니다.", month, season);
		
	}

	public void practice5(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		int pass = sc.nextInt();
		
		
		if(id.equals("boram")) {
			if(pass == 1234) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}  
	
		public void practice6() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("권한을 확인하고자 하는 회원 등급 : ");
			String grade = sc.nextLine();
			
			switch(grade) {
			case "관리자": System.out.println("회원관리, 게시글 관리");
			case "회원": System.out.println("게시글 작성, 댓글 작성");
			case "비회원": System.out.println("게시글 조회"); break;
			default: System.out.println("잘못 입력했습니다."); return;   
			}
		}
		
		public void practice7(){
			Scanner sc = new Scanner(System.in);
			
			System.out.print("키(cm)를 입력해주세요 : ");
			double height = sc.nextDouble();
			
			sc.nextLine();
			
			System.out.print("몸무게(kg)를 입력해 주세요 : ");
			double weight = sc.nextDouble();

			double bmi = weight / (height * height);
			
			if(bmi < 18.5) {

				if(bmi < 23){
				}else if(bmi < 25){
					System.out.printf("BMI 지수 : %.15f\n%s", bmi, "과체중");
				}

				System.out.printf("BMI 지수 : %.15f\n%s", bmi, "저체중");

			}else{
				System.out.printf("BMI 지수 : %.15f\n%s", bmi, "고도 비만");
			}
		}
		
		public void practice8(){
			Scanner sc = new Scanner(System.in);
			
			System.out.print("피연산자1 입력 : ");
			int num1 = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("피연산자2 입력 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine();

			System.out.print("연산자를 입력(+,-,*,/,%) : ");
			char op = sc.nextLine().charAt(0);
			
			int result = 0; 
			switch(op) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			case '%': result = num1 % num2; break;
			default: System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다."); return;
			}
			
			if(num1 < 0 || num2 < 0 ){
				System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}else {
				System.out.printf("%d %c %d = %d", num1, op, num2, result);
			}
		}
			
		public void practice9(){
			Scanner sc = new Scanner(System.in);
			
			System.out.print("실행할 기능을 선택하세요.\n"
					+ "1. 메뉴 출력\n"
					+ "2. 짝수/홀수\n"
					+ "3. 합격/불합격\n"
					+ "4. 계절\n"
					+ "5. 로그인\n"
					+ "6. 권한 확인\n"
					+ "7. BMI\n"
					+ "8. 계산기\n"
					+ "선택 : ");
			int num = sc.nextInt();
			
			String result = "";
			switch(num) {
			case 1: result = "메뉴 출력"; break;
			case 2: result = "짝수/홀수"; break;
			case 3: result = "합격/불합격"; break;
			case 4: result = "계절"; break;
			case 5: result = "로그인"; break;
			case 6: result = "권한 확인"; break;
			case 7: result = "BMI"; break;
			case 8: result = "계산기"; break;
			}
			
			
			if(num == 2){				
				System.out.print("\n숫자를 한 개 입력하세요 : ");
				int one = sc.nextInt();

				if(one > 0) {
					if(one % 2 == 0) {
						System.out.println("짝수다.");
					}else {
						System.out.println("홀수다.");
					}
				
				}else {
					System.out.println("양수만 입력해주세요.");
				}
			
			}else if(num == 3){								
				System.out.print("\n국어점수 : ");
				int language = sc.nextInt();
				
				System.out.print("수학점수 : ");
				int math = sc.nextInt();
				
				System.out.print("영어점수 : ");
				int english = sc.nextInt();
				
				int add = language + math + english;
				double aver = (language + math + english)/3.0;
				
				if(add >= 40) {
					if(aver >= 60) {
						System.out.printf("국어 : %d \n", language);
						System.out.printf("수학 : %d \n", math);
						System.out.printf("영어 : %d \n", english);
						System.out.printf("합계 : %d \n", add);
						System.out.printf("평균 : %.1f \n", aver);
						System.out.println("축하합니다, 합격입니다!");
					}else {
						System.out.printf("국어 : %d \n", language);
						System.out.printf("수학 : %d \n", math);
						System.out.printf("영어 : %d \n", english);
						System.out.printf("합계 : %d \n", add);
						System.out.printf("평균 : %.1f \n", aver);
						System.out.println("불합격입니다.");
					}
					
				}else {
					System.out.println("불합격입니다.");
				}

			}else if(num == 4){
				System.out.print("\n1 ~ 12사이의 정수 입력 : ");
				int month = sc.nextInt();

				String season = "";
				switch(month) {
				case 1: case 2: case 12:
					season ="겨울"; break;
					
				case 3: case 5:
					season ="봄"; break;

				case 6: case 8: case 7:
					season ="여름"; break;
					
				case 9: case 11:
					season ="가을"; break;
				default: System.out.println(month + "은 잘못 입력된 달입니다."); return;
				}
				
				System.out.printf("%d월은 %s입니다.", month, season);
				
			}else if(num == 5){
				System.out.print("\n아이디 : ");
				String id = sc.nextLine();
				
				System.out.print("비밀번호 : ");
				int pass = sc.nextInt();
				
				if(id.equals("boram")) {
					if(pass == 1234) {
						System.out.println("로그인 성공");
					}else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
					
				}else {
					System.out.println("아이디가 틀렸습니다.");
				}
				
			}else if(num == 6){
				System.out.print("\n권한을 확인하고자 하는 회원 등급 : ");
					String grade = sc.nextLine();
					
					switch(grade) {
					case "관리자": System.out.println("회원관리, 게시글 관리");
					case "회원": System.out.println("게시글 작성, 댓글 작성");
					case "비회원": System.out.println("게시글 조회"); break;
					default: System.out.println("잘못 입력했습니다."); return;   
					}
			
			}else if(num == 7){
				System.out.print("\n키(cm)를 입력해주세요 : ");
					double height = sc.nextDouble();
					
					sc.nextLine();
					
					System.out.print("몸무게(kg)를 입력해 주세요 : ");
					double weight = sc.nextDouble();

					double bmi = weight / (height * height);
					
					if(bmi < 18.5) {

						if(bmi < 23){
						}else if(bmi < 25){
							System.out.printf("BMI 지수 : %.15f\n%s", bmi, "과체중");
						}

						System.out.printf("BMI 지수 : %.15f\n%s", bmi, "저체중");

					}else{
						System.out.printf("BMI 지수 : %.15f\n%s", bmi, "고도 비만");
					}
				
			}else if(num == 8){
				System.out.print("\n피연산자1 입력 : ");
					int operand1 = sc.nextInt();
					
					sc.nextLine();
					
					System.out.print("피연산자2 입력 : ");
					int operand2 = sc.nextInt();
					
					sc.nextLine();

					System.out.print("연산자를 입력(+,-,*,/,%) : ");
					char op = sc.nextLine().charAt(0);
					
					int calculation = 0; 
					switch(op) {
					case '+': calculation = operand1 + operand2; break;
					case '-': calculation = operand1 - operand2; break;
					case '*': calculation = operand1 * operand2; break;
					case '/': calculation = operand1 / operand2; break;
					case '%': calculation = operand1 % operand2; break;
					default: System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다."); return;
					}
					
					if(operand1 < 0 || operand2 < 0 ){
						System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다.");
					}else {
						System.out.printf("%d %c %d = %d", operand1, op, operand2, calculation);
					}
				
			}else if(num == 1){
				System.out.print("\n실행할 기능을 선택하세요.\n"
						+ "1. 메뉴 출력\n"
						+ "2. 짝수/홀수\n"
						+ "3. 합격/불합격\n"
						+ "4. 계절\n"
						+ "5. 로그인\n"
						+ "6. 권한 확인\n"
						+ "7. BMI\n"
						+ "8. 계산기\n"
						+ "선택 : ");
				int num1 = sc.nextInt();
				
				switch(num1) {
				case 1: result = "메뉴 출력"; break;
				case 2: result = "짝수/홀수"; break;
				case 3: result = "합격/불합격"; break;
				case 4: result = "계절"; break;
				case 5: result = "로그인"; break;
				case 6: result = "권한 확인"; break;
				case 7: result = "BMI"; break;
				case 8: result = "계산기"; break;
				}//다시 if문 위로 올라가서 반복하는 것 추가하기(do-while)			
			}
		}
}			

		

			
			
	
		


