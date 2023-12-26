package com.br.chap03_class.run;

import java.util.Scanner;

import com.br.chap03_class.model.vo.Product;
import com.br.chap03_class.model.vo.Snack;

public class RemindRun {

	public static void main(String[] args) {
		Snack c = new Snack();
		Scanner sc = new Scanner(System.in);
		/*
		 * 객체지향프로그래밍: 현실세계에서의 객체간의 상호작용을 가상세계로 구현하는 과정
		 * 클래스: 구현하고자하는 프로그램상의 필요한 객체들의 속성값들을 담아내기위한 그릇같은 존재
		 * 추상화: 필요한 객체들 -> 공통적인 속성 및 기능 나열 -> 프로그램의 실질적인 목적에 맞춰 불필요한걸 제거 
		 * 캡슐화: 외부의 데이터 접근을 제한(데이터 보호) / 단, 간접적으로 처리할 메소드(getter, setter)로 같이 
		 */
		
		//객체생성과정(인스턴스화) 자바에서의 객체 ==인스턴스
		
	/*
		c.setsName("수미칩");
	    //c.setBrand("농심");
	    c.setPrice(1000);
	    c.setKcal(400);
	      
	    System.out.println(c.information());
	    
	    System.out.println("회사명: " + Snack.BRAND);
	    
		System.out.println("=========");
		
		System.out.print("등록하고자 하는 과자명 : ");
		
		//String sName = sc.nextLine();
		//meok.setsName(sName);
		c.setsName(sc.nextLine());
		
		/*System.out.print("등록하고자 하는 과자의 브랜드명 : ");	
		String brand = sc.nextLine();*/
		
		/*System.out.print("등록하고자 하는 과자의 가격 : ");	
		c.setKcal(sc.nextInt());
		
		System.out.print("등록하고자 하는 과자의 칼로리 : ");	
		c.setPrice(sc.nextInt());
		
		System.out.println(c.getsName());
		//System.out.println(c.getBrand());
		System.out.println(c.getPrice());
		System.out.println(c.getKcal());
		*/
		
		
		//매개변수 사용
		Snack s1 = new Snack("수미칩", 1000, 400);
		System.out.println(s1.information());
		
		//set사용
		s1.setKcal(550);
		System.out.println(s1.information());
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("과자명 : ");
		String sName = sc1.nextLine();
		System.out.print("가격 : ");
		int price = sc1.nextInt();
		System.out.print("칼로리 : ");
		int kcal = sc.nextInt();

		Snack meok = new Snack(sName, price, kcal);

		System.out.println(meok.information());
		}
	}


