package com.br.chap01_beforeVSafter.before.run;

import com.br.chap01_beforeVSafter.before.model.vo.Desktop;
import com.br.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.br.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {

		//Desktop객체생성
		Desktop d = new Desktop("삼성", "d-01", "짱좋은데스크탐", 20000);
		
		//tv객체 생성
		Tv t = new Tv("엘지", "t-03", "겁나얇은티비", 3500000, 65);
		
		SmartPhone s = new SmartPhone("애플", "s-02", "아이폰15pro", 1700000, "KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		/*
		 * 상속
		 * -부모(상위)클래스/ 자식(하위)클래스로 표현가능
		 * -부모클래스로 매 자식클래스마다 작성해야되는 공통적인 코드를 한번만 정의해두면 매 자식클래스를 작성할 때 간결해짐
		 * 
		 * 세 클래스의 공통적인 코드
		 * -brand, pCode, pName, information메소드
		 * -네가지 필드의 get/setter메소드, information메소드
		 */
		
	}

}
