package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		/*Book[] book = new Book[2];
		
		book[0] = new Book();
		book[1] = new Book("자바의 정석", 20000, 0.2, "윤상섭");
		
		for(Book bk : book) {
			System.out.println(bk.information());
		}*/
		
		Book book = new Book();
		
		Book book1 = new Book();
		book1.setTitle("자바의 정석");
		book1.setPrice(20000);
		book1.setDiscountRate(0.2);
		book1.setAuthor("윤상섭");
		
		System.out.println(book.information()+ "\n" + book1.information());
		
		
		System.out.println("==========================");
		
		
		
		/*book[0].setTitle("C언어");
		book[0].setPrice(3000);
		book[0].setDiscountRate(0.1);
		book[0].setAuthor("홍길동");
		*/
		//System.out.println("수정된 결과 확인\n" + book[0].information());
		
		System.out.println("==========================");
		
		/*System.out.printf("도서명 = %s\n할인된 가격 = %d원\n도서명 = %s\n할인된 가격 = %d원\n"
				, book[0].getTitle()
				, (int)(book[0].getPrice() -(book[0].getPrice() * book[0].getDiscountRate()))
				,  book[1].getTitle()
				, (int)(book[1].getPrice() -(book[1].getPrice() * book[1].getDiscountRate())));

		*/
	}

}
