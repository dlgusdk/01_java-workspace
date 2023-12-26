package com.br.chap04_field.run;

import com.br.chap04_field.model.vo.FieldTest1;
import com.br.chap04_field.model.vo.FieldTest2;
import com.br.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {

		FieldTest1 f1 = new FieldTest1();
		//f1.test(5);
		//f1 = null;
		//System.out.println("프로그램을 종료합니다.");
		
		FieldTest2 f2 = new FieldTest2();
		/*System.out.println(f2.pub);
		System.out.println(f2.pro); 
		System.out.println(f2.def); 
		System.out.println(f2.pri);*/
		
		//해당 클래스가지고 생성필요없음.(이미 메모리상에 올라가고있음. 단, 클래스명. 으로 접근해야함.)
		System.out.println(FieldTest2.sta);
		System.out.println(FieldTest3.sta);

		FieldTest3.sta = "ㅋㅋㅋ";
		System.out.println(FieldTest3.sta);
		
		System.out.println(FieldTest3.STA_FIN);
		//FieldTest3.STA_FIN = "ㅎㅎㅎ";

		System.out.println(Math.PI);
	}
	
}
