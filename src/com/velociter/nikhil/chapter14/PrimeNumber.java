package com.velociter.nikhil.chapter14;
import java.util.Scanner;
import java.util.Vector;

public class Exercise1 {
	public static void main(String[] args) {
		// creating and initialize a data member.
		int startNumber, endNumber, i, j, count = 0; // i and j for the iteratoin
		// creating an object of vector to store prime number.
		Vector<Integer> vectorobj = new Vector<Integer>();
		// get the value from user start to end number.
		Scanner scannerObj = new Scanner(System.in);
		System.out.print("Enter the Range of Number Between Start and End Of Prime.");
		System.out.print("Enter Starting Number : ");
		startNumber = scannerObj.nextInt();
		System.out.print("Enter Ending Number : ");
		endNumber = scannerObj.nextInt();
		// printing prime number between start and end. 
		System.out.print("Prime Numbers Between " + startNumber + " and " + endNumber + " is :\n");
		// check the condition between start to end.
		for (i = startNumber; i <= endNumber; i++) {
			count = 0;
			// fetch the condition of prime number. 
			for (j = 2; j < i; j++) {
				// check if equal and divisible it.
				if (i % j == 0) {
					count++;
					break;
				}
			}
			// check the count if zero.
			if (count == 0) {
				// add prime to vector.
				vectorobj.add(i);
			}
		}
		System.out.print(vectorobj + " ");
	}
}