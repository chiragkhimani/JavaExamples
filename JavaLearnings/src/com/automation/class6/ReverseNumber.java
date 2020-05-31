package com.automation.class6;

public class ReverseNumber {
	public static void main(String[] args) {
//		Input
		int num = 33242534;
		int lastDigit;
		int revNumber=0;

//		Output
//		7259

		while (num != 0) {
			lastDigit = num % 10;
			revNumber =revNumber*10 + lastDigit;
			num = num / 10;
		}
		
		System.out.println(revNumber);
		

	}
}
