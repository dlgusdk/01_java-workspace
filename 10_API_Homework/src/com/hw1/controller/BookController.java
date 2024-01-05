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
		
		
		/*
		 * list == Book[]
		 * list[인덱스] == Book
		 * list[인덱스].getTitle() == String
		 * list[인덱스].getpublishDate() == Calendar 
		 * 
		 */
		
		// list에 담긴 전체 Book객체의 정보 출력하는 구문 작성하시오.
		
		/*for(int i=0; i<list.length; i++) {
			if(list[i] != null) { //null인 list[4]는 제외
				System.out.println(list[i]);
			}
		}*/
		//포이치
		for( Book bk : list) { //0부터 마지막 인덱스까지 무조건 돌음. 반복
			if(bk != null) { //null인 list[4]는 제외
				System.out.println(bk);
			}
		}
		
		
	}
	
	
	
	// 2. 도서 추가 기능 메소드
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		// 1. 매개변수로 전달받은 newPrice값  ==>      String --> int로 변환 작업  (int price라는 변수에 담으시오)
		int price = Integer.parseInt(newPrice);
		//C_Wrapper 참고. 기본자료형으로 변환은 parse 파싱.
		
		
		
		// --------------------------------------------------------
		// 2. 매개변수로 전달받은 newDate값   ==>        String --> Calendar로 변환 작업    (Calendar publishDate에 담으시오)
		//	  '-'를 구분자로 StringTokenizer 또는 split메소드를 이용하여 문자열 분리 후 각각 년,월,일 을 Calendar에 적용
	
		//B_stringTokenizerTest 참고 
	
		  //1)spilt
		  //newDate == "2023-12-01"
		  String[] date = newDate.split("-"); 		  //분리 "2023" , "12" , "01"
		  
		  //String배열변수 date에 입력받은 값 newDate넣기
		  //파싱 2023, 12, 1
		  int year = Integer.parseInt(date[0]); //"2023" -> 2023
		  int month = Integer.parseInt(date[1]); //입력받은 newDate의 값. 월은 0부터 시작이므로 6월을 입력받았으면 -1해서 5월이 되어야 매칭이 된다.
		  int day = Integer.parseInt(date[2]); //"01" -> 1
				
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
	        Calendar publishDate = new GregorianCalendar(year, month-1, day);
	        //month-1를 int month처럼 입력받은 변수를 기본자료형으로 변환해 줄 때 안하고 Calendar publishDate = new GregorianCalendar(year, month-1, day);여기서 하는 이유는 
	        //GregorianCalendar이 Calendar로 변환시켜주며 월을 0부터 시작하는 내부 메소드와 연결시켜주기 때문.  int month는 리터럴값이 들어간 것이지 제대로 된 날짜(월)함수가 아님.
		
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
		
		//list[4] == > Book객체
		//list[4].getPublishDate(); ->출간일 필드(Calendar객체)
		
		//방법 1
		/*Book book = list[4]; 
        Calendar publishDate = book.getPublishDate(); 
       
		if(list[4] != null) { //확인필요. 3에서 입력받고 인덱스 4(5번)이 나오므로 null이면 실행 x
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
	        String sdfStr = sdf.format(publishDate.getTimeInMillis());
	        //PublishDate는 GregorianCalendar로 Calendar자료형으로 만들어버림. 변환해야함.date로 쓸거면
	    	System.out.println(sdfStr + " 출간");
*/
		
		//방법2.
	 	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 출간");
	    //System.out.println(sdf.format(new Date())); -> 유틸객체있을때
	    System.out.println(sdf.format(list[4].getPublishDate().getTimeInMillis()));
	      
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
			if(list[i] != null && list[i].getTitle().contains(searchTitle) ) {
			 System.out.println(list[i]); 
			 //null이 아니면서 사용자가 검색한 값이 타이틀의 값에 키워드로 들어가있다면 그 i번째의 list 출력 
			}
	      }
	}
}

