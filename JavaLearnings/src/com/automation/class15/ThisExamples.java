package com.automation.class15;

class ABC {
	int i = 10; // Instance variable

	ABC() {
		this(10);
	}

	ABC(int a) {

	}

	public void displayValue() {
		int i = 20; // Local variable
		System.out.println(this.i);
	}

	public void testMethod() {
		displayValue();
	}

}

public class ThisExamples {
	public static void main(String[] args) {
		ABC abc = new ABC();
		abc.displayValue();
	}
}
