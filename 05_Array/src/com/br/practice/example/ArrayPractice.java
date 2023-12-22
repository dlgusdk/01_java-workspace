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
			 			 
			 //2.조건문을 이용해서 잘 입력했는지 판별
	    	 if(num % 2 == 0 || num < 3) {
	    		 System.out.print("다시 입력하세요.\n"); continue;
			 
	    		 //3_1.배열생성(크기는 사용자가 입력한 수만큼)
	    		 //3_2. 배열의 각 인덱스에 값 담기
	    		 //3_3. 배열의 각 인덱스에 담긴 값 출력
	    		 //4.반복문 빠져나가도록
	    		 
	    		 /*
	    		  * {1,2,3,2,1} 2번 인덱스까지 증가된 값 그 이후 -1
	    		  * {1,2,3,4,3,2,1,} 3번 ~
	    		  *  0번 ~ 중강인덱스(배열의길이/2)까지 1씩 증가된 값담고 그 이후로느 감소
	    		  */
	    	 }else {
				 int[] arr = new int[num]; 

				 //int value =1;
	    		 for(int i=0; i<((arr.length)/2)+1; i++){
	    			 arr[i] = i + 1;
	    			 System.out.print(arr[i] + " "); 
	    			 
	    		 }
	    		 /*
	    		  for(int i=0; i<arr.length; i++){
	    			 arr[i] = value;
	    		  		
	    		  		if((i < arr.length)/2){
	    		  			value++;
	    		  		}else {
	    		  		    value--;
	    		  		}
	    		  }
	    		  		
	    		  for(int i=0; i<arr.length; i++){
	    		  	if((i < arr.length)-1){
	    			 System.out.print(arr[i] + " "); 
	    		  		}else {
	    			 		System.out.print(arr[i] + " "); 
	    		  		}
	    		  }
		
	    		  */
			 
	    		 for(int j=((arr.length)/2); j>0; j--){
	    			 arr[j] = j;
	    			 System.out.print(arr[j] + " "); 

	    		 }
	    		 System.out.println(); break;

		 		}
	     }
	  }
	  
	  
	  
}



	



