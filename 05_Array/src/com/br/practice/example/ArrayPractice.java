package com.br.practice.example;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1(){
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2(){
		int[] arr = new int[10];
		
		for(int i=arr.length-1; i>=0; i--) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
				
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}	
	}

	 public void practice4(){
		 Scanner sc = new Scanner(System.in);
			
		 System.out.print("문자열 : ");
	     String str = sc.nextLine();
	     
	     System.out.print("문자 : ");
	     char ch = sc.nextLine().charAt(0);
	     
	     char[] arrStr = new char[str.length()];
	     
			
	     int count = 0;
	     for(int i=0; i<arrStr.length; i++) {
	    	 arrStr[i] = str.charAt(i);
	    	 if(ch == arrStr[i]) {
	    		 count++;
	    	 }
	     }
    		 System.out.println("개수 : " + count);

	 }
		 
	  public void practice6(){
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("0부터 6사이 숫자 입력 : ");
		  int num = sc.nextInt();
		  
		  String[] arr = {"월", "화", "수", "목", "금", "토" ,"일"};

		  /*switch(num) {
		  case 0: System.out.print("월요일"); break;
		  case 1: System.out.print("화요일"); break;
		  case 2: System.out.print("수요일"); break;
		  case 3: System.out.print("목요일"); break;
		  case 4: System.out.print("금요일"); break;
		  case 5: System.out.print("토요일"); break;
		  case 6: System.out.print("일요일"); break;
		  default: System.out.print("잘못 입력하셨습니다."); break;
		  } */
		  
		  String result = "";
		  if(num < 7 && num >= 0) {
			  for(int i=0; i<arr.length; i++) {
				  result = arr[num]; 	
			  }
			  System.out.print(result + "요일");		  
		  }else {
			 System.out.print("잘못 입력하셨습니다.");
		  }
	  }
	  
	  public void practice7(){
		  Scanner sc = new Scanner(System.in);
		  
		  
		  
	  }

	  public void practice8(){
		 Scanner sc = new Scanner(System.in);
		  		
	     while(true){
	    	 System.out.print("정수 : ");
	    	 
			 int num = sc.nextInt(); 
			 			 
	    	 if(num % 2 == 0 || num < 3) {
	    		 System.out.print("다시 입력하세요.\n"); continue;
			 
	    	 }else {
				 int[] arr = new int[num]; 

	    		 for(int i=0; i<((arr.length)/2)+1; i++){
	    			 arr[i] = i + 1;
	    			 System.out.print(arr[i] + " "); 
	    			 
	    		 }
			 
	    		 for(int j=((arr.length)/2); j>0; j--){
	    			 arr[j] = j;
	    			 System.out.print(arr[j] + " "); 

	    		 }
	    		 System.out.println(); break;

		 		}
	     }
	  }
	  
	  
	  
}



	



