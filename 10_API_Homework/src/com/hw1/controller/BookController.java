package com.hw1.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import com.hw1.model.vo.Book;

public class BookController {
	
	private Book[] list = new Book[5];
	{ 	// 초기화블럭
		list[0] = new Book("자바의 정석", "제임스 고슬링", "나무", new GregorianCalendar(2018, 4-1, 15), 20000);
		list[1] = new Book("여러분들 성공할꺼에요", "보람쌤", "BR", new GregorianCalendar(2019, 6-1, 15), 30000);
		list[2] = new Book("API의 모든것", "강보람", "BR", new GregorianCalendar(2017, 2-1, 13), 15000);
		list[3] = new Book("씨언어 프로그래밍", "김절차", "문학동네", new GregorianCalendar(2016, 8-1, 30), 10000);
	}
	
	
	public BookController() {}
	
	// 1. 도서 전체 출력 기능 메소드
	public void printAll() {
		
		// list에 담긴 전체 Book객체의 정보 출력하는 구문 작성하시오.
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}

		
	}
	
	
	
	// 2. 도서 추가 기능 메소드
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		// 1. 매개변수로 전달받은 newPrice값  ==>      String --> int로 변환 작업  (int price라는 변수에 담으시오)
		int price = Integer.parseInt(newPrice);
		//C_Wrapper 참고. 기본자료형으로 변환은 parse
		
		
		
		// --------------------------------------------------------
		// 2. 매개변수로 전달받은 newDate값   ==>        String --> Calendar로 변환 작업    (Calendar publishDate에 담으시오)
		//	  '-'를 구분자로 StringTokenizer 또는 split메소드를 이용하여 문자열 분리 후 각각 년,월,일 을 Calendar에 적용
	
		//B_stringTokenizerTest 참고 1)spilt
		  String[] date = newDate.split("-"); 
		  //String배열변수 date에 입력받은 값 newDate넣기
		  int year = Integer.parseInt(date[0]); 
		  int month = Integer.parseInt(date[1]) - 1; //월은 0부터 시작이므로 6월을 입력받았으면 -1해서 5월이 되어야 매칭이 된다.
		  int day = Integer.parseInt(date[2]); 
				
		  //2)StringTokenizer 방식으로 하기 - 미완
		 /* StringTokenizer date = new StringTokenizer(newDate, "-"); 

		  int year = 0;
		  int month =0;
		  int day =0;
		  //입력한 순서대로 들어감 년 ~월 ~일
		  for(int i=date.countTokens(); i>0; i--) {
			  System.out.println(date.nextToken());
			  System.out.println(date.nextToken());
			  System.out.println(date.nextToken());
		  */
		//Calendar로 변환 - D의 calenderDate 참고
	      Calendar publishDate = new GregorianCalendar(year, month , day);
		
		
		// ------------------------------------------------------
		// 3. 나머지 전달받은 값들과 위에서 변환작업을 해준 price와 date값을 가지고
		//	  Book클래스의 매개변수 생성자를 통해 생성
		Book bk = new Book(newTitle, newAuthor, newPublisher, publishDate, price);

		list[4] = bk;
	}
	

	
	
	// 3. 도서 출간일 출력 기능 메소드
	public void printBookPublishDate() {
		// 새로 입력받은 도서 (5번째 도서)의 출간일 출력
		// "xxxx년 xx월 xx일 출간" 과 같은 패턴으로 출력
		// SimpleDateFormat 이용해서
		//list[4]에 저장되어있는 값이 쪼개진 날짜값이니까 가져와서 사용?
		Book book = list[4]; 
        Calendar publishDate = book.getPublishDate(); 
        
		if(list[4] != null) { //확인필요. 3에서 입력받고 인덱스 4(5번)이 나오므로 null이면 실행 x
			//다시 형식 만들어서 날짜 담기, 출력안된다.ㅈ.ㅇ.ㅠ
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
	        String sdfStr = sdf.format(publishDate.getTimeInMillis());
	        //PublishDate는 GregorianCalendar로 Calendar자료형으로 만들어버림. 변환해야함.date로 쓸거면
	    	System.out.println(sdfStr + " 출간");

		}
	}
	
	
	// 4. 도서 검색 기능 메소드
	public void searchBook(String searchTitle) {
		
		// 도서 리스트를 전체적으로 조회하면서 (for문 이용)
		////for(int i=0; i<list.length; i++) {
		// System.out.println(arr[i]);
		 //포이치
		  //for(Book s : list) {  
			//  System.out.println(s);}

			
		
		// 전달받은 검색명을 포함(HINT : String클래스의 contains메소드 활용)한!! 도서들 전체 출력  
		//제대로 안나옴. 키워드문제
		  //B의 StringMethodTest참고
		  for(int i=0; i<list.length; i++) {
			 if(searchTitle.contains("자바의 정석")) {
				 System.out.println(list[0]);
			 }else if(searchTitle.contains("여러분들 성공할꺼에요")) {
				 System.out.println(list[1]);
			 }else if(searchTitle.contains("API의 모든것")) {
				 System.out.println(list[2]);
			 }else if(searchTitle.contains("씨언어 프로그래밍")) {
				 System.out.println(list[3]);
			 }
		  
		// 코드 작성
		
		
	}
	
	
	

 }
}
