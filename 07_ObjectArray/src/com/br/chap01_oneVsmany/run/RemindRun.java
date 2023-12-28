package com.br.chap01_oneVsmany.run;

import com.br.chap01_oneVsmany.model.vo.Book;

public class RemindRun {
	public static void main(String[] args){	
	
		Book bk1 = new Book();
		bk1.setTitle("자바의정석");
		bk1.setAuthor("자바의정석");
		
		Book bk2 = new Book("혼공자", "신용권", 30000, "한빛미디어");
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		
		System.out.println("==============================");
		
		int[] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 20;
		//arr[0] == type : int
		//arr[1] == type : int
		//arr[2] == type : int int이므로 값 바로 나옴
		
		
		Book[] books = new Book[3];
		//books == type : Book[]
		//books[0] == type : Book
		//books[1] == type : Book
		//books[2] == type : Book
		//books[3] == type : Book
		//book이 자료형이므로 주소값이 나옴
		books[0] = new Book(); //Book타입이므로 Book개체만 담을 수 있음
		books[0].setTitle("파이썬");
		books[0].setAuthor("홍길동");
		
		books[1] = bk2;//주소값을 대입(bk2가 0x123이었다면 books[1]도 0x123주소 담김
		
		books[2] = new Book("도커", "이말순", 40000, "길벗");
		
		System.out.println(books);//Book[]타입 -주소값
		System.out.println(books[0]);
		
		for(int i=0; i<books.length; i++) {
		System.out.println(books[i].information());
		
		System.out.println("==============================");

		books[1].setPrice(15000);
		System.out.println(books[1].information());

		System.out.println(bk2.information());
		}
		
	}
}
