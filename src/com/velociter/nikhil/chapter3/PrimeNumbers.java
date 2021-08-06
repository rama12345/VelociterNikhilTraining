package com.velociter.nikhil.chapter3;

import java.util.Scanner;

public class PrimeNumbers {
	static void prime_Number(int startNumber, int endNumber) {
		// Declaring the variables
		int x, y, flg;

		// Printing display message
		System.out.println("All the Prime numbers within " + startNumber + " and " + endNumber + " are:");

		// Using for loop for traversing all
		// the numbers from 1 to N
		long startTime = System.currentTimeMillis();
		System.out.println("Before Execution:" + startTime);

		//endNumber = (int) Math.sqrt(endNumber);
		for (x = startNumber; x <= endNumber; x++) {
			// Using flag variable to check
			// if x is prime or not
			flg = 1;

			for (y = 2; y * y <= Math.sqrt(x); y++) {
				if (x % y == 0) {
					flg = 0;
					break;
				}
			}

			// If flag is 1 then x is prime but
			// if flag is 0 then x is not prime
			if (flg == 1)
				System.out.println(x + " ");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("After Execution:" + endTime);

		// float sec = (endTime - startTime);
		System.out.println("Exceution Time:"+(endTime - startTime) / 1000F + " seconds");

	}

	public static void main(String[] args) {
		int startNumber, endNumber;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Start Number : ");
		startNumber = input.nextInt();
		System.out.println("Enter End Number to Reach the Prime : ");
		endNumber = input.nextInt();

		prime_Number(startNumber, endNumber);

	}
}
