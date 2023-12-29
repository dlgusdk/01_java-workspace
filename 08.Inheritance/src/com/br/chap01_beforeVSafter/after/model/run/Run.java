package com.br.chap01_beforeVSafter.after.model.run;

import com.br.chap01_beforeVSafter.after.model.vo.Desktop;
import com.br.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.br.chap01_beforeVSafter.after.model.vo.Tv;

public class Run {
	public static void main(String[] args) {
	  /*
	   * 상속
	   * -부모 자식간의 구조로 클래스를 구성하는 것
	   *  다름 클래스가 가지고 있는 필드 및 메소드들을 새로 작성할 필요없이 마치 내것처럼 사용할 수 있음
	   * 
	   * 상속 장점
	   * -중복된 코드를 한 번 작성해두면 새로운 클래스 작성시보다 적은 양의 코드로 작성 가능
	   * -중복된 코드를 별도로 관리하기 때문에 새로운 코드를 추가한다거나 기존의 코드를 변경할 때 용이 (프로그램의 생산성과 유지보수에 크게 기여)
	   */
		
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 2000000, true);
		//d.setBrand("엘지");
		
		Tv t = new Tv("엘지", "t-03", "겁나얇은티비", 3500000, 45);
		//d.setBrand("엘지");
		
		SmartPhone s = new SmartPhone("애플", "s-02", "티비", 2500000, "Df");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		s.setPrice(1500000); //부모클래스 실행
		s.setMobileAgency("Df"); //자식클래스 실행
		//System.out.println(s.information()); //자식 실행 자식이 부모보다 우선순위가 높다

		/*
		 * 상속의 특징
		 * 자식 객체를 통해 부모클래스에 있는 메소드를 마치 내것처럼 호출 가능
		 * 부모 클래스에 있는 메소드를 오버라이딩해서 자식클래스에서 재정의 가능
		 *  ->오버라이딩하면 자식클래스에 있는 메소드가 우선권을 가짐
		 *  클래스간의 상속은 다중 상속이 불가능하다(단일상속만 가능)
		 *  모든 클래스는 Object 클래스를 상속 받고 있다.
		 *  즉,Object 클래스가 모든 클래스의 최상위 클래스
		 *  ->즉, 모든 클래스는 Object클래스의 메소드들을 마치 내것처럼 호출가능
		 *    -> Object클래스에 있는 메소드가 맘에 안들면 재정의해서 사용 가능(오버라이딩)
		 */
		
	}
	
}
