package com.automation.class11;

public class Car {
	int makeYear;  // instance / object variable 
	String color;   // instance / object variable 
	int noOfcc;		 // instance / object variable 
	static int numOfCarsCreated;  // static / class variable
	
	

	public Car(int makeYear1, String color1, int noOfCC1) {
		
		makeYear = makeYear1;
		color = color1;
		noOfcc = noOfCC1;
		numOfCarsCreated++;
		
	}

	public void start() {
		int temp = 10;  // Local variable

	}

	public void pressBreak() {

	}
	
	public static void displayNumberOfCars() {
		System.out.println(numOfCarsCreated);
	}

}
