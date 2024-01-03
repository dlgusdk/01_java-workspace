package com.br.chap03_interface.run;

import com.br.chap03_interface.model.vo.Animal;
import com.br.chap03_interface.model.vo.Dog;
import com.br.chap03_interface.model.vo.Dolphin;
import com.br.chap03_interface.model.vo.Eagle;
import com.br.chap03_interface.model.vo.Flyable;
import com.br.chap03_interface.model.vo.Moveable;
import com.br.chap03_interface.model.vo.Swimable;

public class AnimalRun {
	public static void main(String[] args) {
		Animal[] arr = new Animal[3];
		arr[0] = new Dolphin("돌핀", "남방큰돌고래");
		arr[1] = new Dog("뽀삐", "말티즈");
		arr[2] = new Eagle("멋쟁이", "대머리독수리");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].bark());
			
			if(arr[i] instanceof Swimable){
				((Swimable)arr[i]).swim();
				((Swimable)arr[i]).dive();
			}
			if(arr[i] instanceof Moveable){
				((Moveable)arr[i]).forward();
				((Moveable)arr[i]).back();
				((Moveable)arr[i]).jump();

			}
			if(arr[i] instanceof Flyable){
				((Flyable)arr[i]).fly();
			

			}
			System.out.println();
			
			/*
			 * 클래스에서 클래스를 상속받을 때 : 클래스 extends 클래스 (단일상속만 가능) : 화살표 "실선"
			 * 클래스에서 인터페이스를 구현할 때 : 클래스 implements 인터페이스, 인터페이스...(다중상속 가능) :화살표 "점선"
			 * 인터페이스에서 인터페이스를 상속 : 인터페이스 extends 인터페이스, 인터페이스...(다중상속 가능)
			 * 클래스는 인터페이스를 구현하며 인터페이스는 클래스가 해당 행동을 구현하도록 강제하는 일종의 도구, 인터페이스는 클래스를 상속하는게 아니기에 
			 * 인터페이스는 클래스를 상속할 수 없음. 
			 */
			
		/*   |         추상클래스           			|            인터페이스
			=====================================================
			|일반필드 가질 수 있음      	    	    | 오직 상수만(public static final은 생략가능)		
			|일반메소드 가질 수 있음 					| 일반메소드 가질 수 없음
			|추상메소드 0개 이상(생략가능)abstract 필수 사용	| 1개 이상 필수, public abstract 생략가능 
			|extends 사용 						| implements 사용
			|단일상속 								| 다중상속
			
			*extends 일반클래스 -> extends 추상클래스 -> implements 인터페이스(점점 더 강제성이 짙어짐, 규약이 쎄짐)
			*
			*
			*
			*/
		}	
		
	}
}
