package com.automation.class8;

public class ArmStrong {
	public static void main(String[] args) {

		// 1^3 + 2^3 + 3^3 = 123
		// 1 + 2 + 3

		int num = 1634, sum = 0;
		int backOfOriginalNum = num;

		while (num > 0) {
			int lastDigit = num % 10;
			sum = sum + lastDigit * lastDigit * lastDigit;
			num = num / 10;
		}

		System.out.println(sum);
		System.out.println(backOfOriginalNum);

		if (backOfOriginalNum == sum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}

	}
}
