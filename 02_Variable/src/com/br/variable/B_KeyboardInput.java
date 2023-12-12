package com.br.variable;

import java.util.Scanner;

public class B_KeyboardInput {

	public void inputScnnaer1() {
		
		/*
		 * java.util.Scanner 클래스를 이용해서 사용자가 키보드로 입력한 값 읽을 수 있음.
		 
		 * Scanner클래스 내의 특정 메소드 호출
		 */
		Scanner sc = new Scanner(System.in); //System.in 입력된 값을 byte단위로 읽어들이겠다.
		
		
		System.out.print("당신의 이름은 무엇입니까 : ");
		
		//사용자가 입력한 값을 문자열로 읽어들이는 메소드(next(), nextLine())
		//String name = sc.next(); //공백 읽어들이지 x
		String name = sc.nextLine(); //공백 포함 전체구문 읽어들일 수 있음.
		
		System.out.print("당신의 나이는 몇 살입니까 : ");
		
		//사용자가 입력한 값을 정수값으로 읽어들이는 메소드(nextInt)
		int age = sc.nextInt();
		
		
		System.out.print("당신의 키는 몇입니까 : ");
		
		//사용자가 입력한 값을 실수값으로 읽어들이는 메소드(nextDouble)
		double height = sc.nextDouble();
		
		//xxx님은 xx살이며, 키는 xxx cm입니다.
		System.out.printf("%s님은 %d살이며 %.1fcm입니다.", name, age, height);
		//System.out.printf(name + "님은" + age + "살이며, 키는" + height + "cm입니다.");

		

		
	}
	
	
	
	
	
	
}
