package com.automation.accesstesting2;

import com.automation.accesstesting1.Car;

class ABC extends Car{
	
	public void testMethod() {
		pressBreak();
	}
}

public class AccessDemo2 {
	public static void main(String[] args) {
		Car c  = new Car();
		c.pressBreak();
	}
}
