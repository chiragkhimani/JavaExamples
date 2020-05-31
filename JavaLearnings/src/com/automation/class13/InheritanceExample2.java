package com.automation.class13;

class Page {

	public void openPage() {
		System.out.println("code to open page");
	}
	
	public void closePage() {
		
	}

}

class LoginPage extends Page {
	
	public void openPage() {
		System.out.println("code to open login page");
	}

}

class ProfilePage extends Page {
	public void openPage() {
		System.out.println("code to open profile page");
	}
}

class HomePage extends Page {
	public void openPage() {
		System.out.println("code to open home page");
	}
}

public class InheritanceExample2 {

	public static void main(String[] args) {
		HomePage homPage = new HomePage();
		LoginPage login = new LoginPage();
		login.openPage();
		homPage.openPage();

	}

}
