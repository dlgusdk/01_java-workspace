package javaTest_이현아.test.controller;

public class Test6 {
	public static void main(String[] args) {
		int[] array = {1,2,71,23,6,8,19,201,12,11};
		
		int count = 0;
		int sum = 0;
			for(int i=0; i<array.length; i++) {			
				int num = array[i]; 
					do{
						if(num % 2 == 1) {
							System.out.println(num);
							sum+=num;
							count++;
							continue;
							
						}else {
							break;
						}
					}while(num == array.length-1);
					
			}			
			double aver = sum / count;
			System.out.printf("더해진 갯수 : %d\n", count);
			System.out.printf("합계 : %d\n", sum);
			System.out.printf("평균 : %.1f", aver);

		}
		
	}


