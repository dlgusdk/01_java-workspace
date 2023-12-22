package com.br.cha01_abstraction.run;

import com.br.cha01_abstraction.model.vo.Student;

public class AbstractionRun {
	public static void main(String[] args) {
	
		//student 클래스로 학생 객체 생성하기
		//new 키워드로 객체 생성
		Student hong = new Student();
		
		//각 영역에 직접접근해서 내가 원하는 값 대입 
		
		hong.name ="홍길동";
		hong.age = 20;
		hong.height = 161.3;
		
		System.out.println(hong); // 자료형+@+주소값기반 16진수
		System.out.println(hong.name + "님의 나이는" + hong.age + "이고, 키는 " + hong.height);
		
		//김말똥학생 객체
		Student ddong = new Student();
		ddong.name = "김말똥";
		ddong.age = 23;
		ddong.height = 172.1;
		
		System.out.println(ddong);
		System.out.println(ddong.name + ", " + ddong.age + ", " + ddong.height);
	}
}
