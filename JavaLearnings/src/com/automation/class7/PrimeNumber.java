package com.automation.class7;

public class PrimeNumber {

	// Check given number is prime or not
	public static void main(String[] args) {
		int num = 13;

		// 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
		
		

		// Prime or Not prime

		int count = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count=1;
			}
		}

		if (count==0) {
			System.out.println("Prime");
		} else {
			System.out.println("Not prime");
		}

	}

}
