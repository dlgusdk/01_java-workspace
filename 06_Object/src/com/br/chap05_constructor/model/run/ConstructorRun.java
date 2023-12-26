package com.br.chap05_constructor.model.run;

import com.br.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		User u1 = new User();
		System.out.println(u1.information());
		
		//1.기본생성자로 객체 생성 후에 바로 정보 출력, setter메소드를 이용해서 값 초기화 한 후 정보 출력
		/*User u2 = new User();
		u2.setUserId("user01");
		u2.setUserPwd("pass01");
		u2.setUserName("홍길동");		
		System.out.println(u2.information());
		*/
		
		//2_2. 매개변수 3개짜리 생성자로 객체 생성 후 정보 출력
		User u2 = new User("user01", "pass01", "홍길동");
		//u1.setUserId(); //
		System.out.println(u2.information());
		
		//3.매개변수 5짜리 생성자로 객체 생숭 후 정보 출력
		User u3 = new User("user02", "pass02", "김말똥" , 23, 'M');
		//매개변수 적은 순서 중요 (스트링, 스트링, 스트링, 인트, 차) 순으로 정했으면 꼭 맞춰서 작성
		
		
		u1.setUserId("");
		u1.setUserPwd("");
		u1.setAge(66);
		u1.setUserName("");
		u1.setGender('s');
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPwd());
		System.out.println(u1.getAge());
		System.out.println(u1.getUserName());
		System.out.println(u1.getGender());
	}

}
