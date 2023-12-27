package com.br.chap01_oneVsmany.model.vo;

public class Book {

	//도서명, 저자명, 가격, 출판사 
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	//기본생성자
	public Book() {
		
	}
	//매개변수생성자(모든 필드값 대입 가능)
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;

	}
	
	//getter/setter메소드
	
	//set
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	//get
	public String getTitle() {
		return title = title;
	}
	public String getAuthor() {
		return author = author;
	}
	public int getPrice() {
		return price = price;
	}
	public String getPublisher() {
		return publisher = publisher;
	}
	
	
	//information 메소드 
	public String information() {
		String result =  title + " " 
				 + author  + " " +
				 + price  + " " 
				 + publisher;
		return result;
	}
	
}

