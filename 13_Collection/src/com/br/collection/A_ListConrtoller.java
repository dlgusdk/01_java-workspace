package com.br.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.br.collection.model.vo.Music;

public class A_ListConrtoller {

	/*
	 * 
	 * *List계열의 컬렉션
	 * >선형자료구조를 가지고 있음(객체배열과 유사하게 저장 == 순서 유지)
	 * 
	 * -vector -동기화 제공(성능 저하)
	 * -AraayList -동기화 제공x
	 * -linkedList - 데이터와 데이터간에 노트로 연결되어있음
	 * 
	 */
	
	public void arrayListTest() {
		//ArrayList<Object> list = new ArrayList<>(3);
		
	//	ArrayList/*<Object>*/ list = new ArrayList(3); //크기 지정할 수도 있고 안할 수도 있음
		//ArrayList<변수명E> 인데 별도로 타입을 제한하지 않으면 E가 Object로 설정된다.ArrayList<Object> , list도 Object 객체로 설정된다. E의 타입을 정해주는 것으로 바꿀수없게 고정해줄 수있다
		//System.out.println(list/*.toString()*/);
		
		//E(==Element) :리스트레 담길 데이터(요소, value)
		//1.add(E e):리스트 공간 끝에 전달된 데이터를 추가시켜주는 메소드

		
		
		
		
		//get보류
		
	/*	1.어레이리스트 선언 (제너릭 default)
		2. 변수에 내용 넣기 + 내용 넣으면서 새로운 객체 생성
		3. 인덱스 2번째 값에 추가하기 
		4.1번 삭제
		5.0을 새로운 객체 생성해서 수정 , 1번에 새로운 값 넣기
		6.리스트의 인덱스 값 모두 출력 
		7.for문을 사용해서 리스트를 출력(인덱스 2번일때  값 변경)
		8.리스트 값 다 비우기
		9. 만약 리스트가 비어있을 떄 결과없다고 출력. 안비었을 떄는 리스트 인덱스 값 모두 출력 
		*/
		
	//1
		ArrayList list = new ArrayList();
		//2
		list.add(3);
		list.add('e');
		list.add("dwd");
		list.add(5.5);
		
		list.add(new Music ("d1", "w2"));
		
		//3
		list.add(2, "w3");
		
		//4
		list.remove(1);
		//5
		list.set(0, new Music("12","244"));
		list.set(1, "list5");
		
		//6
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		//7
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			if(list.get(i).equals(list.get(2))){
				list.set(2, "가랏!");
			}
		}
		
		//8
		list.clear();
		
		//9
		if(list.isEmpty()) {
			System.out.println("결과 없음");
		}else {
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}
		
		
		
		
		
		
		
		
		/*list.add(10);
		list.add("안녕");//장점3:여러타입 보관 가능
		list.add(new Music("Good Bye","박효신"));
		list.add(new Music("이 밤","양다일"));
		list.add(new Music("잊혀지다","정키"));
		list.add("끝"); //장접1 : 지정된 크기보다 더 많이 넣어도 오류나지않음. 
		
		System.out.println(list);//list의 특징: 순서유지됨(0번 인덱스부터 차곡차곡 담김)
	}
	*/
		/*
		//2.add(int index, E e) : 직접 인덱스를 지정해서 그 위치에 데이터를 추가시키는 메소드
		list.add(2, new Music("진심이 담긴 노래", "케이시"));//장점2: 중간 위치에 데이터 추가시 복잡한 알고리즘을 직접 구현할 필요 없음
		System.out.println(list);
		
		//3.remove(int index) : 해당 인덱스위치의 데이터 삭제시켜주는 메소드 
		String removeValue = (String)list.remove(1);
		System.out.println("제거된 요소 : " + removeValue);
		System.out.println(list);
		
		//4.set(int index, E e) : 해당 인덱스 위치의 데이터를 새로이 전달된 e로 수정시켜주는 메소드
		list.set(1, new Music("술이 달다", "에픽하이"));
		System.out.println(list);
		
		//5.get(int index) : E ->해당 인덱스 위치의 객체를 반환시켜주는 메소드
		String s = (String)list.get(5);
		Music m = (Music)list.get(2);
		Object o = (Music)list.get(3);
		//Object로 선언하지 않는 이유: getTitle메소드는 Music에 있어서 object로 하려면 형변환을 해줘야함. 
		System.out.println(o);// System.out.println(((Music)o).getArtist(); 이렇게 바꿔줘야함 하나하나.
		System.out.println(s); 
	    System.out.println(m.getTitle());

	    //변수에 담지 않고 바로 출력시에는 굳이 형변환 필요 없음
	    System.out.println(list.get(5));
	    System.out.println(list.get(2));
	
	    System.out.println(((Music)list.get(2)).getTitle()); //호출한건 뮤직객체지만 오브젝트로 반환이 되므로 뮤직으로 형변환 해야함
	    
	    System.out.println("==========================");
	    
	    ((Music)list.get(2)).setTitle("눈꽃");
	    
	    System.out.println(list);
	    
	    //6.size() : 리스트의 사이즈 반환시켜주는 메소드(즉, 몇 개의 데이터 담겨있는지)
	    System.out.println("리스트의 사이즈 : " + list.size());
	    System.out.println("리스트의 마지막 인덱스 : " +(list.size() - 1)); //length는 변수명.length가 가능한데 list는 변수명이 아니기에 사용 불가능
	    
	     //(1).for loop문
	    for(int i=0; i<list.size(); i++) {
	    	System.out.println(list.get(i)); //arr[i]
	    }
	    
	    System.out.println("============================");

	     //(2).for each문
	    for( Object ob : list ) {
	    	System.out.println(ob);
	    }
	    
	    System.out.println("============================");
	    
	    //7.subList(int index1, int index2) : list = > 추출해서 새로운 List로 반환
	    List sub = list.subList(1,3); //=1 <- 3
	    System.out.println(sub);
	    System.out.println(list);
	    
	    System.out.println("===================");
	     
	    //8.addAll(Collection c) : 컬렉션을 통째로 뒤에 추가시켜주는 메소드 
	    list.addAll(sub);
	    System.out.println(list);
	    
	    //9.isEmpty() : boolean ->컬렉션이 비어있는지 묻는 메소드
	    System.out.println(list.isEmpty());
	
	    //10.clear() : 싹 비워주는 메소드                                             
	    list.clear();
	    System.out.println(list);
	    
	   if(list.isEmpty()) { //비어있을 경우
	   // if(list == null) {//isEmpty는 값비어있는 경우고 null은 아예 생성자체도 안되었을 때(이미 생성된걸 비교하는 것이므로 null로 비교하면 x) 
	    	 System.out.println("조회된 결과가 없습니다.");
	    
	    }else { //비어있지않을경우 ->데이터가 담겨는 있음(몇개인지는 모름)
	    	for(int i=0; i<list.size(); i++) {
	    		System.out.println(list.get(i));
	    	}
	    }
	}
	//ArrayList<변수명E> 인데 별도로 타입을 제한하지 않으면 E가 Object로 설정된다.ArrayList<Object> , list도 Object 객체로 설정된다. E의 타입을 정해주는 것으로 바꿀수없게 고정해줄 수있다
	//Object가 아닌 <Music> 제네릭으로 설정해서 고정하는 방식
	   public void genericTest() {
		//Music 제네릭 설정 안함 -> E ==Music
		   ArrayList<Music> list = new ArrayList<Music>();
		   
		   list.add(new Music("GoodBye", "박효신"));
		   list.add(new Music("밤", "양달일"));
		   //list.add(10); Music객체만 가능
		   //list.add("끝");
		   System.out.println(list);
		   
		   list.add(1, new Music("진심", "케이시"));
		   System.out.println(list);
		   
		   list.set(0, new Music("술이 달다", "에픽하이"));
		   
		   List<Music> sub = list.subList(0,2);
		   
		   list.addAll(sub);
		   System.out.println(list);
		   
		   Music m = list.get(0);
		   System.out.println(m);
		   
		   System.out.println(list.get(1).getArtist());
		   
		   	for(Music music : list) { //<Music> 제너릭 설정했으므로 반환도 Music으로 된다. ->뭐가 들어올지 몰라 Object로 썼는데 Music고정이므로 안써도 됨.
			   System.out.println(music);
		   	}
		   	
		   list.get(0).setTitle("밥이달다"); //get set s수정 바로 가능 ->Music객체이기 때문
		   System.out.println(list);
	   }*/
	   

	   /*
	    * *제네릭<E>
	    * -해당 컬렉션에 저장할 타입을 외부의 사용자에 의해 지정되는 것. 
	    * 
	    * *제네릭 설정한 채로 컬렉션을 이용하는 이유
	    * - 명시된 타입의 객체만 저장되도록 제한을 둘 수 있어 안정적이다. 
	    * - 컬렉션에 저장된 객체를 꺼내 쓸 때 매번 형변환하는 절차를 없앨 수 있다. 
	    * 
	    */
	   
	   
	   
	   //==================================================
	   
	   
	   
	   /*
	    * LinkedList ->각 데이터들이 서로를 인접해서 참조

	    */
	   public void linkedListTest() {
		   LinkedList<String> list = new LinkedList<>();
		   
		   //add
		   list.add("강보람");
		   list.add("홍길동");
		   list.add(new String("강개순"));
		   
		   list.add(1, "홍길순");
		   System.out.println(list);
		   System.out.println(list.get(0));

		   list.addFirst("강말순");
		   list.addLast("강");
		   
		   System.out.println(list);
		   System.out.println(list.getFirst());
		   System.out.println(list.getLast());
		   
		   //remove
		   list.remove(1);
		   System.out.println(list);
		   
		   list.removeFirst();
		   list.removeLast();
		   
		   System.out.println(list);
	
	   }
 }

	
	
	
	
	
	

