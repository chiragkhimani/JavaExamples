package com.automation.class14;

class Page {
	public void openPage() {
		System.out.println("Opening page");
	}

	public void closePage() {
		System.out.println("Closing page");
	}
}

class LoginPage extends Page {
	public void openPage() {
		System.out.println("Opening Login page");
	}

	public void doLogin() {
		System.out.println("login successful");
	}
}

class HomePage extends Page {
	public void openPage() {
		System.out.println("Opening Home page");
	}
}





