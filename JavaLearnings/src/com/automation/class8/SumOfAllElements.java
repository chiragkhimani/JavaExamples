package com.automation.class8;

public class SumOfAllElements {
	public static void main(String[] args) {
		int num[][] = { { 10, 20, 30 }, { 30, 50, 10, 50 }, { 55, 65, 30, 100 } };
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				sum = sum + num[i][j];
			}
		}

		System.out.println(sum);
	}
}
