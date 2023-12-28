package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductArrayTest {
	public static void main(String[] args) {
		Product[] arr = new Product[3];
		
		arr[0] = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 9600000, 10.0);
		arr[1] = new Product("lgxnote5 ", "LG스마트폰5 ", "경기도 평택 ", 780000, 0.7);

		arr[2] = new Product();
		arr[2].setProductId("ktsnote3");
		arr[2].setProductName("스마트폰");
		arr[2].setProductArea("서울시 강남 ");
		arr[2].setPrice(250000);
		arr[2].setTax(0.3);
		
		
		// for loop문 방식으로 먼저 실행해보고
	      System.out.println("=========================");
	    // 실행 후 for each문으로도 실행해보기

	      for(int i=0;i<arr.length;i++) {
		        arr[i].setPrice(1200000);
		        arr[i].setTax(0.05);
		         
		  }
	      
	      //for(int i=0;i<arr.length;i++) {
	      for(Product p : arr) {
		        //System.out.println(arr[i].information());
		        System.out.println(p.information());

		         
		  }
	      for(Product p : arr) {
	      //for(int i=0; i<arr.length; i++) {
	    	 // System.out.println("상품명 = " + arr[i].getProductName());
	    	 // System.out.println("부가세 포함 가격 = " + (arr[i].getPrice() + arr[i].getPrice() * arr[i].getTax()) + "원");
	    	  System.out.println("상품명 = " + p.getProductName());
	    	  System.out.println("부가세 포함 가격 = " + (p.getPrice() + p.getPrice() * p.getTax()) + "원");
	      }
	      
	    
	      

	   }

	}
