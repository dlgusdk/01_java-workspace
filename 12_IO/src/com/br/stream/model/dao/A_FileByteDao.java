package com.br.stream.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A_FileByteDao {

	
	//model: 데이터 관련 처리 클래스들을 모아놓는 패키지
	//model.vo(value object): 객체의 데이터를 담을 수 있는 그릇같은 클래스
	//model.dao(data access object) : 데이터가 보관되어 있는 공간과 접근해서 데이터를 입출력하는 클래스
	//model.dto(data access object) : vo와 유사

	/*바이트 기반 스트림
	 * 
	 * -바이트 스트림 : 데이터를 1바이트 단위로 전송하는 통로(한글같은 경우는 깨짐)
	 * -기반 스트림: 외부 매체와 직접적으로 연결되는 통로 
	 * 
	 * xxxInputStream : xxx외부 매체로부터 데이터를 입력받는 통로
	 * xxxOutputStream : xxx외부 매체로 데이터를 출력하는 통로
	 * 
	 */
	
	//프로그램(자바 --> 외부매체(파일) : 출력(write)
	public void fileSave() {
		//FileOutputStram
		
		//1.스트림 객체 생성(파일을 지정하면서)(통로 만들기)
		//2.스트림으로 데이터 출력 (메소드 호출)
		//3.다 사용한 후 스트림 반납
		
		FileOutputStream fout = null; //finally에서 스트림 반납을 할 때 fout오류 ->try 안에 fout 선언을 해서 끌어다 쓸 수 없음. 
		//밖에 초기화 해서 가져다 쓸 수 있게 해주기
		try {
			//1.스트림 객체 생성(파일을 지정하면서)(통로 만들기)
			/*
			 *true미작성시(기본값이 false) :해당 파일이 존재할 경우 기존의 데이터에 덮어씌워짐. 
			 *true 작성시 :기존의 파일에 기록된 데이터에 이어서 작성
			 * 
			 */
			fout = new FileOutputStream("a_byte.txt"/*, true*/);

			//해당파일이 없으면 새로 만들어주고 통로연결. /있으면 그냥 바로 연결
		
			//2. 스트림으로 데이터 출력 (메소드 호출)
			//	숫자로 출력해도 실상 문자로 기록됨(아스키코드표 1~127)
			fout.write(97); //'a'
			fout.write('b'); //'b'
			//fout.write('핳'); //한글은 2byte짜리 데이터이므로 깨져서 나옴.
			
			byte[] arr = {99, 100, 101};
			fout.write(arr); //cde
			
			//write(byte[] b, int off, int len) : byte배열의  off인덱스부터 len갯수단까지 
			fout.write(arr, 1, 2); //de
			fout.write('!');
			fout.write('!');
			fout.write('!');

			//3.다 사용한 후 스트림 반납
			//fout.close(); 위쪽에서 예외가 발생했을 경우 해당 구문이 실행안될 수도 있음!
			
		} catch (FileNotFoundException e) { //존재하지않는 경로를 제시했을 경우 발생
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //이 안에 작성된 코드는 중간에 어떤 예외가 발생하든 해당 catch블럭 실행 후 반드시 실행될 것!
			
			//3.다 사용한 후 스트림 반납
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}	
	
	//프로그램(외부매체(파일) --> 자바 : 입력(reader)
	public void fileRead() {
		//FileInputStream
		
		//1.스트링생성(통로만들기)
		//2.스트링 통해서 입력받아옴(메소드활용)
		//3.다 사용한 스트림 자원 반납.
	
		FileInputStream fin = null;
		try {
			//1.스트링생성(통로만들기)(반드시 존재하는 파일로 기술)
			fin = new FileInputStream("a_byte.txt");
			
			//2.스트링 통해서 입력받아옴(메소드활용)
			/*System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read()); //파일의 끝을 만나는 순간  -1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
			*/
			
			/*
			while(fin.read() != -1) {
				System.out.println(fin.read());
			}  -x */

			/*실행방법 1
			 * while(true) { //한번만 기록하고자 한다면 변수에 넣어줘야함.
				int value = fin.read();
				if(value == -1) {
					break;
				}
				System.out.println(value);

			}*/
			
			//실행방법 2
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.println((char)value);

			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//3.다 사용한 스트림 자원 반납.
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
