package com.br.chap04_field.model.vo;

public class FieldTest3 {
	//필드부 
	//접근제한자 [예약어] 자료형 변수명;
	
	//static 공유의 개념
	//static 붙은 애들은 프로그램 실행과 동시에 메모리 static 영역에 올라감
	
	public static String sta = "static_FieldTest3";
	
	//static :공유의 개념 
	//final:상수의 개념(한번 지정된 값 변경 x)
	//상수필드(static final) : 프로그램 시작시 값이 저장되면 더이상 변경되지 않고 공유하면서 사용할 목적 
	public static final String STA_FIN = "static_final";


 //"static_final"
	//public static final String STA_FIN = "static_final"; // 형태가 static 이면서 final 상수로 반환하는 
}
