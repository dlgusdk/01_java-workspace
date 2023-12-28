package com.br.chap02_objectArray.run;

import com.br.chap02_objectArray.model.vo.Phone;

public class ForEachRun {

	public static void main(String[] args) {
		Phone[] arr= new Phone[3];//객체x 배열생성구문 Phone[]타입
		arr[0] = new Phone();
		arr[0].setName("갤럭시");
		arr[0].setName("삼성");
		arr[0].setPrice(1500000);
		
		arr[1] = new Phone("아이폰", "애플", 1500000, "15pro");
		arr[2] = new Phone("벨벳폰", "엘지", 900000, null);
	
		/*for(int i=0; i<arr.length; i++) { //for loop문
			System.out.println(arr[i].information());*/
		
		//	 phone	phone[]
		for(Phone p : arr) { //변수 = arr[0]; -> 변수 = arr[1];
			System.out.println(p.information());
		}
		
		//일괄적으로 모든 핸드폰의 가격을 기존의 가격의 10만원 싸진 가격으로 수정
		/*for(int i=0; i<arr.length; i++) {
			arr[i].setPrice(arr[i].getPrice() - 100000);
		}*/
		
		for(Phone p : arr) {
			p.setPrice(p.getPrice() - 100000);
		}
		for(Phone p : arr) {
			System.out.println(p.information());
		}
		
		
		/*
		
		* for each문(향상된 for문/ 개선된 for문)
		* -자바 5번전 이상부터 쓸 수 있음
		* -배열 또는 컬렉션과 함꼐 사용
		*- 배열 또는 컬렉션 안에 0번 인덱스부터 마지막 인덱스까지
		* 즉, 담겨있는 모든 데이터에 순차적으로 접근할 목적에만 사용
		* 
		* for( 순차적으로 접근되는 값을 담을 변수 선언 : 순차적으로 탐색하고하는 배열) {
		* 	반복적으로 실행 내용
		* 
		* }
		*/
		
		int[] numArr = {10, 20, 30};
		/*for(int i=0; i<numArr.length; i++) { //for loop문 방식
			System.out.println(numArr[i]);
		}*/
				//int    int[]
		for(int value : numArr) { //변수: numArr[0];-> 변수 = numArr[1]; -> 변수 = numArr[2];
			System.out.println(value);
		}
		
	}

}
