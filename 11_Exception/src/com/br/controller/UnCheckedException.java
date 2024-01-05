package com.br.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedException {

	/*
	 * *RunTimeException -프로그램 실행시 발생되는 예외들(런타임에러)
	 * 
	 * *ReunTimeException의 후손들 -IndexOutOfBoundsException : 부적절한 인덱스로 접근했을 때 발생되는 예외
	 * -NullPointException : 레퍼런스가 null인 상태에서 뭔가에 접근했을 때 발생되는 예외
	 * -ArithmeticException : 나누기 연산시 0으로 나눠질 때 발생되는 예외 -ClassCastExtion : 허용할 수 없는
	 * 형변환이 진행될 때 발생되는 예외 -NegativeArraySizeException : 배열의 크기를 음수로 지정했을 경우 발생되는 예외
	 * ...
	 * 
	 * ->RuntimeException 관련 예외들은 충분히 예측가능해서 애초에 예외가 발생이 안되게 조건문을 적절히 활용하면 해결가능 *
	 */

	Scanner sc = new Scanner(System.in);

	public void method1() {
		System.out.println("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 : ");
		int num2 = sc.nextInt();

		// int result = num1 / num2; //num2가 0일경우 ArithmeticException 예외발생 -> 프로그램이 종료
		/*
		 * 해결방법1. 애초에 예외가 발생이 안되게 조건처리
		 */
		/*
		 * if(num2 != 0) { int result = num1 / num2; System.out.println("result :" +
		 * result); }else { int result = num1 / num2; System.out.println("result : " +
		 * result); }
		 */

		// 해결방법2. 예외처리(예외가 발생했을 때 실행할 구문을 미리 작성해두는 것)
		/*
		 * try ~ catch 구문 try{ 예외가 발생될 수 있는 구문 }catch(발생될 예외클래스 매개변수) { 해당 예외가 발생했을 경우
		 * 실행시킬 구문 }
		 * 
		 * 
		 */

		try {
			int result = num1 / num2;
			System.out.println("result : " + result);

		} catch (ArithmeticException e) {
			// System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace(); // 어디서 어떤 오류가 났는지 이력확인 가능
		}
		System.out.println("프로그램을 종료합니다.");
	}

	public void method2() {
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();

		/*
		 * int[] arr = new int[size];//NegativeArraySizeException:음수로 크기지정시 발생
		 * 
		 * System.out.print("출력하고자하는 인덱스 번호 : "); int index = sc.nextInt();
		 * 
		 * System.out.println(index + "번 인덱스 값 : " + + arr[index]);//ArrayIndexOutOfBoundsException
		 * 
		 */

		// 해결방법1. 조건문 활용해서 애초에 예외발생 안되게 하기
		/*if (size >= 0) {

			int[] arr = new int[size];

			System.out.print("출력하고자하는 인덱스 번호 : ");
			int index = sc.nextInt();

			if (index >= 0 && index < arr.length) {
				System.out.println(index + "번 인덱스의 값 : " + arr[index]);
			} else {
				System.out.println("배열은 잘 생성되었으나 부적절한 인덱스를 입력하셨습니다.");
			}

		} else {
			System.out.println("배열의 크기로는 양수로 제시하셔야 합니다.");
		}*/
		
		//해결방법2. 예외처리 구문 작성
		try {
			int[] arr = new int[size];
			
			System.out.println("출력하고자하는 인덱스 번호");
			int index = sc.nextInt();
			
			System.out.println(index + "번 인덱스의 값 : " + arr);
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기로는 양수를 제시하셔야 합니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열은 잘 생성되었으나 부적절한 인덱스를 제시하셨습니다.");

		System.out.println("프로그램을 종료합니다.");

	}
 }
	public void method3() {
		System.out.print("배열의 크기 : ");
		
		/*try{
			int size = sc.nextInt();

			int[] arr = new int[size];
			System.out.println("인덱스 : ");
			int index = sc.nextInt();
			System.out.println(arr[index]);
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기로는 양수를 제시하셔야 합니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열은 잘 생성되었으나 부적절한 인덱스를 제시하셨습니다.");
		}catch(InputMismatchException e) {
			System.out.println("타입에 맞는 값을 입력하셔야 합니다.");
		}*/
		
		try{
			int size = sc.nextInt();

			int[] arr = new int[size];
			System.out.print("인덱스 : ");
			int index = sc.nextInt();
			System.out.println(arr[index]);
		}catch(InputMismatchException e) {
			System.out.println("잘못된 타입의 값을 입력했어.");
		
		}catch(RuntimeException e) {
			System.out.println("예외가 발생되긴했는데, 배열의 크기가 음수거나, 부적절한 인덱스거나, 정수 아닌 다른값을 입력했습니다.");
		}
		//*RuntimeException이 InputMismatchException보다 먼저 실행된다면 InputMismatchException는 실행되지않음. RuntimeException이 부모 클래스이기 때문. (작성 순서 중요)
		System.out.println("프로그램을 종료합니다.");

		/*RuntimeException과 관련된 Exception 클래스들은(예외처리구문이 필수는 아님)
		 * if문(조건문) : 애초에 예외자체가 "발생되기 전"에 소스코드로 핸들링 가능(발생 전에 핸들링하는 것이므로 try ~ catch보다 권장)
		 * try ~ catch:예외가 "발생했을 경우" 실행할 구문을 미리 작성해두는 것
		 * 
		 * 예측가능한 상황 같은 경우 ->if문으로 하는걸 권장
		 */
		
	}
}
