package com.automation.class3;

public class LogicalOperator {
	public static void main(String[] args) {
		boolean c1 = true;
		boolean c2 = false;
		boolean c3 = true;
		boolean c4 = true;

		boolean result = c1 || c1 && c3 && c4 && c2 && c1 || c2 && c1 && c4 && c3 || c1 && c3 && c4;

		System.out.println(result);

	}
}
