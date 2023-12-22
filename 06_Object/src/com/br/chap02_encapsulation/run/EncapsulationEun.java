package com.br.chap02_encapsulation.run;

import com.br.chap02_encapsulation.model.vo.Student;

public class EncapsulationEun {

	public static void main(String[] args) {
		
		Student hong = new Student();
 		
		/*hong.name = "홍길동";
		hong.age = 20;
		hong.height = 161.3;
		hong.korScore = 100;
		hong.mathScore = 50; //public이 아닌 private이라서 외부에서 직접접근할 수 없음. 
		//hong.name = "홍길동";처럼 쓰면 오류 
		//1.직접적으로 접근해 값을 넣을 수 없으므로 간적접으로 접근해서 값 변경할 수 있도록 setter메소드 생성
	    */
		
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setHeight(161.3);
		hong.setKorScore(100);
		hong.setMathScore(50);
		
		System.out.println(hong);
		
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
		System.out.println(hong.getKorScore());
		System.out.println(hong.getMathScore());
		
		System.out.printf("%s님의 나이는 %d살이고 키는 %.1f입니다.\n", hong.getName(), hong.getAge(), hong.getHeight(),hong.getKorScore(), hong.getMathScore() );
	
		hong.setAge(21);
	}

}

 /*캡슐화 과정까지 적용시켜랴됨. ->완벽한 클래스의 형태
  * 
  * 캡슐화 : 외부로부터 "데이터의 직접 접근을 막고"
  * 대신에 "데이터를 간접적으로나마 처리"할 메소드를 클래스 내부에 작성하는 기법
  * 
  * 1.정보은닉:private
  *  ->멤버변수에 public이 아닌 private이라는 접근제한자 사용.
  *  
  *  2.setter메소드 /getter메소드
  *  ->setter메소드 : 특정 필드에 값을 대입하기 위한 용도의 메소드
  *  ->getter메소드 : 특정 필드 값을 반환시키기 위한 용도, 조회.
  * */

