package com.br.mvc.controller;

import java.util.ArrayList;
import java.util.Set;

import com.br.collection.model.vo.Music;

/**
 * @author GD
 *
 */
public class MusicController {

	//노래들을 보관하는 list
	private ArrayList<Music> list = new ArrayList<>();
	
	{//초기화 블럭 ==샘플데이터를 넣어두고자 할 때 주로 사용
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("술이 달다", "에픽하이"));
		list.add(new Music("밥이 달다", "강보람"));
	}
	
	
	//각 요청을 처리해주는 메소드들
	//전달죄는 제목값과 가수명으로 새로운 노래를 만들어 list에 추가하는 용도
	/**
	 * 전달되는 제목과 가수명으로 새로운 Music객체 생성하기
	 * list에 추가시켜주는 기능
	 * 
	 * @param title -사용자가 입력한 제목
	 * @param srtist -사용가자 입력한 가수명
	 */
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}
	
	/**
	 * 전체 리스트 반환
	 * @return
	 */
	public ArrayList<Music> selectMusic() {
		return list;
		
	}
	
	/**
	 * 삭제할 곡 명 전달받아서 해당 리스로부터 곡 찾아 삭제
	 * @param title - 사용자가 입력한 삭제할 곡 명
	 */
	public int deleteMusic(String title) {
		int result = 0;
		//현재 곡들의 곡명과 사용자가 입력한 곡명을 일일이 비교
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {;
				list.remove(i); //해당 곡 삭제'
				System.out.println();
				result++;
			break;
			//result = 0 (삭제할 곡을 못찾음) || result = 1(성공적으로 삭제)
			}
		}
		return result;
	}
	
	//4.특정 곡 검색해주는 서브 화면
	public ArrayList<Music> sertchMusic(String keyword) {
		
		//해당 전달된 키워드 값이 곡명에 포함되어있는 곡을 찾아야함.
		ArrayList<Music> serchList = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				//해당 조건이 true일때 list.get(i) Music객체가 검색한 노래
			//	System.out.println(list.get(i));
				serchList.add(list.get(i));
			}
		}
		
		//sercList가 텅빈상태 | 검색된 Music객체들이 담겨있는 상태, 둘 중 하나.
		return serchList;
		
	}
	
	//5. 특정 곡 수정하는 화면
	

	public int updateMusic(String reTitle, String reName, String reArtist) {
		int result = 0;
		//현재 곡들의 곡명과 사용자가 입력한 곡명을 일일이 비교
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(reTitle)) {; //
				list.set(i, new Music(reName, reArtist)); //해당 곡 삭제'
				
				//두번째 방법
				//list.get(i).setTitle(reTitle);
				//list.get(i).setTitle(reArtist);
				
				result++;
				break;
			//result = 0 (삭제할 곡을 못찾음) || result = 1(성공적으로 삭제)
			}
		}
		return result;
		
	}
}
