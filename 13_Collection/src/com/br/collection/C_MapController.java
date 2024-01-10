package com.br.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import com.br.collection.model.vo.Snack;

public class C_MapController {
	/*
	 * *Map계열의 컬렉션
	 * -Collection인터페이스를 상속받고 있지않음
	 * -HashMap, Properties
	 * -key와 data를 함께 저장해야함
	 * 키 : 각 데이터들을 식별할 수 있는 식별자(고유해야된다, 중복 x)
	 * -저장 순서 유지 x, 키값은 중복될 수 없음.(단, 데이터는 중복될 수 있다)
	 * 
	 */
	
	public void hashMapTest() {
		///*<Object, Object>*/ 설정하지않을때 오브젝트
		HashMap<String, Snack> hm = new HashMap();
		
		//1.put(K key, V value) :컬렉션에 키 밸류 세트로 추가시켜주는 메소드 
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		hm.put("포테이토칩", new Snack("짠맛", 500));
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
		System.out.println(hm);//저장순서 유지 x ,value값은 허용
		
		hm.put("새우깡", new Snack("매운맛", 700));
		
		System.out.println(hm);
		//동일한 키값으로 다시 추가하게 될 경우 value값이 덮어씌워짐
		
		//2.get()Object key) : V => 컬렉션에 해당 키값을 가지는 밸류값을 반환시켜는 것 
		Snack s = (Snack)hm.get("다이제");
		System.out.println(s);
		
		//3.size() : 컬렉션안에 담겨있는 객체들의 갯수 반환
		System.out.println("몇개 : " + hm.size());
		
		//4.replace(K key, V value) ->해당 키값 찾아서 새로 전달한 V값으로 수정
		hm.replace("포테이토칩", new Snack("겁나짠맛", 1000));
		System.out.println(hm);

		// 5. remove(Object key) => 컬렉션에 해당 키값의 키벨류 세트 삭제
	      Snack removeSnack = (Snack)hm.remove("포테이토칩"); // 존재하지 않는 키값 제시시 => null반환
	      System.out.println(removeSnack);
	      System.out.println(hm);
	      /* map계열의 컬렉션으로는 for each문 사용 불가
	      for(Snack s : hm) { 
	      }
	      */
	      
//	      ArrayList list = new ArrayList(hm);
	      
//	      Iterator it = hm.iterator(); // List계열 또는 Set계열의 Collection에서만 사용 가능
	      
	      // Map ========== > Set =======> Iterator
	      //    .ketSet()		.iterator()
	      //	.entrySet()
	      
	      //1.KeySet() 이용방법
	      //1) hm --> Set컬렉션
	      Set<String> keyset = hm.keySet();
	      
	      //2)keyset -> Iterator
	      Iterator itKey = keyset.iterator();
	      
	      //3)반복문
	      while(itKey.hasNext()){
	    	  String key = (String)itKey.next();	
	    	  Snack value = (Snack)hm.get(key);
	    	  System.out.println(key + "=" + value);
	      }
	      
	      System.out.println("======================");
	      
	      //2. entrySet()이용
	      //1)hm --> entrySet컬렉션
	      Set<Entry<String, Snack>> entrySet = hm.entrySet();
	      
	      //2)entrySet -> Iterator
	      Iterator inEntry = entrySet.iterator();
	      
	      //3)반복문
	      while(inEntry.hasNext()){
	    	  Entry entry = (Entry) inEntry.next(); // key = value
	    	  
	    	  String key = (String) entry.getKey();
	    	  Snack value = (Snack) entry.getValue();
	      
	    	  System.out.println(key + "=" + value);
	      }
	}
	
	public void propertiesTest1() {
		/*//Properties:Map계열의 컬렉션 -> 키+밸류 세트로 저장
		//주로 키값도 문자열 , 밸류값도 문자열로 담고자할때
		//->키밸류 세트들으르 외부 파일로 내보내기 (출력)
		//->파일에 기록된 키밸류 세트들을 읽어들일떄(입력)
		Properties prop = new Properties();
		prop.put("다이제", new Snack("초코맛", 1500));
		prop.put("다이제", new Snack("짠맛", 100));
		
		System.out.println(prop);
		
		try {
			//내부적으로 store메소드 실행시 properties에 담겨있는 키 밸류 세트들을 
			prop.store(new FileOutputStream("test."), "propertiesTest");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		//키값도 문자열, 밸류값도 문자열로 저장
		//1. setProperty(String key, String value)
		Properties prop = new Properties();
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HachSet");
		prop.setProperty("Map", "HachMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); // 저장순서유지x, key값 중복시 덮어씌워짐
		//2.store 출력용 스트림, String comments
		try {
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
		
		//3. storeTOXML
			prop.storeToXML(new FileOutputStream("test.xml"), "propertiesTest");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void propertiesTest2() {
		 Properties prop = new Properties();
		 
		 try {
			 //4.load(입력용 스트림)
		//	prop.load(new FileInputStream("test.properties"));
			 //loadFromXML(InputStream)
			 prop.loadFromXML(new FileInputStream("test.xml"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 //5.getProperty(String key) : String value
		 System.out.println(prop.getProperty("List"));
		 System.out.println(prop.getProperty("list"));
	}
	
	/*properties또는 .xml파일을 사요아는 경우
	 * 프로그램상 필요한 기본 환경설정(서버의 ip주소, db의 경로, 관리자 아이디, 비번 ....)
	 * 해당 파일에 기술된 내용을 읽어들여서 자바에서 사용
	 * ->단순한 텍스트다보니까 개발자가 아닌 일반인 관리자가 해당 문서 열어서 수정하기 쉬움
	 */
}
