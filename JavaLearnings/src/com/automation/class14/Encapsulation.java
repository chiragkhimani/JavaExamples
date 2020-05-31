package com.automation.class14;

class BankAccount {
	private int balance;
	private String accountNumber, accountName, branch, accountType;

	public BankAccount(int balanceFromUser) {
		balance = balanceFromUser;
	}

	public int getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

	public void withDraw(int amount) {

		if (balance - amount < 0) {
			System.err.println("You are poor to make this transfer! Work Hard man!");
		} else {
			balance = balance - amount;
		}
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		BankAccount cust1 = new BankAccount(1000);
		System.out.println(cust1.getBalance());

		cust1.withDraw(500);
		System.out.println(cust1.getBalance());

		cust1.withDraw(200);

		System.out.println(cust1.getBalance());

		cust1.withDraw(1000);
		System.out.println(cust1.getBalance());

	}
}
