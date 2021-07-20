package com.velociter.nikhil.chapter10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String args[]) throws IOException {

		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		String first = null;
		String monthStr = null;
   //taking the input form user day,month,year
		int day = 0, month = 0, year = 0, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day:");
		day = sc.nextInt();
		System.out.println("Enter the Month:");
		month = sc.nextInt();
		System.out.println("Enter the year:");
		year = sc.nextInt();
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
		for (int i = month; i < monthNames.length; i++) {
			monthStr = monthNames[i];
			break;

		}
		//creating a file
		FileWriter fwriter = new FileWriter("Date.txt");

		String date = day + first + monthStr + year;
		//put the data into a file
		for (j = 0; j < date.length(); j++) {
			fwriter.write(date.charAt(j));
		}
		System.out.println("Write sucessfully");
	}
}
