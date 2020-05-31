package com.automation.class8;

public class TwoDArray {
	public static void main(String[] args) {
		// Declaration of 2D array
//		int table[][] = new int[5][10];

		int table[][] = { { 3, 5, 7, 9 }, { 4, 6, 6, 6 }, { 8, 9, 9, 8 } };

//
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j]);
			}
			
			System.out.println();
		}
	}
}

// 0 0 0 
// 0 0 0 
// 0 0 0