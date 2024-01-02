package com.br.chap02_abstract.run;

import com.br.chap02_abstract.model.vo.BasketBall;
import com.br.chap02_abstract.model.vo.FootBall;
import com.br.chap02_abstract.model.vo.Sports;

public class AbstractRun {

	public static void main(String[] args) {
		Sports s = new BasketBall(); //다형성 적용시켜서 부모타입으로 자식객체 활용
		
		Sports[] arr = new Sports[2];
		arr[0] = new BasketBall();
		arr[1] = new FootBall();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
	
		}
		
		for(Sports a : arr) {
			a.rule();
			
			/*
			 * 추상화
			 * 몸통부분에 아직 써야할 것이 없거나 제목만(대분류만) 필요할 때, 더 추가해야할 때 등등 완성이 아닌 미완으로 두고싶을 때 선언 
			 * 클래스 abstract 선언 == 미완성이다라는 표시로 사용할 수도 있음
			 * 
			 * 추상메소드(abstract)
			 * - 미완성된 메소드로 몸통부분이({}) 구현되어있지않은 메소드 
			 * - 자식클래스에서 해당 메소드를 오버라이딩해서 완성시켜야함(실행내용을 정리)
			 * 
			 * 추상클래스(추상메소드가 있으면 무조건 클래스에도 abstract를 붙여야함, 추상메소드가 없어도 선언은 가능)
			 * -미완성된 클래스
			 * -객체생성(new)가 불가함. (단, 레퍼런스 변수로는 선언 가능)
			 * -일반필드 + 일반메소드 + [추상 메소드](생략가능)
			 * ->추상메소드를 가진 클래스는 반드시 추상클래스로 명시해야함
			 * 
			 * 추상메소드가 굳이 없어도 추상클래스로 만들 수는 있다. 
			 * -> 개념적 : 프로그램이 미완성이라는 의미를 부여할 목적으로 사용
			 * -> 프로그램적 :객체 생성이 불가하게끔 하고자할때 
			 * 
			 * 추상메소드를 포함한 채로 추상클래스를 작성하는 이유 
			 * -부모클래스에 추상메소드가 존재할 경우
			 *  자식클래스에서는 강제로 오버라이딩 할 수 밖에 없음
			 *  ->각 자식 클래스마다 동일한 패턴의 메소드를 가지게 됨
			 *  ->메소드 통일성 확보(표준화된 틀을 제공)
			 */
			
		}
	}

	
}
