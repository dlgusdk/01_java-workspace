package javaTest_이현아.test.controller;

public class Test2 {
	public static void main(String[] args) {
		for(int j=2; j<=5; j++) {
			for(int i=1; i<=9; i++) {
				if(j % 2 == 1 && i % 2 == 1) {
					System.out.printf("%d * %d = %d\n", j, i, j * i);
				}
			}
		}
	}
}
