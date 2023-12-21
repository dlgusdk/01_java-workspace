package javaTest_이현아.test.controller;

public class Test3 {
	public static void main(String[] args) {
		
		double sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;	
		}
		double aver = sum / 100;
		System.out.printf("합계 : %.0f\n", sum);
		System.out.printf("평균 : %.1f", aver);
	}
		
}



