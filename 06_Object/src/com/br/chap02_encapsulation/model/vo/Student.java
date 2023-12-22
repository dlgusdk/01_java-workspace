package com.br.chap02_encapsulation.model.vo;

public class Student {
	
	
	private String name;  //private은 같은 클래스 안에서만 접근 가능하므로 외부에서 접근 불가능
	private int age;		//외부에서 보이지않게 '은닉'하는 것 
	private double height;
	private int korScore;
	private int mathScore;
	
	/*메소드부
	 * 
	 * <표현법>
	 * 접근제한자 반환형 메소드명(매개변수, 매개변수 ... (생략가능)){
	 *       //기능구현
	 * }
	 * 
	 * 반환형에 들어갔던 void는 반환할 것이 없다는 의미 (반환값 없을 때 사용)
	 */
	
	//-setter메소드 : 해당 필드에 대입시키고자하는 값 전달 받아 해당 필드에 대입시며주는 기능의 메소드
	//메소드명은 set(임의의 이름);  /낙타 표기법

	//관례상 매개변수명을 필드명과 동일하게 작성
	//public void setName(String newmName){ //String newName =  "xxxx";
		//매개변수 : 해당 메소드 호출시 전달값을 받아주기 위한 변수선언문
		//name = newName;
		
	public void setName(String name){
		//필드name = 매개변수(String name) {
		name = name;  //매개변수name = 매개변수name;
		//필드명과 매개변수명(지역변수)이 동일할 경우
		//해당 영역({})에 해당 변수명 제시시 지역변수를 먼저 가리킴.
		
		//필드name = 매개변수name;
		this.name = name; // this에는 해당 객체의 주소값이 담겨있다.
	
	}
	
	public void setAge(int age){
		this.age = age;

	}

	public void setHeight(double height) {
		this.height = height;

	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;

	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;

	}

	//-getter: 필드의 값을 반환시켜주는 돌려주는 메소드
	/*해당 필드의 담긴 값을 반환해주는 역할 
	 * 메소드명: getXXX
	 */
	public String getName() {
		return name; //name은 문자열이므로 String형을 반환형 자리에 넣어 문자열로 반환해야한다.
		
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public int getKorScore() {
		return korScore;
		
	}
	public int getMathScore() {
		return mathScore;
	}
}
  