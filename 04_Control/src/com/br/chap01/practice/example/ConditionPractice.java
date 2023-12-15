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
}

