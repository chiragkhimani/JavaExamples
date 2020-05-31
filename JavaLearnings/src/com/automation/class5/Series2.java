package com.automation.class5;

public class Series2 {
	public static void main(String[] args) {
		// 1 + 10 + 2 + 9 + 3 + 8 + 4 + 7 + 5 + 6

		int j=10;
		int sum=0;
		for (int i = 1; i <= 5; i++) {
			sum = sum + i +j;
			j--;
		}
		
		System.out.println(sum);

	}
}
