package com.automation.class9;

import java.util.Scanner;

public class MethodExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, result;

		// Get First Number
		printLine(20, '*');
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();

		// Get second number
		printLine(20, '*');
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();

		result = sum(num1, num2);
		
		System.out.println(result);
	}

	static int sum(int num1, int num2) {
		return (num1 + num2);
	}

	static void printLine(int length, char charToPrint) {
		// length - Parameter / Arguments

		for (int i = 1; i <= length; i++) {
			System.out.print(charToPrint);
		}

		System.out.println();
	}
}
