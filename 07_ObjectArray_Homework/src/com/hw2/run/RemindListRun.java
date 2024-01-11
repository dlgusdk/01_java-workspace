package com.hw2.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.hw2.model.vo.RemindStudent;

public class RemindListRun {
	public static void main(String[] args) {
		//RemindStudent[] stu = new RemindStudent[10];
		ArrayList<RemindStudent> stu = new ArrayList<>();
		int count = 0;
		Scanner sc = new Scanner(System.in);
		//int count = 0;
		//Scanner sc = new Scanner(System.in);
		
		while(true) {
			//학년 반 이름 국어점수 영어점수 수학점수
			System.out.print("학년 : ");
			int grade = sc.nextInt(); 
			sc.nextLine();
			
			System.out.print("반 : ");
			int classroom = sc.nextInt(); 
			sc.nextLine();

			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			sc.nextLine();

			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			sc.nextLine();

			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
		
			//방법 1
			//stu.get(count).setGrade(grade);
			
			//방법 2
			stu.add(count, new RemindStudent(grade, classroom, name, kor, eng, math));
			count++;
			
			System.out.print("계속 추가하시겠습니까? : ");
			String an = sc.nextLine();
			
			if(an.equalsIgnoreCase("n")) {
				for(int i=0; i<stu.size(); i++) {
					System.out.println(stu.get(i).information());
					return;
				
				}
			}
		}
	}
}
			/*while(true) {
			//학년 반 이름 국어점수 영어점수 수학점수
			System.out.print("학년 : ");
			int grade = sc.nextInt(); 
			sc.nextLine();
			
			System.out.print("반 : ");
			int classroom = sc.nextInt(); 
			sc.nextLine();

			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			sc.nextLine();

			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			sc.nextLine();

			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			stu[count] = new RemindStudent(grade, classroom, name, kor, eng, math);
			count++;
			
			System.out.print("계속 추가하시겠습니까? : ");
			String an = sc.nextLine();
			
			if(an.equalsIgnoreCase("n")) {
				for(int i=0; i<stu.length; i++) {
					System.out.println(stu[i].information());
					return;
				
				}
				
				
			}
			
		}
		
		
	
	}*/
