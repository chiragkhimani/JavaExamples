package com.automation.class12;

public class BasicCalculator {

	int a = 20, b;

	BasicCalculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	

	public void sum() {
		System.out.println("Summation " + (a + b));
	}

	public void sub() {
		System.out.println("Subtraction " + (a - b));
	}

	

}