package com.automation.class16;

public class WrapperClassExample {

	public static void main(String[] args) {

		String num1 = "10.0";
		String num2 = "a 20  ";

		double a = Double.valueOf(num1.trim());

		int j = 10;
		
		Integer i = j;  // AutoBoxing
		
		Integer I1 = new Integer(j);  // Boxing
		
		int k = i;      //  AutoUnboxing

		int k1 = i.intValue();  // Unboxing
		
		String str = String.valueOf(100);
		

		System.out.println(str);
	}

}
