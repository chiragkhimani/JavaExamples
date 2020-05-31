package com.automation.class12;

// Parent / Base Class / Super class

// Child / Derived class / Sub class
class AdvCalculator extends BasicCalculator {
	

	public AdvCalculator(int a, int b) {
		this();
		System.out.println(super.a);
	}
	
	public AdvCalculator() {
		super(10, 20);
	}

	public void mul() {
		System.out.println("Mul " + a * b);
	}

	public void div() {
		System.out.println("div " + a / b);
	}
}

public class InheritanceExample {
	public static void main(String[] args) {
	
		AdvCalculator bc1 = new AdvCalculator(50, 100);
		
		
	}
}
