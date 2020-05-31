package com.automation.class14;

class SeleniumUtils {

	public void openSpecificPage(LoginPage azizPage) {
		azizPage.doLogin();
	}

}

public class ExampleOfRunTimePoly {
	public static void main(String[] args) {

		SeleniumUtils utils = new SeleniumUtils();

		utils.openSpecificPage(new LoginPage());
	}
}
