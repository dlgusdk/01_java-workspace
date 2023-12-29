package com.br.chap03_override.run;

import com.br.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		Book bk1 = new Book("수학의 정석", "나수학", 100);
		Book bk2 = new Book("칭찬은 고래도 춤추게한다", "고래", 200);
		
		System.out.println(bk1);
		System.out.println(bk2.toString());
		
		/*
		 * 레퍼런스(참조변수,)를 출력할 때
		 * JVM이 자동으로 해당 래퍼런스.toStrig 메소드 호출 시켜서 반환된 값을 출력
		 * 
		 
		 *오버라이딩 전:object클래스 toString()메소드 -> "풀클래스명 + @ + 주소값의 16진수값"
		 * 오버라이딩 후 : BOOK클래스 toString() 메소드 -> 해당 객체가 가지고 있는 모든 필드값을 한 문자열로 합쳐 반환
		 * 
		 * 동일 객체로 판변되려면 : equals() 메소드 수행시 true여야만 하고 뿐만 아니라 hashCode()값이 일치해야만 함.
		 */
		
		Book bk3 = new Book("수학의 정석", "나수학", 100); //bk1객체와 내용물(필드값) 동일함
		//수학의 정석나수학 100
		
		/*
		 * 
		 * bk1 bk3 각 필드값 모두 일치
		 * 두 객체간에 모든 필드값들이 다 일치하면 동일객체로 판별되었으면 좋겠음
		 * 
		 */
		
		System.out.println("bk1과 bk3가 같은 책입니까? : " + (bk1 == bk3)); //false
		//equals() : 두 주소값을 비교해서 반환
		//BOOK클래스의 equals() 
		
		System.out.println("bk1과 bk3가 같은 책입니까? : " + bk1.equals(bk3)); //false
		System.out.println("bk1의 해쉬코드값 : " + bk1.hashCode());
		System.out.println("bk3의 해쉬코드값 : " + bk3.hashCode());
		//Object클래스의 hashCode(): 주소값 가지고 10진수 값 만들어 반환 
		//BOOK클래스의 hashCode() : 실제 필드값 가지고 숫자 만들어 반환
		System.out.println("bk2의 해쉬코드값 : " + bk2.hashCode());
		System.out.println(bk1.toSting());
		

	}

}
