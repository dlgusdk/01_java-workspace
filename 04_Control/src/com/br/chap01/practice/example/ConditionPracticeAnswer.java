package com.br.chap01.practice.example;

import java.util.Scanner;

public class ConditionPracticeAnswer {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
	
		/* 방법1. if-else if문 이용하는 방법 ===============
		if(menu == 1) {
			System.out.println("입력 메뉴입니다.");
		}else if(menu == 2) {
			System.out.println("수정 메뉴입니다.");
		}else if(menu == 3) {
			System.out.println("조회 메뉴입니다.");
		}else if(menu == 4) {
			System.out.println("삭제 메뉴입니다.");
		}else if(menu == 9) {
			System.out.println("프로그램이 종료됩니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		-============================================*/
		
		
		
		/* 방법2. switch문 이용하는 방법 ==================
		switch(menu) {
		case 1 : System.out.println("입력 메뉴입니다."); break;
		case 2 : System.out.println("수정 메뉴입니다."); break;
		case 3 : System.out.println("조회 메뉴입니다."); break;
		case 4 : System.out.println("삭제 메뉴입니다."); break;
		case 9 : System.out.println("프로그램이 종료됩니다."); break;
		default : System.out.println("잘못입력하셨습니다."); break;
		}
		============================================*/
		
		
		
		// 방법3. switch문 이용하는데 String 변수 이용하는 방법 ====
		String str = "";
		switch(menu) {
		case 1 : str = "입력"; break;
		case 2 : str = "수정"; break;
		case 3 : str = "조회"; break;
		case 4 : str = "삭제"; break;
		case 9 : System.out.println("프로그램이 종료됩니다."); return;
		default : System.out.println("잘못입력하셨습니다."); return;
		}
		
		System.out.println(str + " 메뉴입니다.");
		//==============================================
	}
	
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		
		/* 방법1. 
		if(num > 0 && num % 2 == 0) { 
			System.out.println("짝수다.");
		}else if(num > 0 && num % 2 == 1) {
			System.out.println("홀수다.");
		}else { 
			System.out.println("양수만 입력해주세요.");
		}
		*/
		
		
		// 방법2. 중첩 if문으로 공통적인 조건을 먼저검사하고!
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
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		// 방법1. 이런 방식
		/*switch(num) {
		case 12: case 1: case 2:
			System.out.println(num + "월은 겨울입니다.");
			break;
		case 3: case 4: case 5: 
			System.out.println(num + "월은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(num + "월은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(num + "월은 가을입니다.");
			break;
		default : 
			System.out.println(num + "월은 잘못 입력된 달입니다.");
			break;
		}*/
		
		
		// 방법2. String 변수 사용해서 출력문은 한번만 쓰는 방식
		String season = "";
		
		switch(num) {
		case 12: case 1: case 2:
			season = "겨울";
			break;
		case 3: case 4: case 5: 
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		default : 
			season = "잘못 입력된 달";
			break;
		}
		
		System.out.println(num + "월은 " + season + "입니다.");
		
	}
	
	public void practice5() {
		
		// 1. 임의로 아이디와 비밀번호 지정해두기
		String userId = "boram";
		String userPwd = "1234";
		
		// 2. 사용자에게 아이디와 비밀번호 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String inputId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String inputPwd = sc.nextLine();
		
		// 3. 사용자에게 입력받은 아이디와 비밀번호 가지고 조건검사 후 결과를 출력
		if(userId.equals(inputId) && userPwd.equals(inputPwd)) { // 아이디도 일치하고 비번도 일치할 경우
			System.out.println("로그인 성공");
		}else if(userId.equals(inputId)) { // 아이디는 일치하지만 비번이 틀렷을 경우
			System.out.println("비밀번호가 틀렸습니다.");
		}else if(userPwd.equals(inputPwd)) { // 비밀번호는 일치하지만 아이디가 틀렸을 경우
			System.out.println("아이디가 틀렸습니다.");
		}else { // 둘 다 틀렸을 경우
			System.out.println("둘 다 틀렸습니다.");
		}
		
		
		
		
	}
	
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		switch(sc.nextLine()) { // 이렇게 사용자가 입력한 문자열값을 변수에 기록하지 않고 곧바로 비교하는식도 가능!!
		case "관리자" : System.out.println("회원관리, 게시글 관리");
		case "회원"  : System.out.println("게시글 작성, 댓글 작성");
		case "비회원" : System.out.println("게시글 조회"); break; // 여기서 break해야 default문까지 넘어가지 않는다.
		default : System.out.println("잘못 입력하셨습니다."); 
		}
	}
	
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if(bmi < 23) {
			System.out.println("정상체중");
		}else if(bmi < 25) {
			System.out.println("과체중");
		}else if(bmi < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
		
		/* 방법1. if-else if문 이용해서 ==============================================
		if (num1 > 0 && num2 > 0 && ch == '+') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 + num2));
			
		} else if (num1 > 0 && num2 > 0 && ch == '-') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 - num2));
			
		} else if (num1 > 0 && num2 > 0 && ch == '*') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 * num2));
			
		} else if (num1 > 0 && num2 > 0 && ch == '/') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 / num2));
			
		} else if (num1 > 0 && num2 > 0 && ch == '%') {
			System.out.printf("%d %s %d = %d", num1, ch, num2, (num1 % num2));
			
		} else {
			System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
		}
		=======================================================================*/
		
		
		
		
		/* 방법2. 위의 내용의 업그레이드 (중첩 if문 방법 : 공통된 조건을 먼저 검사하고 시작한다!)===
		
		if(num1 > 0 && num2 > 0) { // 1_1) 두개의 정수 모두 양수일 경우
			
			// 2) 연산기호를 가지고 비교
			if(ch == '+') {
				
			}else if(ch == '-') {
				
			}else if(ch == '*') {
				
			}else if(ch == '/') {
				
			}else if(ch == '%') {
				
			}else { // 두개의 정수값 모두 양수긴 하지만 연산기호를 잘못 입력했을 경우
				
			}
		}else {  // 1_2) 양수가 아닌 값을 입력했을 경우
			
		}
		====================================================================*/
		
		
		// 방법3. 위의 내용에서 더 업그레이드 =======================================
		if(num1 > 0 && num2 > 0) {
			
			int result=0; // 연산기호에 맞춰서 산술 연산한 결과를 담아줄 변수 셋팅!
			
			// 연산기호를 가지고 동등비교하는 걸 switch문으로 바꾼내용
			switch(ch) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			case '%': result = num1 % num2; break;
			default: System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다."); return; // 메소드 빠져나갈수있도록
			}

			// 출력문은 여기에 단 한번만 기술할꺼임
			System.out.printf("%d %c %d = %d", num1, ch, num2, result);
			
		}else {
			System.out.println("양수가 아닌 값을 입력하셨습니다. 프로그램을 종료합니다."); 
		}
		// ================================================================
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");

		System.out.print("선택 : ");
		int menu = sc.nextInt();
		
		switch (menu) { 
		case 1:	practice1(); break;
		case 2:	practice2(); break;
		case 3:	practice3(); break;
		case 4:	practice4(); break;
		case 5:	practice5(); break;
		case 6:	practice6(); break;
		case 7:	practice7(); break;
		case 8:	practice8(); break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	

}
