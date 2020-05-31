package com.automation.class5;

public class SumOfSeriesPlusAndMinus {
	public static void main(String[] args) {
		// Find out sum of below series

		// 1 + 2 -3 + 4 + 5 - 6 + 7 + 8 -9 + 10

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				sum = sum - i;
			} else {
				sum = sum + i;
			}
		}
		
		System.out.println(sum);

	}
}
