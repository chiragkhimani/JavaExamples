package com.automation.class15;

// 1. Interface doesn't have any non abstract method
// 2. We cannot create object of interface
// 3. By default in interface methods are public and abstract
// 4. Interface doesn't constructor
// 5. By default all variable are public static and final

interface Bank {
	
	int i = 0;
	
	void displayInterestRate();

	void openAccount();

	void withdraw(int amount);

	void deposit(int amount);
	
	void displayBalance();
}

class HSBCBank implements Bank {
	int balance;

	@Override
	public void displayInterestRate() {
		System.out.println("4.5 %");
	}

	@Override
	public void openAccount() {
		System.out.println("Opening HSBC Account");
	}

	@Override
	public void withdraw(int amount) {
		if (amount > 10000) {
			balance = balance - amount - 10;
		}else {
			balance = balance - amount;
		}
	}

	@Override
	public void deposit(int amount) {
		balance = balance + amount;
	}

	@Override
	public void displayBalance() {
		System.out.println(balance);
	}
}

class CitiBank implements Bank {

	int balance;

	@Override
	public void displayInterestRate() {
		System.out.println("6.0 %");
	}

	@Override
	public void openAccount() {
		System.out.println("Opening account in citi bank");
	}

	@Override
	public void withdraw(int amount) {
		balance = balance - amount;
	}

	@Override
	public void deposit(int amount) {
		balance = balance + amount;
	}
	
	@Override
	public void displayBalance() {
		System.out.println(balance);
	}

}

public class InterfaceDemo {
	public static void main(String[] args) {
		HSBCBank hsbc = new HSBCBank();
		CitiBank citi = new CitiBank();
		hsbc.displayInterestRate();
		citi.displayInterestRate();
		hsbc.deposit(50000);
		hsbc.withdraw(10000);
		hsbc.withdraw(5000);
		hsbc.withdraw(15000);
		hsbc.displayBalance();
		
		citi.deposit(10000);
		citi.withdraw(2000);
		citi.displayBalance();
	}
}
