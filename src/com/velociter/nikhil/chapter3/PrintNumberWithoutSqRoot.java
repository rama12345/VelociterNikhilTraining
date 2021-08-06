package com.velociter.nikhil.chapter3;

import java.util.Scanner;

public class PrintNumberWithoutSqRoot {
	public static void main(String args[]) {
		int start, end, i, j, count = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("How Many Prime Number from Start to End You Want.\n");
        //take input from user
		System.out.print("Enter Starting Number : ");
		start = scan.nextInt();
		System.out.print("Enter Ending Number : ");
		end = scan.nextInt();

		System.out.print("Prime Numbers Between " + start + " and " + end + " is :\n");
		long startTime = System.currentTimeMillis();
		System.out.println("Before Execution in Second : " + startTime);
		
		for (i = start; i <= end; i++) {
		    	count = 0;
       			//checking no. is prime or not
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			//condition for prime
			if (count == 0) {
				System.out.print(i + " ");
			}
		}
		long entTime = System.currentTimeMillis();
		System.out.println("\nAfter Execution in Second : " + entTime);
		System.out.println("Difference Between Execution in Second : " + (entTime - startTime) / 1000F + "seconds");
	}
}