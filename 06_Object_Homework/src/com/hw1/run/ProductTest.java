package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		//set,get
		Product pro = new Product();

		pro.setProductId("ssgnote9");
		pro.setProductName("갤럭시노트9");
		pro.setProductArea("경기도 수원");
		pro.setPrice(9600000);
		pro.setTax(10.0);
		//System.out.print(pro.information());

		System.out.print(pro.getProductId() + " ");
		System.out.print(pro.getProductName() + " ");
		System.out.print(pro.getProductArea() + " ");
		System.out.print(pro.getPrice() + " ");
		System.out.println(pro.getTax() + " ");
		
		//매개변수
		Product pro1 = new Product("lgxnote5 ", "LG스마트폰5 ", "경기도 평택 ", 780000, 0.7); 
		System.out.println(pro1.information());
		
		Product pro2 = new Product("ktsnote3 ", "KT스마트폰3 ", "서울시 강남 ",  250000, 0.3);
		System.out.print(pro2.information());
		
		System.out.println("\n====================================");

		pro.setPrice(1200000);
		pro1.setPrice(120000);
		pro2.setPrice(120000);
		
		pro.setTax(0.05);
		pro1.setTax(0.05);
		pro2.setTax(0.05);
		
		System.out.println(pro.information());
		System.out.println(pro1.information());
		System.out.print(pro2.information());
		
		System.out.println("\n====================================");

		System.out.printf("상품명 = %s\n부가세 포함 가격 = %d\n", pro.getProductName(), pro.getPrice() + (int)(pro.getPrice() * pro.getTax()));
		System.out.printf("상품명 = %s\n부가세 포함 가격 = %d\n", pro1.getProductName(), pro1.getPrice() + (int)(pro1.getPrice() * pro1.getTax()));
		System.out.printf("상품명 = %s\n부가세 포함 가격 = %d\n", pro2.getProductName(), pro2.getPrice() + (int)(pro2.getPrice() * pro2.getTax()));

	}

}
