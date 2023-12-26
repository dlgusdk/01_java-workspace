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
		
		
		//1.기본생성자로 생성한 후 setter이용해서 값 초기화
		Product b = new Product();
		b.setpName("갤럭시");
		b.setPrice(120000);
		b.setBrand("삼성");
		
		System.out.println(b.getpName());
		System.out.println(b.getPrice());
		System.out.println(b.getBrand());
		
		System.out.println("=========");
		System.out.println(b.information());
		
		System.out.println("=========");
		//2.매개변수 생성자를 이용해서 생성과 동시에 각 필드에 초기화까지 진행이 되도록 
		Product p2 = new Product("아이폰", 1500000, "애플"); 
		//product의 매개변수 생성자 호출 (스트링, 인트, 스트링)
		System.out.println(p2.information());
		
		//가격이 낮아졌을 경우 매개변수가 아닌 set을 사용해야 편리.
		p2.setPrice(13000000);
		System.out.println(p2.information());
	}
}
