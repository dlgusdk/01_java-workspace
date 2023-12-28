package com.hw1.run;

import com.br.chap02_objectArray.model.vo.Phone;
import com.hw1.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee[] em = new Employee[3];
		
		em[0] = new Employee();
		em[1] = new Employee(1, "홍길동", null, null, 19, 'M', 0, 0.0, "01022223333", "서울 잠실");
		em[2] = new Employee(2, "강말순", "교육부", "강사", 20 ,'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		//for each
		for(Employee em1 : em) {
			System.out.println(em1.information());
		}
		
		//for loop
		//for(int i=0; i<em.length; i++) { //for loop문
		//System.out.println(em[i].information());
		
	
		System.out.println("=============================================================");
	

			em[0].setEmpName("김말똥");
			em[0].setDept("영업부");
			em[0].setJob("팀장");
			em[0].setAge(30);
			em[0].setGender('M');
			em[0].setSalary(3000000);
			em[0].setBonusPoint(0.2);
			em[0].setPhone("01055559999");
			em[0].setAddress("전라도 광주");
			
			System.out.println(em[0].information());
		
			em[1].setDept("기획부");
			em[1].setJob("부장");
			em[1].setAge(19);
			em[1].setGender('M');
			em[1].setSalary(4000000);
			em[1].setBonusPoint(0.3);
			em[1].setPhone("01022223333");
			em[1].setAddress("서울 잠실");
			
			System.out.println(em[1].information());
		
	
			System.out.println("=============================================================");
			
			for(int i=0; i<em.length; i++) {
				
				System.out.println(em[i].getEmpName() + "의 연봉 : " + (int)(em[i].getSalary() + ((em[i].getSalary() * em[i].getBonusPoint())))*12);
				
			}
			
			System.out.println("=============================================================");
			int aver = 0;
			int sum = 0;
			for(int i=0; i<em.length; i++) {
				sum += (int)(em[i].getSalary() + ((em[i].getSalary() * em[i].getBonusPoint())))*12;
			}
			aver = sum / 3;
			System.out.print(aver);
	}
}
