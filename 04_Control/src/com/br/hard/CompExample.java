package com.br.hard;

public class CompExample {
	
	public void method4() {
		/*
		  추가문제3. 아래와 같은 형식으로 출력될 수 있도록 중첩 for문을 작성하시오.(미완)
		  
		     1
		    123
		   12345
		  1234567
		 123456789
		  1234567
		   12345
		    123
		     1
		     
	     */
		
		for(int j=1; j<=9; j++) {
			for(int i=1; i<=9; i++) {
				
				if(j == 1 && i == 6) {
					 System.out.print("1");
				}else if(j == 2 && (i >= 4 && i <= 6)) {
					 System.out.print(i-3);
				}else if(j == 3 && (i >= 2 && i <= 6)) {
					 System.out.print(i-1);
				}else if(j == 3 && (i >= 2 && i <= 7)) {
					 System.out.print(i-1);
				}
				
				
			 System.out.print(" ");
				
			}
			System.out.println();
		}
		
		
		
			
	}
		
	
	
	public void method5() {
		
		/*
		 추가문제4. 아래와 같은 형식으로 출력될 수 있도록 중첩 for문을 작성하시오.
		 
		   *
		  * *
		 *   *
		  * *
		   *
		   
		 */
		
		for(int j=1; j<=5; j++) {
			for(int i=1; i<=5; i++) {

				if(j == 1 && i == 3) {
					System.out.print("*");
				}else if(j == 2 && (i == 2 || i == 3)) {
					System.out.print("*");
				}else if(j == 3 && (i == 1 || i == 4 )) {
					System.out.print("*");
				}else if(j == 4 && (i == 2 || i == 3)) {
					System.out.print("*");
				}else if(j == 5 && i == 3) {
					System.out.print("*");
				}
				
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}


		
			
	









