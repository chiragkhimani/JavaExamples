package com.automation.class9;

public class ListPrimeNumber {
	// Find list of prime number from 1 to 100
	public static void main(String[] args) {

		for (int i = 1; i <= 1000; i++) {
			if (i == getReverse(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int num) {
		int count = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count = 1;
			}
		}

		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPerfect(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == num) {
			return true;
		} else {
			return false;
		}
	}

	public static int getReverse(int num) {
		int lastDigit;
		int revNumber = 0;

//		Output
//		7259

		while (num != 0) {
			lastDigit = num % 10;
			revNumber = revNumber * 10 + lastDigit;
			num = num / 10;
		}

		return revNumber;
	}

}
