package com.automation.class6;

public class DivisorOfNumber {
	public static void main(String[] args) {
		// Input
		 int num = 125;

		// Output
		// 1 2 4 8 16
		
		
		for (int i = 1; i <=num; i++) {
			if(num % i ==0) {
				System.out.println(i);
			}
		}
		
		
		
	}
}
