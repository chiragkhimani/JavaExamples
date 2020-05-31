package com.automation.class13;

class Calculator {

	public void sum(int a, double b) {
		System.out.println(a + b);
	}

	public void sum(double a, double b) {
		System.out.println(a + b);
	}

	public void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

}

public class MethodOverloadingExample {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.sum(10.0, 20.0);
	}
}
