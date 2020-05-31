package com.automation.class13;

class AdvCalculator extends BasicCalculator {

	AdvCalculator(int num1, int num2) {
		super(num1, num2);
	}

	public void mul() {
		System.out.println("Mul " + a * b);
	}

	public void div() {
		System.out.println("div " + a / b);
	}

	public void printGreeting() {
		System.out.println("Welcome to Advance Calculator");
	}

	@Override
	public void sub() {
		if (a - b < 0) {
			System.err.println("Sub is less than zero");
		}

		super.sub();
	}

}

public class PolymorphismDemo {
	public static void main(String[] args) {
		AdvCalculator ad = new AdvCalculator(10, 20);
		ad.printGreeting();
		ad.sub();

	}
}