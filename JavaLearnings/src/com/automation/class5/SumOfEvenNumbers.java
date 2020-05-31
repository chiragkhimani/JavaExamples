package com.automation.class5;

public class SumOfEvenNumbers {

	// Find sum of 2 + 4 + 6 + 8 + 10
	// Cntr/cmd + Shift + F

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}

		System.out.println(sum);
	}

}
