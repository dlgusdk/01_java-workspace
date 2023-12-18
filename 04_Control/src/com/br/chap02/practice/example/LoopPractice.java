package com.br.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	 public void practice1(){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("1이상의 숫자를 입력하세요 : ");
		 int num = sc.nextInt();
		 
		 if(num != 0) {
			 
			 for(int i=1; i<=num; i++) {
				 System.out.print(i + " ");
			 }

		 }else {
			 System.out.print("잘못 입력하셨습니다.");
		 } 
	 }
	 
	 public void practice2(){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("1이상의 숫자를 입력하세요 : ");
		 int num = sc.nextInt();
		 
		 if(num != 0 && num > 0) {
			 
			 for(int i=1; i<=num; i++) {
				 System.out.print(i + " ");
			 }

		 }else {
			 System.out.print("잘못 입력하셨습니다. 다시 입력해주세요.");
		 } 
	 }
	 
	 public void practice3(){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("1이상의 숫자를 입력하세요 : ");
		 int num = sc.nextInt();
		 
		 if(num > 0) {
			 
			 for(int i=num; i>=1; i--) {
				 System.out.print(i + " ");
			 }

		 }else {
			 System.out.print("잘못 입력하셨습니다.");
		 } 
	 }
	 
	 public void practice4(){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("1이상의 숫자를 입력하세요 : ");
		 int num = sc.nextInt();
		 
		 if(num != 0 && num > 0) {
			 
			 for(int i=num; i>=1; i--) {
				 System.out.print(i + " ");
			 }

		 }else {
			 System.out.print("잘못 입력하셨습니다. 다시 입력해주세요.");
		 } 
	 }
	 
	 public void practice5(){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("정수를 하나 입력하세요 : ");
		 int num = sc.nextInt();
		 
		 int sum = 0;
		 for(int i=1; i<=num; i++) {
			sum += i;
		    
			if(i != num) {
				System.out.print(i + "+");

		 	}else if(i == num) {
		 		System.out.print(i);
		    }
		 }
		 
		 System.out.print("=" + sum);
	 }
	 
	 public void practice6(){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("첫 번째 숫자 : ");
		 int first = sc.nextInt();
		 
		 System.out.print("두 번째 숫자 : ");
		 int second = sc.nextInt();
		 
		 if(first > second) {
			
			 for(int i=second; i<=first; i++) {
					 System.out.print(i + " ");
			 }
			
		 }else if(first < second) {
			
			 for(int i=first; i<=second; i++) {
				 System.out.print(i + " ");
			 }
			 
		 }else if(first < 1 || second < 1) {
			 System.out.print("1이상의 숫자만을 입력해주세요."); 		 
		 
		 }
	 }	
	 
	 public void practice8(){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("숫자 : ");
		 int dan = sc.nextInt();
		 
		 	 System.out.println("===== " + dan + "단 =====");

			 for(int i=1; i<=9; i++) {
				 System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			 }
			 
			 System.out.println();
	 }
	 
	 public void practice9(){ 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("숫자 : ");
		 int dan = sc.nextInt();
	
		 if(dan < 2 || dan > 9) {
			 System.out.println("2~9 사이의 숫자만 입력해주세요." );
			 
		 }else {
			 for(int i=1; i<=dan; i++) {
				 System.out.println("===== " + i + "단 =====");
			 }
		 }
		 
		 System.out.println();
	 }

	 public void practice11(){ 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("시작 숫자 : ");
		 int first = sc.nextInt();
		 
		 System.out.print("공차 : ");
		 int second = sc.nextInt();
		
		 if(first > second) {
				
			 for(int i=first; i<=10; i=first+second) {
				 System.out.print(i);
				 }
			
		 }else if(first < second) {
			
			 for(int i=first; i<=second; i=second) {
				 System.out.print(i + " ");
			 }
			 
		 }else if(first < 1 || second < 1) {
			 System.out.print("1이상의 숫자만을 입력해주세요."); 		 
		 
		 }
		
		 
		 
	 }

	 
}


	 
	 
