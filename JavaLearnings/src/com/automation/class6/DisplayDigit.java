package com.automation.class6;

//Write a program to display each digit of a number in separate line

public class DisplayDigit {
	public static void main(String[] args) {
//		Input
		int num = 9572;
		int lastDigit;

//		Output
//		2759

		for (; num != 0; num = num / 10) {
			lastDigit = num % 10;
			System.out.println(lastDigit);
		}

	}
}
