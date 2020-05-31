package com.automation.class4;

import java.awt.Choice;
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		String dbUsername = "Deepika", dbPassword = "Test123#";

		Scanner sc = new Scanner(System.in);
		String choice = "";
		do {
			System.out.println("Enter your username - ");
			String username = sc.nextLine();

			System.out.println("Enter your password - ");
			String password = sc.nextLine();

			if (dbUsername.equals(username) && dbPassword.equals(password)) {
				System.out.println("Login is successful");
				break;
			} else {
				System.out.println("Login failed");
			}

			System.out.println("Do you want to try one more time?");
			choice = sc.nextLine();

		} while (choice.equals("Yes"));

	}
}
