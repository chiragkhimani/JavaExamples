package com.automation.class15;

class Shape {
	abstract public void draw();
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Drawing circle");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("Drawing Triangle");
	}
}

public class AbstractionExample {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.draw();
	}
}
