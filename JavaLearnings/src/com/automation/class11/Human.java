package com.automation.class11;

public class Human {
	String gender;
	String name;
	int age;

	Human(int age1, String gender1, String name1) {
		age = age1;
		gender = gender1;
	}

	public void walk() {
		System.out.println(name + " is walking");
	}

	public void speak() {
		System.out.println(name + " is speaking");
	}

	public void displayAge() {
		System.out.println(age);
	}
}
