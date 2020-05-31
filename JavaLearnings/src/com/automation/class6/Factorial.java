package com.automation.class6;

public class Factorial {
	
	// Find factorial of number
	// Example - 5 ==> 5 * 4 * 3 * 2 * 1
	public static void main(String[] args) {
		int num = 4, fact=1;
		
		for (int i = 1; i <=num; i++) {
			fact = fact * i;
		}
		
		
		System.out.println(fact);
	}
}
