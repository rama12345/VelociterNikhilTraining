package com.velociter.nikhil.chapter3;

import java.util.Scanner;

public class PrintNumberWithSqRoot {
	public static void main(String args[]) {
		int start, end, i, j, count = 0;
		Scanner scan = new Scanner(System.in);
//taking input from user
		System.out.print("How Many Prime Number from Start to End You Want.\n");

		System.out.print("Enter Starting Number : ");
		start = scan.nextInt();
		System.out.print("Enter Ending Number : ");
		end = scan.nextInt();
 
		System.out.print("Prime Numbers Between " + start + " and " + end + " is :\n");
		//start execution time
		long startTime = System.currentTimeMillis();
		System.out.println("Before Execution in Second : " + startTime);
		for (i = start; i <= end; i++) {
			count = 0;
			for (j = 2; j < Math.sqrt(i); j++) {     //calculating square root of numbers
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.print(i + " ");
			}
		}
		//end execution time
		long entTime = System.currentTimeMillis();
		System.out.println("\nAfter Execution in Second : " + entTime);
		//convert millis second to second
		System.out.println("Difference Between Execution in Second : " + (entTime - startTime) / 1000F + "seconds");
	}
}