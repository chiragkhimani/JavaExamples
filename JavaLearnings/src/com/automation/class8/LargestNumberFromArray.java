package com.automation.class8;

import java.util.Scanner;

public class LargestNumberFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[10]; 

		int largestNum = numbers[0];
		
		System.out.println(numbers);

//		for (int i = 1; i < numbers.length; i++) {
//			if (numbers[i] > largestNum) {
//				largestNum = numbers[i];
//			}
//		}

		System.out.println(largestNum);
	}
}
