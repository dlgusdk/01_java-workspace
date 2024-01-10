package com.br.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.br.collection.model.vo.Student;

public class B_SetController {

	/*
	 * 
	 * Set 계열 컬렉션
	 * -Collection 인터페이스를 상속받음
	 * -구현체(Set인터페이스를 구현한 클래스) : HashSet, LinkedHashSet, TreeSet
	 * 
	 * -데이터(value)만 저장가능
	 * -순서 유지되지 않음
	 * -중복 데이터 허용 x
	 * -데이터를 지칭할 수 있는게 없음. -> 특정 데이터 하나만 추출하는거 불가
	 */
	
	public void hashSet() {
		
		/*
		 * HashSet특징
		 * -새로운 데이터가 추가 될 때마다 동일객체 있는지 비교
		 * >equals 메소드 비교 -> true
		 * >hashCode메소드 각각 호출 -> 두개의 hashCode값이 일치하는지 확인
		 * 
		 * Object클래스의 equals, hashCode -> 주소값비교, 주소값가지고 10진수 만들어내기 
		 */
		HashSet<String> hs1 = new HashSet<>();
		
		hs1.add("반갑습니다");
		hs1.add("20"); //int -> Integer -> Object
		hs1.add(new String("반갑습니다"));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		hs1.add("20");

		/*
		 * Integer, String클래스의  equals, hashCode 오버라이딩 ->실제담긴 리터럴 값 가지고 비교. 담긴 리터럴값 가지고 10진수 만들어내기 
		 * 
		 * 
		 */
		System.out.println(hs1); //순서유지 x, 데이터중복 x, 
		
		//로또번호
/*		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1); //1에서부터 45개의 값
			
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
	
		*/
		
		HashSet<Integer>lotto = new HashSet<>();
		
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random() * 45 + 1));
		}
		System.out.println(lotto);
	}

	public void hashSetTest2() {

		HashSet hs = new HashSet();
		
		hs.add(new Student("공유", 43, 100));
		hs.add(new Student("홍길", 44 ,60));
		hs.add(new Student("망동", 26 ,40));
		hs.add(new Student("공유", 43, 100));
		hs.add(new String("안녕하세요"));
		hs.add(20);
		
		System.out.println(hs);//저장순서 유지 x, 
		
		/*
		 * 
		 * Student 클래스에 equals, hashCode 메소드가 없어 Object 클래스에 있는 메소드 실행(주소값 가지고 동일객체인지 판별) 
		 	->Object클래스에 있는 메소드 실행(주소값 가지고 동일객체인지 판별)
		 	->Student 클래스에 오버라이딩 하면 됨(실제 담겨있는 주소값에서 비교)
		 *
		 */
		
		System.out.println(new Student("강개",44,80).hashCode());
		System.out.println(new Student("강개",44,80).hashCode());
		System.out.println(new Student("강개",44,80).equals(new Student("강개",44,80)));
		System.out.println(new Student("강개",44,80).equals(new String("강개")));
		
		//hs.get(1); hashSet에는 인덱스 개념이 없고 get메소드 자체가 정의되어있지 않음 -> 한 객체만 뽑아올 수가 없음.
		//하나만은 안되고 담긴 모든 객체들에 순차적으로 접근 가능
		 //1. for문 사용가능 (단, for loop문 x => for each문만 가능)
	      for(Object o : hs) {
	         if(o instanceof Student) {
	            System.out.println(((Student)o).getName());
	         }else {
	            System.out.println(o);
	         }
	      }
	      System.out.println("=======================");
	      
	      // 2. Set에 담겨있는 것들을 ArrayList로 옮겨담은 후 반복문 돌려가며 접근
	      
	     // ArrayList list = new ArrayList();
	     // list.addAll(hs);
	      ArrayList<Student> list = new ArrayList<>(hs);
	      
	      for(int i=0; i<list.size(); i++) {
	    	  System.out.println(list.get(i));
	      }
	      
	      System.out.println("=======================");

	      //3.Iterator반복자 이용해서 순차적으로 접근
	      //Iterator->일회성(즉, 한 번 꺼내쓰면 사라짐)
	      Iterator<Student> it = hs.iterator(); //hs에 담겨있는 요소들을 Iterator에 동일하게 담는 과정
	      
	      while(it.hasNext()) {
	    	  Student o = it.next(); //.next()뽑을 값이 있으면 true, 없으면 false . 뽑을게 있을 떄만 실행
	    	  System.out.println(o);
	      }//StringTokenize 사용
	      it.next(); // NoSuchElementException
	   }
	   
	   
	}