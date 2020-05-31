package com.automation.class13;

public class BasicCalculator {

	int a, b;

	BasicCalculator(int num1, int num2) {
		a = num1;
		b = num2;
	}

	public void sum() {
		System.out.println("Summation " + (a + b));
	}

	public void sub() {
		System.out.println("Subtraction " + (a - b));
	}

	public void printGreeting() {
		System.out.println("Welcome to Basic Calculator");
	}
	
	
}