package com.br.chap01_poly.run;

import com.br.chap01_poly.controller.ElectronicShop2;
import com.br.chap01_poly.model.vo.Desktop;
import com.br.chap01_poly.model.vo.NoteBook;
import com.br.chap01_poly.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
		//납품업체
		
/*
		//1.다형성 적용 x (ElectronicShop1)
		ElectronicShop1 es = new ElectronicShop1();
		
		//납품하는 중
		es.insert(new Desktop("samsung", "데탑", 1200000, "Geforce3040"));
		es.insert(new NoteBook("Lg", "그램", 1800000, 4));
		es.insert(new Tablet("Apple", "아이패드", 200000, true));
	
		//조회
		Desktop d = es.selectDesktop();
		NoteBook n = es.selectNoteBook();
		Tablet t = es.selectTablet();

		System.out.println(d);
		System.out.println(n);
		System.out.println(t);*/
	
		
		//2.다형성 적용 o (ElectronicShop2) 
		ElectronicShop2 es = new ElectronicShop2();
		
		es.insert(new Desktop("samsung", "데탑", 1200000, "Geforce3040"));
		es.insert(new NoteBook("Lg", "그램", 1800000, 4));
		es.insert(new Tablet("Apple", "아이패드", 200000, true));
		
		Desktop d = (Desktop)es.select(0);
		Tablet t = (Tablet)es.select(2);
		NoteBook n = (NoteBook)es.select(1);
		
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		/*
		 * 다형성을 사용하는 이유 
		 * 1. 부모타입의 배열로 다양한 자식객체들을 받을 수 있음
		 * 2. 메소드 정의시 매개변수로 부모타입을 적용시키면 메소드의 갯수가 확 줄어들음
		 * ->Object클래스에 equals메소드의 매개변수가 Object로 되어있음
		 * 학생객체.equals(학생객체)
		 * 도서객체.equals(도서객체)
		 * 제품객체.equals(제품객체)...
		 * 어던 자료형의 객체든 다 전달받아야 할 경우 모든 클래스의 최고 조상인  Object클래스타입으로 쓰면된다. 
		 */
	}
}
