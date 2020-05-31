package com.automation.accesstesting1;

public class Car {
	int speed;

	public Car() {

	}

	public static void displayMsg() {
		System.out.println("From Car");
	}

	protected void pressBreak() {
		speed = 0;
	}
}
