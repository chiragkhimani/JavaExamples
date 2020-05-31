package com.automation.class15;

interface A1 {
	void run();
}

interface B1 extends A1 {
	void eat();
}

class C1 implements B1 {

	@Override
	public void run() {

	}

	@Override
	public void eat() {

	}

}

public class InterfaceDemo2 {

}
