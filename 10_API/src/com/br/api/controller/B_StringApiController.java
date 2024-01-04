package com.br.api.controller;

import java.util.StringTokenizer;

public class B_StringApiController {
/*
 * 자바에서의 문자열을 관리하는 클래스로 총 세가지 있음
 * 
 * *String
 * - 클래스지만 기본자료형처럼 쓸 수 있는 것 -> " "로 바로 리터럴값 제시 가능
 * - 불변클래스(수정이 불가능하다)
 *
 * 
 * *StringBilder, StringBuffer
 * - 클래스 사용방식으로 쓸 수 있는 것 -> new로 객체 생성한 후 사용
 * - 가변클래스(수정이 가능하다)
 * 
 * 
 */
	
	
	/*public void StringPoolTest() { 
		//상수풀(String Pool)의 개념
		//1.String 사용시 생성자를 통해서 문자열사용
		String newStr1 = new String("hello");
		String newStr2 = new String("hello");
		
		System.out.println(newStr1);
		System.out.println(newStr2);
		//String클래스에 toString메소드 이미 오버라이딩 되어있음(실제 담긴 문자열값 반환)
		
		System.out.println(newStr1 == newStr2); //주소값 비교
		System.out.println(newStr1.equals(newStr2)); // 문자 비교
		//String 클래스에 equals이미 오버라이딩 되어있음(문자열가지고 비교)
		
		System.out.println(newStr1.hashCode()); //주소값 비교
		System.out.println(newStr2.hashCode()); //주소값 비교
		
		//System.identityHashCode(레퍼런스)
		System.out.println(System.identityHashCode(newStr1)); 
		System.out.println(System.identityHashCode(newStr2)); 
		
		//2.문자열을 리터럴값으로 사용
		String str1 = "hello";
		String str2 = "hello";
		
		//리터럴 제시시 상수풀(String pool) 영역에 올라감
		//String pool특징 : 동일한 문자열이 기록될 수 있음
		System.out.println(str1 == str2); // true (주소값 일치)
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}*/
		public void immutableTest() { //불변가변 테스트
			//String 클래스가 불변인 이유
			String str = "반가워!";
			System.out.println(System.identityHashCode(str));
			
			//수정시도
			str += "난 String이야.";
			System.out.println(str);
			System.out.println(System.identityHashCode(str));
			//주소값 달라짐 -> 기존의 자리에서 수정되는게 아니라 매번 새로운 곳(주소값)이 참조되게 변경(덮어씌워짐) -> 불변클래스
			
			System.out.println("===================");
			
			// StringBuilder, StringBuffer가 가변인 이유
			//객체 생성시 16개의 문자들을 저장할 수 있는 버퍼 내부적으로 생성
			 StringBuilder sb = new  StringBuilder("반가워!"); //값을 바로 담으며 생성 16 + 글자
			 System.out.println("수용량 : " + sb.capacity());
			 System.out.println("문자열의 길이 : " + sb.length());
			 System.out.println("sb : " + sb/*.toSting*/);
			 System.out.println(System.identityHashCode(sb));
			
			 //1.append(String str) : StringBuilder
			 //기존의 문자열에 새로운 문자열 추가시키고자 할 때 
			 sb.append("안녕");
			 System.out.println("변경 후 뉴 : " + sb);
			 System.out.println(System.identityHashCode(sb));
			 
			 //2.delete(int start, int end) : StringBuilder
			 //문자열 일부 삭제시켜주는 메소드(start <= <end)
			 sb.delete(3, 5); // ! 녕
			 System.out.println("변경 후 sb : " + sb);
			 System.out.println("주소값 : " + System.identityHashCode(sb));
			 
			 System.out.println("==========================");
			 
			 //3.insert 메소드 (int offset, String str) :StringBuilder
			 //기본의 문자열 사이의 또다른 문자열을 추가시켜주는 메소드
			 sb.insert(1,  "ㅎㅎㅎ"); // 1번 index에 문자열 추가
			 System.out.println("변경 후 sb : " + sb);
			 
			 System.out.println("==========================");

			 //4.revers() : StringBuilder
			 //기존의 문자열을 역으로 바꿔주는 메소드
			 sb.reverse();
			 System.out.println("변경 후 sb : " + sb);
			 
			 System.out.println("==========================");
			 sb.append("ㅋㅋㅋ")
			 .delete(0,4)
			 .reverse()
			 .insert(2, "ㅎㅎㅎ");

			 System.out.println("변경 후 sb : " + sb);

			 /*
			  * 
			  * String 클래스 == 불변클래스(그 자리에서 변경이 불가)
			  * ->빈번하게 값을 변경할 경우 GC 가비지컬렉터가 기존의 값을 계속 지워줘야한다는 단점.
			  * ->변경이 적고 한번 담아두고 단지 조회만 할 경우 String 클래스가 용이
			  * 
			  * StringBuilder, StringBuffer ==가변클래스(변하지않아서 가변x, 그 자리에서 값이 변경되기에 가변)
			  * ->변경이 잦을 경우 용이 
			  * ->단, 객체생성 후에 메소드 호출하면서 값을 변경해야됨.
			  * 
			  * StringBuilder, StringBuffer의 차이점
			  * ->동기화가 되냐안되냐의 차이(속도차이)
			  * -> StringBuilder 동기화 제공 x -> 속도가 빠름
			  * -> StringBuffer 동기화 제공 ㅇ -> 속도가 느림
			  * 
			  * -멀티스레드환경(여러개의 일처리를 동시다발적으로 수행하는 환경) ->동기화 처리가 되는걸 사용하는 안전 > StringBuilder 추천 
			  * -단일스레드환경(한번에 하나의 일만 처리하는 환경) ->동기화 작업을 하게 되면 속도 저하가 될 수 있음 ->StringBuilder
			  * 
			  * 
			  * 
			  */
		}
			 public void StringMethodTest() {//Sting 클래스의 유용한 메소드
				 
				 String str1 = "Hello World";
				 //1.문자열.charAt(int index) : char
				 //  문자열에서 전달된 index 위치의 문자만을 추출해서 리턴 
				 char ch = str1.charAt(3);
				 System.out.println("ch : " + ch);
				 
				 //2.문자열.concat(String str) : String
				 //문자열과 전달된 문자열을 하나로 합쳐서 새로운 문자열로 리턴
				 String str2 = str1.concat("!!!");
				 System.out.println("str2 = " + str2);
				 
				 String str3 = str1.concat("^^").concat("!!");
				 System.out.println("str3 = " + str3);
				 
				 //3.문자열.contains(CharSequence s)
				 // 문자열에 전달된 문자열이 포함되어있으면 true 아니면 false 반환
				 System.out.println("str1에 Hello가 포함되어있습니까 : " + str1.contains("Hello"));
				 System.out.println("str1에 Bye가 포함되어있습니까 : " + str1.contains("Bye"));
			
				 //4.문자열.equalsIgnoreCase(String str) : boolean
				 //문자열의 전달된 문자열이 일치하는지 대소문자 가리지않고 비교하겠다. 
				 System.out.println("str1이 hello world 입니까 : " + str1.equalsIgnoreCase("hello world"));
	
				 //5.문자열.substring(int beginIndex) :String -> 문자열의 beginIndex 위치부터 끝까지의 문자열을 추출해서 반환
				 //  문자열.substring(int beginIndex, int endIndex) :String ->문자열의 beginIndex 위치에서 endIndex 전까지의 문자열을 추출해서 반환
				 System.out.println(str1.substring(6));
				 System.out.println(str1.substring(0, 4)); //0부터 4번 인덱스 이전까지 출력
			 
				 //6. 문자열.replace(char oldChar, charChar) :String
				 // 문자열 olderChar문자들을 newChar로 변환한 새 문자열 리턴
				 System.out.println(str1.replace("l", "c"));
				 System.out.println(str1);
				 
				 //7.문자열.toUpperCase() : String -> 다 대문자로 변경한 새 문자열 리턴
				 //문자열.toLowerCase() : String -> 다 소문자로 변경한 새 문자열 리턴
				 String str4 = str1.toUpperCase();
				 System.out.println("str4 : " + str4);
				 System.out.println("str4 다 소문자로 : " + str4.toLowerCase());
				 
				 //8.문자열.trim() : String
				 // 문자열의 앞 뒤 공백을 제거시킨 새 문자열 리턴
				 String str5 = "   Ja va  ";
				 System.out.println("str5 :" + str5.trim());
				 System.out.println("replace : " + str5.replace(" ", "")); //공백을 지정해서 제거 
				 
				 //9.문자열.toCharArray() :char[]
			     char[] arr = str1.toCharArray();
				 System.out.println("배열의 길이 : " + arr.length);
				 System.out.println("0번 인덱스 : " + arr[0]);

				 //10. static valueOf(char[] data) : String
				 System.out.println(String.valueOf(arr));
				 
				 //11.문자열.indexOf(String str) : int
				 //문자열.lastIndexOf(String str) : int
				 System.out.println("str1에 앞에서부터의 첫 l의 위치 : " + str1.indexOf("l"));
				 System.out.println("Str1에 뒤에서부터의 첫 l의 위치 : " + str1.lastIndexOf("l"));
				 System.out.println("Str1에 앞에서부터의 첫 a의 위치 : " + str1.indexOf("a")); //존재하지 않을 경우 -1반환, 인덱스에 음수는 없으므로 ㅇ.
			 
				 //12.문자열.isBlank() : boolean
				 // 문자열.isEmpty() : boolean
				 // ->해당 문자열이 빈값인지를 확인해주는 메소드
				 System.out.println("ABC".isBlank());
				 System.out.println("".isBlank());
				 System.out.println(" ".isBlank());
				 //- isBlank() :빈문자열이든 공백문자열이든 다 빈값으로 
				 System.out.println("ABC".isEmpty());
				 System.out.println("".isEmpty());
				 System.out.println(" ".isEmpty());		
				 //isEmpty : 빈문자열은 빈값으로 인식을 하되, 공백은 실제 값으로 인식 	
			
			 }
			 
			 public void stringTokenizerTest() {
				 //구분자를 기준으로 해서 문자열들을 분리시키는 방법
				  String str = "JAVA,ORACLE,JDBC,HTML,CSS";
				  
				  //방법1. 분리된 문자열들을 String[]배열에 차곡차곡 담아두고자함
				  //String 클래스에 제공하는 spilt메소드 이용
				  //문자열.spilt(구분자) : String[]
				  String[] arr = str.split(",");
				  System.out.println("분리된 문자열의 갯수 : " + arr.length);
				  
				//  for(int i=0; i<arr.length; i++) {
				  for(String s : arr) {  
					  //System.out.println(arr[i]);
					  System.out.println(s);
				  }
				  
				  //방법2. 분리된 문자열들을 토큰으로 관리하는 방법
				  //java.util.StringTokenizer 클래스를 이용하는 방법
				  //StringTokenizer stn = new StringTokenizer(분리시키고자하는문자열, 구분자);
				  StringTokenizer stn = new StringTokenizer(str, ",");
				  System.out.println("토큰의 갯수(==분리된문자열갯수) : " + stn.countTokens());
			
				 /* System.out.println(stn.nextToken());
				  System.out.println(stn.nextToken());
				  System.out.println(stn.nextToken());
				  System.out.println(stn.nextToken());
				  System.out.println(stn.nextToken());
				  System.out.println("현재의 토큰 갯수 : " + stn.countTokens()); //더 이상 뽑을게 없으므로 0이 출력
				  System.out.println(stn.nextToken());*/
				  
				  for(int i=stn.countTokens(); i>0; i--) {
					  System.out.println(stn.nextToken());
				  
				  }
				  /*i=0 i<5 java
				   * i=1 i<4 Oracle
				   * i=2 i<3 JDBC
				   */
				  
				  //해결방법 1
				  int count = stn.countTokens(); //count = 5
			
				  for(int i=0; i<count; i++) {
					  System.out.println(stn.nextToken());
				  
				  }
				  
				  //해결방법2
				  while(stn.hasMoreTokens()) {
					  System.out.println(stn.nextToken());

				  }
			 }
	}
	

