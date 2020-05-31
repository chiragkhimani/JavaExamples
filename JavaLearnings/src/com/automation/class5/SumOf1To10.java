package com.automation.class5;

public class SumOf1To10 {
	public static void main(String[] args) {
		// 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.println(i + " Iteration " + "sum= " + sum + " i=" + i);
		}

		System.out.println(sum);

	}
}
