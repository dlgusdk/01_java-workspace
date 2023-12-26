package com.hw2.model.vo;

public class Book {
	
	//필드부
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	//생성부(기본변수, 매개변수)
	public Book() { //기본
		
	}
	
	public Book(String title, int price, String author, double discountRate) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	
	//메소드부(set,get) -setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//getter
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	public String getAuthor() {
		return author;
	}
	
	
	//information
	
	public String information() {
		return (title + " ") + (price + " ") + (discountRate + " ") + (author + " ");
	}
	
}
