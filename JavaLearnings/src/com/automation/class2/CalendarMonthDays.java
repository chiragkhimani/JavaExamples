package com.automation.class2;

import java.util.Scanner;

public class CalendarMonthDays {
	// Print number of day in given month

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month = sc.nextLine();

		switch (month) {

		case "may":
		case "march":
		case "jan":
		case "july":
		case "aug":
		case "oct":
		case "dec":
			System.out.println("31");
			break;

		case "feb":
			System.out.println("28");
			break;

		case "june":
		case "sep":
		case "april":
		case "nov":
			System.out.println("30");
			break;

		default:
			System.out.println("enter valid month name in sort form");

		}
	}
}
