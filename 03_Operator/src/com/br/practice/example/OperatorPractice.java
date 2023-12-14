package com.br.practice.example;

import java.util.Scanner;

	public class OperatorPractice {
	 public void practice1() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("정수를 입력하세요 : ");
		 int num = sc.nextInt();
		 
		 String result1 = (num > 0) ? "양수다." : "양수가 아니다.";
		 
		 System.out.println(result1);
	 }
	 
	 public void practice2(){ 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("정수를 입력하세요 : ");
		 int num = sc.nextInt();
		 
		 String result2 = (num > 0) ? "양수다." : ((num == 0) ? "0이다." : "음수다.");
		 System.out.println(result2);
	 }
	 
	 public void practice3(){ 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("정수를 입력하세요 : ");
		 int num = sc.nextInt();
	 
		 String result3 = (num % 2) == 0 ? "짝수다." : "홀수다.";
		 System.out.println(result3);
	 }
	 
	 public void practice4(){ 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("인원 수를 적으세요: ");
		 int person = sc.nextInt();
		 
		 sc.nextLine();
		 
		 System.out.print("사탕 개수를 적으세요: ");
		 int candy = sc.nextInt();
		 
		 int result = candy / person;
		 int result1 = candy % person;
		 
		 System.out.printf("1인당 사탕 개수 : %d \n", result);
		 System.out.printf("남는 사탕 개수 : %d", result1);
	 }
	 
	 public void practice5(){ 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("이름: ");
		 String name = sc.nextLine();
	 
		 System.out.print("학년(숫자만): ");
		 int grade = sc.nextInt();
		 
		 sc.nextLine();
		 
		 System.out.print("반(숫자만): ");
		 int group = sc.nextInt();
		 
		 sc.nextLine();
		 
		 System.out.print("번호(숫자만): ");
		 int number = sc.nextInt();
		 
		 sc.nextLine();
		 
		 System.out.print("성별(M/F): ");
		 char gender = sc.nextLine().charAt(0);
		 	
		 System.out.print("성적(소수점 아래 둘째 자리까지): ");
		 double mark = sc.nextDouble();
		
		 sc.nextLine();

		 String result = (gender == 'M' || gender == 'm') ? "남학생" : "여학생";
		 
		 System.out.println();

		 System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, group, number, name, result, mark);
	 }
	 
	 public void practice6(){
		 Scanner sc = new Scanner(System.in);

		 System.out.print("나이를 입력하세요 : ");
		 int age = sc.nextInt();
		 
		 String result = (age <= 13) ? "어린이" : ((age > 19) ? "성인" : "청소년");
		 
		 System.out.println(result);
	 }
	 
	 public void practice7() {
		 Scanner sc = new Scanner(System.in);

		 System.out.print("국어 : ");
		 int language = sc.nextInt();
		 
		 System.out.print("영어 : ");
		 int math = sc.nextInt();
		 
		 System.out.print("수학 : ");
		 int English = sc.nextInt();
		 
		 double add = English + language + math;
		 
		 String result = (language >= 40 && math >= 40 && English >= 40) && ((add / 3) >= 60) ? "합격" : "불합격";
		 
		 System.out.printf("합계 : %.0f \n", add);
		 System.out.printf("평균 : %.1f \n", add / 3.0);
		 System.out.printf("%s", result);

	 }
	 
	 public void practice8() {
		 Scanner sc = new Scanner(System.in);

		 System.out.print("주민번호를 입력하세요(- 포함) : ");
		 char gender = sc.nextLine().charAt(7);
		 
		 String result = (gender == '2') ? "여자" : "남자";
		 
		 System.out.println(result);
	 }

	 public void practice9() {
			//사용자에게 두개의 정수값을 받고
			// + 또는 -를 입력받아 그에 맞는 연산결과를 출력해주기
			//+일 경우 덧셈연산결과 출력, -일 경우 뺄셈결과 출력
			//연산자가 +,- 외일 경우 잘못입력했습니다 출력
	 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("첫번째 정수값 입력 : ");
		 int first = sc.nextInt();
		 
		 sc.nextLine();
		 
		 System.out.print("두번째 정수값 입력 : ");
		 int second = sc.nextInt();

		 sc.nextLine();
		 
		 System.out.print("연산자 입력 : ");
		 char op = sc.nextLine().charAt(0);
		 
		 String result = (op == '+') ? first + second + " " : ((op == '-') ? first - second + " " : "잘못입력했습니다.");
		 
		 System.out.printf(result);
	 }
	 
	 
	 
	 
	 
	 
	 
}
   