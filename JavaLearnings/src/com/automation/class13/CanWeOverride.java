package com.automation.class13;

class Parent {
	public static void printGreeting() {
		System.out.println("From parent class");
	}
	
}

class Child extends Parent {
	public static void printGreeting() {
		System.out.println("From Child class");
	}
	
}

public class CanWeOverride {
	public static void main(String[] args) {
		Parent.printGreeting();
	}
}
