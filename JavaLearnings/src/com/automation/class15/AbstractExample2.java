package com.automation.class15;

abstract class Page {
	int i;

	Page() {
		i = 10;
	}

	abstract public void openPage();

	abstract public void openPage(String pageName);

	abstract public void waitForPageToLoad();

	public void wait(int sec) {
		// code to wait for given second
		System.out.println("Waiting for " + sec + " second");
	}

	public static void getTitle() {
		// to get title of any page
	}
}

class LoginPage extends Page {

	public void openPage() {
		System.out.println("Opening login page");
	}

	public void waitForPageToLoad() {
		System.out.println("Waiting for login page to load");
	}

	public void doLogin() {

	}

	@Override
	public void openPage(String pageName) {

	}

}

class HomePage extends Page {

	public void waitForPageToLoad() {
		System.out.println("Waiting for home page to load");
	}

	public void openPage() {
		System.out.println("Opening home page");
	}

	@Override
	public void openPage(String pageName) {

	}
}

public class AbstractExample2 {
	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		login.openPage();

	}
}
