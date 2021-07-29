package com.velociter.nikhil.chapter10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise3 {
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
		for (int i = month - 1; i <= monthNames.length; i++) {
			monthString = monthNames[i];
			break;

		}
		// creating a file
		FileWriter filewriter = new FileWriter("Date1.txt");

		String firstFileDate = day + first + "," + monthString + "," + year;
		System.out.println("first file date is:" + firstFileDate);
		// put the data into first file
		for (j = 0; j < firstFileDate.length(); j++) { // j variable for iteration
			filewriter.write(firstFileDate.charAt(j));
		}
		filewriter.close();
		System.out.println("Written in first file  sucessfully");
		// creating a second file
		FileWriter filewriterObject = new FileWriter("Date2.txt");
		int convertedmonthStringIntoMonthNumber = 0;
		for (int i = 0; i < monthNames.length; i++) // i for iteration
		{
			if (monthString == monthNames[i]) {
				convertedmonthStringIntoMonthNumber = i + 1;
			}
		}
		String secondFileDate = day + "/" + convertedmonthStringIntoMonthNumber + "/" + year;

		// put the data into second file
		for (int i = 0; i < secondFileDate.length(); i++) {
			filewriterObject.write(secondFileDate.charAt(i));
		}
		System.out.println("Seond file date is:" + secondFileDate);
		System.out.println("Written  in the second file succesfully");
		filewriterObject.close();

	}
}
