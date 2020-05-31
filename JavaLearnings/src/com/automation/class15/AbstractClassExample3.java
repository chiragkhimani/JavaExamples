package com.automation.class15;

abstract class A {
	 public abstract void method1(String arg1);

	public void displayMessage() {
		System.out.println("From class A");
	}
}

 abstract class B extends A {
	abstract public void method2(int arg2);

}

abstract class C extends B {
	
}

public class AbstractClassExample3 {

}
