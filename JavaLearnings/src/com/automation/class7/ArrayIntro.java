package com.automation.class7;

public class ArrayIntro {
	public static void main(String[] args) {
//		int marks[] = new int[10]; // Declaration & Initialization of array

		int marks[] = { -10, 45, 64, -34, 78, -98, 23, 48 };

		//Sum of array element
		int salary[] = { 10000, 45000, 64000, 34000, 78000 };
		int sum=0;
		
		int userInput = 64000;

//		Accessing element stored inside array - array_name[index]

		for (int i = 0; i < salary.length; i++) {
			if(salary[i]==userInput) {
				System.out.println(i);
			}
		}
		
		System.out.println("Avg= "+(float)sum/salary.length);

	}
}
