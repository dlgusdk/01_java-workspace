package com.br.mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.br.collection.model.vo.Music;
import com.br.mvc.controller.MusicController;

//화면을 담당하는 클래스(출력문, 입력문) 
//화면을 통해서 요청보내기 = MusicController클래스의 특정 메소드 호출
public class MusicMenu {

	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	//사용자가 보게될 화면들의 메소드들
	
	//메인화면: 프로그램 실행시 처음 보여지는 화면
	public void mainMenu() {
		while(true) {
			System.out.println("\n === Music 프로그램 ===");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 삭제");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 수정");
			System.out.println("0. 프로그램 종료");
		
			System.out.print("\n>메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu){
			case 1: insertMusic(); break;
			case 2: selectMusic(); break;
			case 3: deleteMusic(); break;
			case 4: sertchMusic(); break;
			case 5: updateMusic(); break;
			case 0: System.out.println("\n프로그램을 종료합니다."); return;
			default: System.out.println("\n다시 선택해주세요.");
			
			/*
			 * 5. 곡 수정
			 * 사용자에게 수정하고자하는 곡명(기존곡명)을 입력받고 어떤 내용으로 수정할건지 수정할 곡명, 수정할 가수명 입력받은 후에 
			 * 수정요청하기 ->기존곡명과 일치하는 곡을 찾아서 해당 곡의 곡명, 가수명을 새로운 내용으로 수정
			 * 
			 * 수정할 곡을 찾지 못했을 경우 -> "수정할 곡을 찾지 못했습니다." 출력
			 * 수정 잘 될 경우 -> 성공저긍로 수정되었습니다. 출력
			 */
			
			}
			
		}
			
	}
	

	//1.새로운 곡을 추가하는 서브화면
	public void insertMusic() {
		System.out.println("\n === 새로운 곡 추가 ===");
		
		System.out.print("추가할 곡의 제목 입력 : ");
		String musicTitle = sc.nextLine();
		System.out.print("추가할 곡의 가수명 입력 : ");
		String musicArtist = sc.nextLine();
		
		//곡 추가 요청보내기-> m의 메소드 호출(사용자가 입력한 값들을 넘기면서)
		mc.insertMusic(musicTitle, musicArtist);
		
		System.out.println("성공적으로 곡 추가되었습니다.");
	}
	//2.전체 곡을 조회하는 서브화면
	public void selectMusic() {
		
		System.out.println("\n === 전체 곡 리스트 ===");
		//전체 곡 조회요청 !! = mc의 메소드 호출		
		ArrayList<Music> musicList = mc.selectMusic();
		
		if(musicList.isEmpty()) {
			System.out.println("존재하는 곡이 없습니다.");
		}else {
			for(int i=0; i<musicList.size(); i++) {
				System.out.println(musicList.get(i));
			}
		
		}
	}
	//3.곡 삭제
		public void deleteMusic() {
			
			System.out.println("\n=== 특정 곡 삭제 ===");
			
			System.out.print("삭제하고자 하는 곡 명 : ");
			String deleteTitle = sc.nextLine();
			
			//삭제 요청보내기 == mc의 메소드 호출(사용자가 입력한 
			int result =  mc.deleteMusic(deleteTitle); //0 || 1이 담김
			
			if(result > 0) { //result = 1(성공적으로 삭제)
				System.out.println("성공적으로 삭제했습니다.");

			}else { //result = 0 (삭제할 곡을 못찾음)
				System.out.println("삭제할 곡을 찾지 못했습니다.");
			}
		}
		
		public void sertchMusic() {
			System.out.println("\n=== 특정 곡 검색 ===");
			
			System.out.print("검색할 곡명(키워드만 기술가능) : ");
			String keyword = sc.nextLine();
			
			//검색요청보내기 = mc의 메소드 호출(사용가자 입력할 키워드값 넘기며 호출)
			ArrayList<Music> list = mc.sertchMusic(keyword);
			
			if(list.isEmpty()){
				System.out.println("검색 결과가 없습니다.");
			}else {
				for( Music m : list) {
					System.out.println(m);
					
				}
			}
		}
		
		//5.수정 곡
		private void updateMusic() {
			System.out.println("\n=== 특정 곡 수정 ===");
			
			System.out.print("수정하고싶은 곡명 : ");
			String reTitle = sc.nextLine();
		
			System.out.print("수정할 곡명 : ");
			String reName = sc.nextLine(); 
			
			System.out.print("수정할 가수명 : ");
			String reArtist = sc.nextLine();
					
			//곡 조회 후 입력값과 같지않을 때, 같을때 출력 = mc의 메소드 호출		
			int result = mc.updateMusic(reTitle, reName, reArtist);
			
			if(result > 0) { //result = 1(성공적으로 수정)
				System.out.println("성공적으로 수정했습니다.");

			}else { //result = 0 (삭제할 곡을 못찾음)
				System.out.println("곡을 찾지 못했습니다.");
			}
			
			
		}
		
	}
	

	
