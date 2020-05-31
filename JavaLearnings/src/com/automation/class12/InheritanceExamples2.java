package com.automation.class12;

class Vehical {
	int fuelLevel = 0;

	public Vehical(int fuelLevelFromUser) {
		System.out.println("Setting fuel level");
		fuelLevel = fuelLevelFromUser;
	}
	
	public void drive() {
		if (fuelLevel == 0) {
			System.out.println("Please fill fuel");
		} else {
			System.out.println("Car started and driving.....");
		}
	}
	
	public void pressBreak() {

	}
}

class Car extends Vehical {
	
	public Car(int fuelLevel) {
		super(fuelLevel);
		System.out.println("Inside class");
	}
	
	String song;
	public void playSong() {
		System.out.println("Playing " + song);
	}
}

public class InheritanceExamples2 {
	public static void main(String[] args) {
		Car c = new Car(50); // We need to take care it'll call constructor of parent
		c.drive();
	}
}
