package com.br.stream.run;

import com.br.stream.model.dao.B_FileCharDao;
import com.br.stream.model.dao.D_AssistObjectDao;

public class StreamTestRun {

	public static void main(String[] args) {
		//A_FileByteDao a = new A_FileByteDao();
		//a.fileRead();
		
		B_FileCharDao b = new B_FileCharDao();
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("파일명(확장자 제외) : ");
		String name = sc.nextLine();
		System.out.println("저장시킬 내용 : ");
		String str = sc.nextLine();
		*/
		//b.inputFileSave(str, name);//저장할 내용, 이름
		//b.fileRead();
		//C_AssistBufferedDao c = new C_AssistBufferedDao();
		//c.fileRead();
		
		D_AssistObjectDao d = new D_AssistObjectDao();
		d.fileRead();
	}
	

}
