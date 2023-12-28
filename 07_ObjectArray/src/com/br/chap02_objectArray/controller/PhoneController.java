package com.br.chap02_objectArray.controller;

import com.br.chap02_objectArray.model.vo.Phone;

public class PhoneController {

	//사용자의 요청을 받아서 처리해주는 용도의 클래스 == controller패키지에 주로 보관
	
	//핸드폰들 전체 조회하는 기능
	public void selectAllPhone(Phone[] phones) { //Phone[] phones매개변수 필요 import도
		for(int i=0; i<phones.length; i++) {
			System.out.println(phones[i].information());
		}
	}
	
	//핸드폰들의 평균가 구하는 기능
	public double selectPhoneAvgPrice(Phone[] phones) {
		double total = 0;
		for(int i=0; i<phones.length; i++) {
			total += phones[i].getPrice();
		}
		return total / phones.length;
	}
	
	
	// 핸드폰명과 또는 시리즈를 입력해서 해당 가격을 알려주는 기능
	public int[] selectBuyPhonePrice(Phone[] phones, String keyword) {
		int[] prices = new int[phones.length]; //{0,0,0,0}
		for(int i=0; i<phones.length; i++) {
			if((phones[i].getName()+phones[i].getSeries()).contains(keyword)) {
				//해당 그 객체의 가격을 출력
				prices[i] = phones[i].getPrice();
			}
		}
		
		//만일 1번, 2번 인덱스의 Phone객체가 찾아졌다면 
		//prices == {0, 100000, 1500000, 0}
		//만일 단 한개도 일치하는걸 못찾았을 경우 
		//prices == {0,0,0,0)
		
		//즉, prices배열 안의 모든 값이 0일 경우 -> 일치하는 걸 못찾았음.
		
		return prices; //가격 값들이 들어있는 배열 반환 int[] prices
	}
	
}
