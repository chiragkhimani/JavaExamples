package com.automation.class7;

public class For {

//	    1
//	   12
//	  123
//	 1234
//	12345

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int k = 5 - i; k >=1; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
