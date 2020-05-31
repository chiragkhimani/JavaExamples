package com.automation.class2;

public class NestedIfElse {
//	Blood donation
	public static void main(String[] args) {
//		 If age > 18 they are eligible else they are not eligible
//		 If weight > 50 they can donate 
//		 if weight is less than 50 then "work on your weight and try next time"
//		 if age is more than 15 and weight is also more than 60 they can donate

		int age = 17, weight = 65;

		if (age >= 18) {

			if (weight > 50) {
				System.out.println("You can also donate");
			} else {
				System.out.println("You're eligible but you have to work on weight and try next time");
			}

		} else if (age > 15) {
			if (weight > 60) {
				System.out.println("you can donate");
			} else {
				System.out.println("you'are not eligible");
			}
		} else {
			System.out.println("You are too young to donate blood");
		}
	}
}
