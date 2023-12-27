package com.br.chap01_oneVsmany.run;

import java.util.Scanner;

import com.br.chap01_oneVsmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {		
		//방법1. 기본생성자로 생성한 후 setter메소드를 이용해서 값 초기화
		/*Book bk = new Book();
		bk.setTitle("자바의 정석");
		bk.setAuthor("강개똥");
		bk.setPrice(100);
		bk.setPublisher("문학");
		*/
		
		//방법2. 매개변수 생성자를 통해 생성과 동시에 값 초기화
		/*Book bk = new Book("자바의 정석", "강개똥", 10000, "문학동네");
		System.out.println(bk.information());
		*/
		
		//[응용] 사용자에게 입력받은 값으로 초기화
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("출판사명 : ");
		String publisher = sc.nextLine();
		
		Book bk = new Book(title, author, price, publisher);
		System.out.print(bk.information());*/
		
		//세 개의 book 객체를 관리해야할 경우
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		//세 도서에 대한 정보를 반복적으로 사용자에게 입력받기 -> 입력받은 후 각 객체 생성
		for(int i=0; i<3; i++) {
			System.out.println(i+1 + "번째 도서 정보 입력");
			
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			
			System.out.print("저자명 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사명 : ");
			String publisher = sc.nextLine();
			
			//매번 조건검사 후 각각의 객체 생성해야함
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);
			}else if(i == 1) {
				bk2 = new Book(title, author, price, publisher);
			}else {
				bk3 = new Book(title, author, price, publisher);
			}
			
		}//객체생성 끝
		//현재 보유하고 있는 모든 도서 정보 출력
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		//도서 제목으로 검색하는 서비스
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		//bk1 ~ bk2 모든 도서의 도서명과 일일히 비교하여 일치하는 도서 정보 출력
		if(bk1.getTitle().equals(search)) {
			System.out.print(bk1.information());
			
		}
		
		if(bk2.getTitle().equals(search)) {
			System.out.print(bk2.information());
		}
		
		if(bk3.getTitle().equals(search)) {
			System.out.print(bk3.information());
		}
		
	}

}
