package com.velociter.nikhil.chapter4;

public class Matrix {
	public static void main(String args[]) {
		int n=12;
		int[][] table = new int[n][n];
		int i, j;// i and j variable for iteration

		for (i = 0; i <= table.length - 1; i++) {
			for (j = 0; j <= table.length - 1; j++) {
				table[i][j] = (i + 1) * (j + 1); // multiply of table indexing row and column one by one
				if (table[i][j] < 10) // here small number will be print on the left side in the table
					System.out.print("  " + table[i][j] + " ");
				else if (table[i][j] > 10 && table[i][j] < 100)// here bigger number will be print on the right side in
																// the table
					System.out.print(" " + table[i][j] + " ");
				else
					System.out.print(table[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
