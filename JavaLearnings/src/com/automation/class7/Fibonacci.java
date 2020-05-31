package com.automation.class7;

public class Fibonacci {
	// 0 1 1 2 3 5 8 13

	public static void main(String[] args) {
		int limit = 1;
		
		int num1=0;
		int num2=1;
		int sum=0;
		System.out.println(num1);
		System.out.println(num2);
		sum=num1+num2;
		
		while(sum<=limit) {
			System.out.println(sum);
			num1=num2;
			num2=sum;
			sum=num1+num2;
		}
		
	}
}
