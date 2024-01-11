package com.hw1.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.hw1.controller.BookController;
import com.hw1.model.vo.Book;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("=== 메인 메뉴 ===");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제하기");
			System.out.println("0. 프로그램 종료하기");
		
			System.out.println("\n 메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
		
			switch(menu){
			case 1: insertBook(); break;
			case 2: selectList(); break;
			case 3: searchBook(); break;
			case 4: deleteBook(); break;
			case 0: System.out.println("프로그램 종료"); return;
			default : System.out.println("다시 선택해주세요.");
			}
		}
	}
	
	public void insertBook() {
		System.out.println("도서명 : ");
		String bn = sc.nextLine();
		
		System.out.println("저자명 : ");
		String ba = sc.nextLine();
		
		System.out.println("장르번호 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
		String bs = sc.nextLine();
		
		System.out.println("가격 : ");
		String bp = sc.nextLine();
	
		bc.insertBook(bn, ba, bs, bp);
		
		System.out.println("성공적으로 추가되었습니다.");
	}

	public void selectList() {
		ArrayList<Book> select = bc.selectList();
		
		if(select.isEmpty()) { 
			System.out.println("존재하는 도서가 없습니다.");
		}else {
			for(int i=0; i<select.size(); i++) {
				System.out.println(select.get(i));
			}
		}
		
	}

	public void searchBook() {
		
		while(true) {
		System.out.println("===== 검색 메뉴 =====");
		System.out.println("1. 도서명으로 검색");
		System.out.println("2. 저자명으로 검색");
		System.out.println("3. 도서명+저자명으로 검색");
		System.out.println("0. 뒤로가기 ");
		
		System.out.println("메뉴 번호 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1: break;
		case 2: break;
		case 3: break;
		case 4: continue;
		}
		
		System.out.println("검색할 키워드 : ");
		String key = sc.nextLine();
		
		ArrayList<Book> search = bc.searchBook(menu, key);
		
		if(search.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for(int i=0; i<search.size(); i++) {
				System.out.println(search.get(i));
			}
		}
	  }
	}
	
	public void deleteBook() {
		System.out.println("삭제할 도서명 : ");
		String db = sc.nextLine();
		
		System.out.println("삭제할 저자명 : ");
		String da = sc.nextLine();
		
		int result = bc.deleteBook(db, da);
		
		if(db == null && da == null) {
			System.out.println("성공적으로 삭제되었습니다.");
		}else {
			System.out.println("삭제할 도서가 존재하지 않습니다.");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


