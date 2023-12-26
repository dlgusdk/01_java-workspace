package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {
	public static void main(String[] args) {
		Book bo = new Book();
		System.out.println(bo.information());
		
		//set, get
		bo.setTitle("자바의정석");
		bo.setPrice(20000);
		bo.setDiscountRate(0.2);
		bo.setAuthor("윤상섭");
	
		System.out.print(bo.getTitle() + " ");
		System.out.print(bo.getPrice() + " ");
		System.out.print(bo.getDiscountRate() + " ");
		System.out.println(bo.getAuthor());
		
		System.out.println("====================");
		
		//set 수정
		Book b1 = new Book();
		b1.setTitle("C언어");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인\n" + b1.information());
		
		System.out.println("====================");
		
		//Book b1 = new Book("C언어", 27000, "자바의 정석", 16000); 
		System.out.printf("도서명 = %s\n할인된 가격 = %d원\n", b1.getTitle(), (int)(b1.getPrice() - (b1.getPrice() * b1.getDiscountRate())));
		System.out.printf("도서명 = %s\n할인된 가격 = %d원", bo.getTitle(), (int)(bo.getPrice() - (bo.getPrice() * bo.getDiscountRate())));

		
	}
}
