package com.automation.class9;

public class Methods {

	public static void main(String[] args) {
		System.out.println("Enter first number");
		printLine(20,'='); // Method Call

		System.out.println("enter second number");
		printLine(50,'*'); // Method Call

		System.out.println("Result = ");
		printLine(150,'-');

	}

	// Method definition
	static void printLine(int length, char charToPrint) {
		// length - Parameter / Arguments

		for (int i = 1; i <= length; i++) {
			System.out.print(charToPrint);
		}

		System.out.println();
	}

}
