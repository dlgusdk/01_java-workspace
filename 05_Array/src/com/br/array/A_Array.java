package com.br.array;

import java.util.Scanner;

public class A_Array {
	
	/*변수: 하나의 공간에 하나의 값만 담을 수 있음
	 * 배열: 하나의 공간에 여러개의 값을 담을 수 있음
	 	단, "같은 자료형의 값'으로만 닼을 수 있음
	 
	 * 정확히 얘기하면 배열의 각 인덱스 자리에 각 값들이 담김
	 */
	
	public void method1() {
	 //변수만을 가지고 프로그래밍	
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		//출력하고자 할 경우 
		/*for(int i=1; i=5; i++) {
			System.out.println(num1);
		} -불가!! sum으로 총합계 구하는 것도 불가 */
		
		System.out.println(num1); //~하나씩해줄 수 있지만 양이 많을 때는 어려움.
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		int sum = num1 + num2 + num3 + num4 + num5;
		System.out.println(sum);

		
		System.out.println("==============");
		
		/*
		 * 배열가지고 프로그래밍
		 * 1.배열 선언
		 * 	자료형 배열명[];
		 * 	자료형[] 배열명;  
		 */
		
		//int arr[];  //int[] arr;
		
		/*
		 * 2.배열할당 (몇 개의 값들을 보관할건지 배열의 크기 지정하는 과정
		 * 	배열명 = new 자료형[배열크기];
		 */
		
		//arr = new int[5]; 
		
		//배열 선언과 동시에 할당
		int[] arr = new int[5];
		
		/*
		 * 3.값 대입
		 * 배열명[담고싶은 인덱스번호] = 값;
		 */
		
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		for(int i=0; i<=4; i++) {	//배열장점: 반복문 활용 가능
			arr[i] = i;
		}
		/*System.out.println(arr[0]);
		System.out.println(arr[1]); //~4번까지
		*/
		
		int sum1 =0;
		for(int i=0; i<5; i++) {			
			System.out.println(arr[i]);
			sum1 += arr[i];
		}
		System.out.println(sum1);
		System.out.println(arr); //실제로 arr에 담겨있는 값이 출력. "주소값"
	}
		
		public void method2() {
			
			int i = 10;
			int[] iArr = new int[3];
			
			System.out.println(iArr); //(변수의 자료형 + @ + 주소값의 16진수 형태)
			System.out.println(iArr.hashCode()); //주소값의 10진수 형태

			 
			 /* 기본자료형 boolean, byte, short, int, long, float, double, char 등등이 아닌 int[]와 같은 자료형이 쓰인 변수는 주소값을 가진다
			 ->실제 리터럴 값을 바로 담을 수 있음 -> 일반변수
			 *그 외 자료형(int[], double[] ~, Scanner, String...) -> 주소값을 담는 변수(참조변수, 참조형변수, 레퍼런스 변수)
			 */
			
			double[] dArr = new double[3];
			System.out.println(dArr);
		}
		
		public void method3() {                                                        
		
			int[] iArr = new int[3]; // 0 ~ 2번 인덱스까지 
			double[] dArr = new double[3];
			
			//각 인덱스에 초기화를 진행하지 않음(값 대입x)
			//iArr배열의 모든값을 출력
			for(int i=0; i<3; i++) {
				System.out.println(iArr[i]);
			}
			////dArr배열의 모든값을 출력
			for(int i=0; i<3; i++) {
				System.out.println(dArr[i]);
			}
		
			//각 인덱스에 접근해서 값을 대입하지 않아도 (초기화하지 않아도) 이미 초기값이 담겨있음
			//Heap 영역에는 빈 공간이 절대 존재할 수 없다. 따라서 공간이 만들어질 떄 JVM이 기본값으로 초기화(대입을) 진횅.
		}
		/*
		 * *Stack
		 * 
		 * *Heap
		 * 특징 1. 생성된 공간(객체)마다 고유한 주소값이 부여된다.
		 * 2.절대 빈 공간이 존재할 수 없음.(즉, 초기화 필요.)
		 * 혹시라도 초기화 진행하지 않았을 경우 JVM이 알아서 초기화 해준다.
		 * 
		 * *Static
		 * */
		
		public void method4() {
			
			int[] arr = new int[5];
			
			for(int i=0; i<arr.length; i++) { //문자열 length는 메소드 length를 불러오는거라 문자열.length()를 쓰지만 배열에서는 배열.length가 메소드가 아니라 배열의 요소의 갯수를 알려주는 속성이므로 괄호를 빼야한다.

				arr[i] = i + 1; 
			}
			
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		
		public void method5() {
			int result = 0;
			int[] arr = null; //null 참조하는게 없다. 주소값x
			//참조변수의 기본값은 null 
			
			System.out.println(arr);
			
			//System.out.println(arr.length);
			//System.out.println(arr.hashCode());
			//null가지고 메소드를ㄹ 호출하거나 특정 어딘가에 접근하고자할 때 NullPointerException오류
			
		}
		
		public void method6() {
			int[] arr = new int[5];
			
			for(int i=0; i<arr.length; i++) {
				arr[i] =  2 * (i + 1);
			}
			
			/*int value = 2;
			for(int i=0; i<arr.length; i++) {
				arr[i] = value;
				value += 2;
			}*/
			
			for(int i=0; i<=arr.length-1; i++) {
				System.out.println(arr[i]);
			}
			System.out.println("arr의 해쉬코드 값 : " + arr.hashCode());
			System.out.println("arr의 길이 : " + arr.length);
			
			//ArrayIndexOutOfBounudsException
			//부적절한 인덱스, 범위에서 벗어난 배열에 접근했을 경우 발생되는 오류
			
			/*배열의 가장 큰 단점
			 * 한 번 지정된 배열의 크기는 변경이 불가
			 * -> 배열의 크기를 변경하고자한다면 다시 생성, 기존의 값을 옮겨감기
			 */
			
			arr = new int[7];
			
			System.out.println(arr[0]);
			System.out.println("변경 후의 arr의 해쉬코드 : " + arr.hashCode() );
			//주소값이 변경 -> 새로운 곳을 참조
		
			/*연결이 끊긴 기존 배열은 Heap영역에 둥둥떠다님
			 * -> 그 어디에도 참조되어있지 않고 불필요한 존재
			 * -> 일정 시간이 지나면 "가비지컬렉터(GC)"가 알아서 지워줌(자바의 자동메모리관리 특징)
			 */
			   
			//배열을 강제로 삭제시키고자 한다면 -> 연결고리를 끊으면 됨. arr = null;
			arr = null;

		}
		
		public void method7() {
			//배열 선언, 할당, 값 초기화 동시에 진행 가능
			int[] arr1 = new int[] {1,2,3,4}; //표현법 1
			int[] arr2 = {1, 2, 3, 4}; //표현법

			System.out.println(arr1 == arr2); //false 주소값 비교이기 때문에 false
			
			int a = 10;
			int b = 10; 
			System.out.println(a == b);//리터럴 값 비교이기 때문에 true
			
		}
		
		public void method8() {
			//1. 크기 10짜리 정수형 배열 생성
			//2.0번 인덱스에서 마지막 인덱스까지 순차접근 하면서 값을 대입, 매번 1에서부터 100 사이의 랜덤값을 발생기키는 값
			//3.해당 배열의 0부터 마지막인덱스까지 담겨있는 값 출력. arr[x] : xx 형식
			//해당 인덱스의 값이 담겨있는 값이 홀수인것만 출력
			//해당 인덱스에 담겨있는 값이 짝수인 것들의 총 합계 출력
			int[] arr = new int[10];
			
			for(int i=0; i<arr.length; i++ ) {
				arr[i] = (int)(Math.random() * 100 + 1);				
			}
			
			int sum =0;
			int count = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i] % 2 == 1) {
					System.out.printf("arr[%d] : %d\n", i, arr[i]);
				}else {
					sum += arr[i];
					count++;
				}
			}
			System.out.printf("짝수들의 총합 : %d\n", sum);
			System.out.printf("짝수들의 갯수 : %d\n", count);

		}
		
		public void method9() {
			//사용자에게 배열의 길이 입력받고 해당 크기만큼의 문자열 배열 생성
			//사용자에게 매번 과일명 입력받아 각 인덱스 자리에 대입
			//0번에서 마지막까지 담긴 값 출력
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("배열의 길이(양수) : ");
			int size = sc.nextInt();
			sc.nextLine();
			
			String[] arr = new String[size];
			
			//사용자가 입력한 문자열이 exit일 경우 해당 반복문 빠져나감
			for(int i=0; i<size; i++) {
				System.out.print("과일명을 입력해주세요 : ");
				String fruit = sc.nextLine();
				
				if(fruit.equals("exit")) {
					break;
				}else
			
				arr[i] = fruit;
			}
			
			for(int i=0; i<arr.length; i++) {
				System.out.printf("arr[%d]번 과일 : %s\n", i, arr[i]);
			}
		}
		
		public void method10() {
			//현재 학생이 3명
			//세명의 키 정보를 보관할 크기 3의 double배열 생성
			// 반복적으로 사용자에게 키 입력받고 각 인덱스에 대입
			//각 인덱스에 있는 값 출력
			//"x번 학생의 키 : xxx.xcm"형식
			//현재 학생 수, 학생들의 키 총합, 평균값까지 출력
			Scanner sc = new Scanner(System.in);

			double[] arr = new double[3];  //3
			
			for(int i=0; i<arr.length; i++) {
				System.out.print("학생의 키 : ");
				arr[i] = sc.nextDouble();
			}
			
			double sum = 0.0; 
			for(int i=0; i<arr.length; i++) {
				System.out.printf("%d번 학생의 키 : %.1fcm\n", i + 1, arr[i]);
				sum += arr[i];
			}
			System.out.printf("학생 수: %d명\n", arr.length);
			System.out.printf("학생들의 키 총합: %.1fcm\n", sum);
			System.out.printf("평균값: %.1fcm\n", sum / arr.length);
		}

		//10번 응용
		public void method11() {
			//현재 학생이 3명
			//세명의 키 정보를 보관할 크기 3의 double배열 생성
			// 반복적으로 사용자에게 키 입력받고 각 인덱스에 대입
			//각 인덱스에 있는 값 출력
			//"x번 학생의 키 : xxx.xcm"형식
			//현재 학생 수, 학생들의 키 총합, 평균값까지 출력
			Scanner sc = new Scanner(System.in);

			System.out.print("학생 수 : ");
			int stu = sc.nextInt();
			
			double[] arr = new double[stu];  //3
		
			for(int i=0; i<stu; i++) {
				System.out.printf("%d번 학생의 키 : ", i + 1);
				arr[i] = sc.nextDouble();
			}
			
			double sum = 0.0; 
			for(int i=0; i<arr.length; i++) {
				System.out.printf("%d번 학생의 키 : %.1fcm\n", i + 1, arr[i]);
				sum += arr[i];	 
			}
	
			System.out.printf("학생 수: %d명\n", stu);
			System.out.printf("학생들의 키 총합: %.1fcm\n", sum);
			System.out.printf("평균값: %.1fcm\n", sum / arr.length);
		}

		public void method12() {
			
			/*
			char[] arr = new char[3];
			
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}*/
			
			//사용자에게 문자열 하나 입력받은 후 
			//각 인덱스에 있는 문자값들을 char 배열에 옮겨담기
			Scanner sc = new Scanner(System.in);
			
			//1.문자열 입력받기
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			//2.char배열 생성해두기 (배열의 크기 == 입력받은 글자수(길이))
			char[] arr = new char[str.length()];
			
			//각 문자열의 각 인덱스별 문자값을 char 배열의 각 인덱스 자리에 대입
			//arr[0] = str.charAt(0);
			//arr[0] = str.charAt(1); ~마지막 인덱스까지
			
			for(int i=0; i<arr.length; i++) {
				arr[i] = str.charAt(i);
			}
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		
		public void homework() {
			
			String str = "GDKKN";
					//각문자들을 각 문자마다 +1 진행된 문자열을 출력. GDKKN -> HELLO
			//해당 결과값을 String result에 기록 ->출력
			
		}
}
