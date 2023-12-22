package com.br.chap03_class.run;

import com.br.chap03_class.model.vo.Person;
import com.br.chap03_class.model.vo.Product;

public class CalssRun {
	public static void main(String[] args) {
		
		/*Person a = new Person();
		
		//person객체생성 후
		//각 필드에 값 대입
		//결과 출력
		
		a.setId("uer01");
		a.setPwd("pass01");
		a.setName("강보람");
		a.setAge(34);
		a.setGender('F');
		a.setEmail("teaching@naver.com");

		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(a.getGender());
		System.out.println(a.getPhone()); //JVM으로 인해 String의 기본값 null적용
		System.out.println(a.getEmail());
		
		System.out.println(a.information());*/
		
		Product b = new Product();
		
		b.setpName("갤럭시");
		b.setPrice(120000);
		b.setBrand("삼성");
		
		System.out.println(b.getpName());
		System.out.println(b.getPrice());
		System.out.println(b.getBrand());
		
		System.out.println("=========");
		System.out.println(b.information());
	}
}
