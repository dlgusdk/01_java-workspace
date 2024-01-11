package com.hw1.controller;

import java.util.ArrayList;

import com.hw1.model.vo.Book;

public class BookController {
	ArrayList<Book> bookList = new ArrayList<>();
	
	{
		bookList.add(new Book("자바언어의 정석", "홍길동", "기타", 20000));
		bookList.add(new Book("C언어의 보람", "김말똥", "기타", 15000));
		bookList.add(new Book("도움이 되었나요", "강보람", "인문", 17500));
		bookList.add(new Book("여러분", "홍홍홍", "의료", 10000));
		
	}
	
	public void insetBook(String title, String author, int category, String price) {
		//bookList.add(new Book(title, author, String.valueOf(category),Integer.valueOf(price)));
	
	}
	
	public ArrayList<Book> selectList(){
		return bookList;
		
	}
	
	public ArrayList<Book> searchBook(int menu, String keyword) {
		// 현재 bookList내의 도서들 가지고 전달된 키워드 값이 포함 되어있는 도서들을
		// 새로운 ArrayList안에 담아 반환하기
		// 이때 전달된 메뉴번호가 1일 경우 도서명에 포함되어있는지 비교하고,
		// 메뉴번호가 2일 경우 저자명에 포함되어있는지 비교하고,
		// 메뉴번호가 3일 경우 도서명 포함되어있거나, 저자명에 포함되어있는지 비교할 것

		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(keyword)) {
				ArrayList<Book> re = new ArrayList<>();
				re.add(menu, keyword)
				
				
			}
			
			
		}
		
		
		
		return null;

	}
	
	public int deleteBook(String title, String author) {
		return 0;
		
	}

	public void insertBook(String bn, String ba, String bs, String bp) {
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
