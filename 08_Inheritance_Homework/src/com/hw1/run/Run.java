package com.hw1.run;


import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Person;
import com.hw1.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		Person p = new Person();

		Student[] s = new Student[3];
		Employee[] e = new Employee[10];
//이름 나이 키 몸무게 학년 전공
		s[0] = new Student("홍길동", 20,178.2, 70.0, 1, "정보시스템공학과");
		s[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		s[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		System.out.println(s[0].toString());
		System.out.println(s[1].toString());
		System.out.println(s[2].toString());
		
		System.out.println("==========================================================");
		
		Scanner sc = new Scanner(System.in);
	
			int i = 0;
		  while (i < 10) {
		         i++;
		         System.out.println(i + "번째 사원입니다.");
		         System.out.print("이름: ");
		         String name = sc.nextLine();
		         System.out.print("나이: ");
		         int age = sc.nextInt();
		         System.out.print("신장: ");
		         double height = sc.nextDouble();
		         System.out.print("몸무게: ");
		         double weight = sc.nextDouble();
		         System.out.print("급여: ");
		         int salary = sc.nextInt();
		         sc.nextLine();
		         System.out.print("부서: ");
		         String dept = sc.nextLine();

		         e[i] = new Employee(name, age, height, weight, salary, dept);

		         System.out.print("계속 추가하시겠습니까?(y/n): ");
		         char ch = sc.nextLine().charAt(0);

		         if (ch == 'y' || ch == 'Y') {
		            continue;
		         } else if (ch == 'n' || ch == 'N') {
		            System.out.println("종료하겠습니다.");
		               for (int count = 0; count <= i; count++) {
		               System.out.println(e[count]);
		               }
		            return;
		         } else {
		            System.out.println("잘못 입력하셨습니다. 종료합니다.");
		               for (int count = 0; count <= i; count++) {
		               System.out.println(e[count]);
		               }
		            return;
		         }

		      
		   
		      }
		   }

		}