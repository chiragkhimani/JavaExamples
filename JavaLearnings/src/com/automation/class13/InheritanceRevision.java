package com.automation.class13;

class Animal {
	String name;
	int age;

	public Animal(String nameFromUser) {
		name = nameFromUser;
		age = 21;
	}

	public Animal(String nameFromUser, int ageFromUser) {
		name = nameFromUser;
		age = ageFromUser;
	}
}

class Engineer extends Animal {

	Engineer() {
		super("Chirag", 21);
	}

}

class Doctor extends Animal {

	public Doctor(String name) {
		super(name);
	}

	public Doctor() {
		super("Chirag");
	}

}

class MBBS extends Doctor {

}

public class InheritanceRevision {
	public static void main(String[] args) {

	}
}
