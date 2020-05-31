package com.automation.class6;

public class PerfectNumber {
	//
	public static void main(String[] args) {
		// Input
		int num = 11, sum = 0;

		// Output
		// 1 2 3 6

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
				System.out.println(i);
			}
		}

		if (sum == num) {
			System.out.println("Perfect");
		} else {
			System.out.println("not perfect");
		}

	}

}
