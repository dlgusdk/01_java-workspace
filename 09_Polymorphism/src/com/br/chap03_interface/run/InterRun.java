package com.br.chap03_interface.run;

import com.br.chap03_interface.model.vo.Baby;
import com.br.chap03_interface.model.vo.Basic;
import com.br.chap03_interface.model.vo.Mother;

public class InterRun {

	public static void main(String[] args) {
		/*
		 * Person(부모) 
		 * (자식)
		 * Mother 
		 * Baby
		 * 
		 */
		
		//Person p = new Person(); - 불가
		
		//Basic b = new Basic(); - 인터페이스도 객체 생성 불가
		
		Basic mom = new Mother("김엄마", 50, 70 , "출산"); //다형성 적용해서 사용 가능
		Basic baby = new Baby("강아기", 4.5, 80); // 
	
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat();
		mom.sleep();
		
	}

}
