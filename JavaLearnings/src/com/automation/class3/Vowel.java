package com.automation.class3;

public class Vowel {
	public static void main(String[] args) {
		char c = 'e';
		int i = 5;

		if (c == 'i' || c == 'o' || c == 'u' || c == 'a' || c == 'e') {
			System.out.println("Vowel");
		} else {
			System.out.println("Not vowel");
		}

		switch (c) {
		case 'a':
		case 'e':
		case 'o':
		case 'i':
		case 'u':
			System.out.println(" Vowel");
			break;
			
		default:
			System.out.println("Not Vowel");
		}

	}
}
