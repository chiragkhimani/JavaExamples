package com.automation.class14;

public class TestingClass {
	public static void main(String[] args) {
		
		

		HomePage home = new HomePage();
		
		
		// Run time polymorphism
		// Dynamic method dispatch
		
		Page remotePage = new LoginPage();
		// Opening login page
		
		Page page = new Page();
		// Opening Page
		
		LoginPage login = new LoginPage();
		// Opening Login page
		
//		LoginPage remoteLogin = new Page();
		// Error
		
		
		
		
		
		
		
		
		
	}
}
