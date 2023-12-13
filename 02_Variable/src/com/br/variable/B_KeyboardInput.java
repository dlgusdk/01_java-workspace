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
	
	public void inputScanner2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt(); //사용자가 입력한 숫자갑 뽑아지고 엔터는 비워주지않음
		
		//해결방법 버퍼에 남아있는 엔터 비워주기
		sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		//변수 address 에 버퍼에 남아있는 엔터 \n이 들어가 공백이 저장된다. 
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "님은 " + age + "살이며, 사는 곳은 " + address + "이고 키는 " + height + "입니다.");
		
		System.out.printf("%s님은 %d살이며, 사는 곳은 %s이고 키는 %.1f입니다. \n", name, age, address, height);
		
		
		//결론
		//sc.nextxxx()메소드 뒤에 sc.nextLine()메소드가 수행되어야할 경우
		//버퍼에 남아있는 엔터를 비워주기 위해 sc.nextxxx()메소드 뒤에 sc.nextLine(); 구문작성을 해서 버퍼를 비워준다.
		
		//sc.nextLine만 버퍼에서 '엔터'이전까지의 모든 값을 가져온 후에 '엔터(\n)'을 비워주는 역할까지한다
		//그 외의 nextInt,nextDouble등의 메소드는 엔터 이전까지의 값을 가져온 후 엔터를 비워주지않고 남긴다
				
	}
	
	public void inpitScanner3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		//char gender = sc.nextchar(); //nextchar()라는 메소드가 없어서 나는 오류 
		char gender = sc.nextLine().charAt(0);
		
		//특정문자열.charAt(뽑고자하는 인덱스번호);
		//(index는 0으로 시작하므로 첫번째 자리에 쓰여있는 값을 호출)
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.println();
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		
		
	}
	
	public void charAtTest() {
		
		String fruit = "apple";
		
		System.out.println(fruit.charAt(4));
		
		char ch = fruit.charAt(4);
		System.out.println(ch);

	}
	
	//정리
	//1.콘솔창에 출력하기 위해: System.out/prinxx 메소드
	//2. Scanner sc = new Sanner(System.in);
	//sc.next(), sc.nextLine()~
	//sc.nextxxx()메소드 뒤에 sc.nextLine()메소드가 수행되어야할 경우
	//버퍼에 남아있는 엔터를 비워주기 위해 sc.nextxxx()메소드 뒤에 sc.nextLine(); 구문작성을 해서 버퍼를 비워준다.
	
	//문자값을 받기위해 sc.nextLine()으로 먼저 문자열 읽어들이고 .charAt(인덱스 번호)으로 문자추출
	
	
	
}
