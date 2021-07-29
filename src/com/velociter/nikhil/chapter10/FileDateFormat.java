package com.velociter.nikhil.chapter10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String args[]) throws IOException {

		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		String first = null;
		String monthString = null;
		// taking the input form user day,month,year
		int day = 0, month = 0, year = 0, j;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day:");
		day = scanner.nextInt();
		System.out.println("Enter the Month:");
		month = scanner.nextInt();
		System.out.println("Enter the year:");
		year = scanner.nextInt();
//checking the day number 
		if (day == 1) {
			first = "st";
		}
		if (day == 2) {
			first = "nd";

		}
		if (day == 3) {
			first = "rd";

		}
		if (day > 3) {
			first = "th";
		}
//convert  the month number to month name 
		for (int i = month - 1; i < monthNames.length; i++) { // i for iteration
			monthString = monthNames[i];
			break;

		}
		// creating a file
		FileWriter filewriter = new FileWriter("Date.txt");

		String date = day + first + "," + monthString + "," + year;
		// put the data into a file
		for (j = 0; j < date.length(); j++) {
			filewriter.write(date.charAt(j));
		}
		filewriter.close();
		System.out.println("Write sucessfully");
	}
}
