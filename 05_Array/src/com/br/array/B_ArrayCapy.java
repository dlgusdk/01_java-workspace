package com.br.array;

import java.util.Arrays;
import java.util.Scanner;

public class B_ArrayCapy {
	  public void method1() {
	      //int 배열명 origin {1,2,3,4,5}
	      int[] origin = {1,2,3,4,5};
	      
	      System.out.println("== 원본 배열 출력 ==");
	      for(int i=0; i<origin.length; i++) {
	         System.out.print(origin[i] + " ");
	      }
	      System.out.println();
	   
	      int[] copy = origin; //int copy배열에 기존배열을 대입함으로써 복사
	      System.out.println("== 복사본 배열 출력 ==");
	      for(int i=0; i<copy.length; i++) {
	         System.out.print(copy[i] + " ");
	      }
	      System.out.println("\n");
	      
	      copy[2] = 99; //복사한 값
	      System.out.println("-- 복사본 배열값 수정 후 --");
	      System.out.println("== 원본 배열 출력 ==");
	      for(int i=0; i<origin.length; i++) {
	         System.out.print(origin[i] + " ");
	      }
	      System.out.println();
	      System.out.println("== 복사본 배열 출력 ==");
	      for(int i=0; i<copy.length; i++) {
	         System.out.print(copy[i] + " ");
	      }
	      System.out.println("\n");
	      System.out.println("origin 주소값 : " + origin.hashCode());
	      System.out.println("copy 주소값 : " + copy.hashCode());

	    //copy본과 origin이 참조하는 주소값(인덱스)는 같기때문에 카피를 수정하면 원본도 고쳐진다. 
	   }
	  
	  public void method2() {
		  //1.for문을 활용한 방법
		  // 1)새로운 배열 생성
		  // 2)반복문을 돌려서 원본배열의 각 인덱스 값들을 새로이 만든 배열의 각 인덱스에 대입
		  
		  int[] origin = {1,2,3,4,5};
		  int[] copy = new int[5]; //[0,0,0,0,0} JVM이 자동으로 값 0 삽입
		  
		  for(int i=0; i<origin.length; i++) {
			  copy[i] = origin[i]; //copy의 인덱스 i번에 접근해서 origin 인덱스 i번째 값을 대입(총 origin.length 만큼 반복) 
		  }// (int[] copy = {1,2,3,4,5};)
		  
		  copy[2] = 99; //{1,2,99,4,5}
		  System.out.println("==원본배열==");
		  for(int i=0; i<origin.length; i++) {
			  System.out.print(origin[i] + " ");
		  }
		  
		  System.out.println("\n==복사본 배열==");
		  for(int i=0; i<origin.length; i++) {
			  System.out.print(copy[i] + " ");
		  }
		 
		  System.out.println("\norigin 주소값 : " + origin.hashCode());
		  System.out.println("copy 주소값 : " + copy.hashCode());
	  }
	  
	  
	  public void method3() {
		  //2.새로운 배열 생성한 후 System 클래스의 arrcopy 메소드 이용한 복사
		  int[] origin = {1,2,3,4,5};
		  int[] copy = new int[10]; //{0이 10개}
		  
		  //System.arraycopy(카피할원본배열명, 복사시작할인덱스, 복사본배열명, 채워넣을시작인데스, 복사할 갯수);
		  System.arraycopy(origin, 2, copy, 3, 3);
		  
		  for(int i=0; i<copy.length; i++){
			 System.out.print(copy[i] + " "); 
		  }
		  
		  System.out.println("\n\norigin 주소값 : " + origin.hashCode());
		  System.out.println("copy 주소값 : " + copy.hashCode());
		  //주소값이 다름 ->서로 다른 배열참조

	  }
	  
	  public void method4() {
		  //3.Arrays클래스의 copyOf()메소드 사용
		  int[] origin = {1,2,3,4,5};
		  //복사본 배열 = Arrays.copyOf(원본배열명, 복사할갯수(길이);
		  int[] copy = Arrays.copyOf(origin, 10);
		  //Arrays.copyOf()호출시 내가 전달한 길이만큼의 새로운 배열이 생성된다. origin은 5지만 Arrays.copyOf로 10을 지정했으므로 10으로 늘어남.
	 	 // System.Arrayscopy()메소드가 실행되면서 내부적으로 복사가 진행된다. 이때 내가 전달한 길이가 원본 배열의 크기보다 클 경우  -> 원본배열의 전체값이 다 복사
		  for(int i=0; i<copy.length; i++) {
			  System.out.print(copy[i] + " ");
		  }
		  
		  System.out.println("\n\norigin 주소값 : " + origin.hashCode());
		  System.out.println("copy 주소값 : " + copy.hashCode());
	  }
	  
	  
	  public void method5() {
		  //4.cline()메소드 활용
		  //인덱스 지정 x, 크기 지정 또는 복사할 갯수 지정 x
		  int[] origin = {1,2,3,4,5};
		  //복사열 배열 = 원본배열.clone() ;
		  int[] copy = origin.clone();
		  
		  for(int i=0; i<copy.length; i++) {
			  System.out.print(copy[i] + " ");
		  }
		
		  System.out.println("\norigin의 주소값 : " + origin);
		  System.out.println("copy의 주소값 : " + copy);
	  }
	  	
	  public void method6() {
		  int[] arr = new int[3];
	
		  for(int i=0; i<arr.length; i++) {
			  arr[i] = i+1;
		  }
		  for(int i=0; i<arr.length; i++) {
			  System.out.println(arr[i]);
		  }
		  
		  Scanner sc= new Scanner(System.in);
		  System.out.print("추가하고자하는 값의 갯수 : ");
		  int addSize = sc.nextInt();
		  //기존의 배열의 크기 + addSize 만큼의 새로운 배열 생성
		  //후 기존에 담겨있던 3개의 값이 복사 
		  
		  // 복사진행 전에 기존의 배열길이 -> 특정 변수에 기록
		  int length = arr.length; //3
		  
		  arr = Arrays.copyOf(arr, arr.length + addSize);
		  //arr.length == 3+ addSize

		  for(int i=length; i<arr.length; i++) {
			  System.out.print("추가하고자 하는 값 : ");
			  arr[i] = sc.nextInt();
		  }
		  
		  for(int i=0; i<arr.length; i++) {
			  System.out.println(arr[i]);
		  }
	}
}
