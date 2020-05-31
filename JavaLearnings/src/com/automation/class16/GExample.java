package com.automation.class16;

public class GExample {
	
	// Generic in java

	public static void main(String[] args) {

		Utility<Integer> u = new Utility<Integer>();
		
		Utility<String> utiString = new Utility<String>();
		
		u.setData(10);
		
		utiString.setData("TestMessage");
		
		utiString.printData();
		
		u.printData();

		
	}

}
