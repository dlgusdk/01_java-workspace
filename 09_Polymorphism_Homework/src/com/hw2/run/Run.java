package com.hw2.run;

import com.hw2.model.vo.GalaxyNote9;
import com.hw2.model.vo.SmartPhone;
import com.hw2.model.vo.V40;

public class Run {
	public static void main(String[] args) {
		SmartPhone[] arr = new SmartPhone[2];
		arr[0] = new GalaxyNote9();//다형성
		arr[1] = new V40();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].printMaker();
			arr[i].makeacall();
			arr[i].takeaCall();
			arr[i].charge();
			arr[i].picture();

			System.out.println();
		}		
	}
}
