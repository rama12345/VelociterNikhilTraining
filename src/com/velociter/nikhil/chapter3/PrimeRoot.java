package com.velociter.nikhil.chapter3;

import java.util.Scanner;

class PrimeRoot{

	
	public static void main(String[] args) {
		int N; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		N = scanner.nextInt();
		long startTime = System.currentTimeMillis();
		System.out.println("Before Execution Time is : " + startTime);
		if (N >= 1) {
			System.out.println(" prime numbers are:");
		}

		for (int j = 2; j <= N; j++) {
			int flag = 0;
			for (int i = 2; i <= Math.sqrt(j); i++) {
				if (j % i == 0) {
					flag = flag + 1;
				}
			}
			if (flag == 0) {
				System.out.print(j + " ");
			}

		}
		long endTime = System.currentTimeMillis();
		System.out.println("\nAfter Execution Time is :" + endTime);
		System.out.println("Difference in Execution Time is : " + (endTime - startTime) / 1000F + "s");
	}
}