package com.velociter.nikhil.chapter4;

public class Exercise2 {
	public static void main(String args[]) {

		int[][] table = new int[12][12];

		for (int i = 0; i <= table.length - 1; i++) {
			for (int j = 0; j <= table.length - 1; j++) {
				table[i][j] = (i + 1) * (j + 1);
				if (table[i][j] < 10)
					System.out.print("  " + table[i][j] + " ");
				else if (table[i][j] > 10 && table[i][j] < 100)
					System.out.print(" " + table[i][j] + " ");
				else
					System.out.print(table[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
