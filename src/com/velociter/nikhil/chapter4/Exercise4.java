
package com.velociter.nikhil.chapter4;

public class Exercise4 {
	public static void main(String args[]) {
		String[] dates = new String[10];
		String date;

		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String ending = " ";
		String dayString = null;
		String monthString = null;
		String yearString = null;
		char separator = '/';
		int day = 0;
		int month = 0;
		int year = 0;
		int daysIncrement = 0;

		for (int i = 0; i < dates.length; i++) {
			year = (int) (100.0 * Math.random());
			month = (int) (12.0 * Math.random()) + 1;
			// finding out year is leap year
			daysIncrement = (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) && (month == 2) ? 1 : 0;
			// generate the random day 1 t0 31
			day = (int) (Math.random() * (daysInMonth[month - 1] + daysIncrement)) + 1;
			dates[i] = " " + day + separator + month + separator + year;
			System.out.println("Day is " + dates[i]);
		}

		int start = 0;
		int end = 0;
		System.out.println();
		for (String date1 : dates) { // iterated by for each
			start = 0;
			end = date1.indexOf(separator, start);
			dayString = date1.substring(start, end);
			start = end + 1;
			end = date1.indexOf(separator, start); // putting separator('/') on the specific index according to date
													// order
			monthString = date1.substring(start, end);
			start = end + 1;
			yearString = date1.substring(start);

			if (dayString.length() == 1)
				switch (dayString.charAt(0)) {
				case '1': // day wise assign the 1st, 2nd, 3rd 4th..etc
					ending = "st";
					break;
				case '2':
					ending = "nd";
					break;
				case '3':
					ending = "rd";
					break;
				default:
					ending = "th";
				}
			else if (dayString.charAt(0) == '1')
				ending = "th";
			else
				switch (dayString.charAt(1)) {
				case '1':
					ending = "st";
					break;
				case '2':
					ending = "nd";
					break;
				case '3':
					ending = "rd";
					break;
				default:
					ending = "th";
				}

			System.out.println(
					dayString + ending + " " + monthNames[monthString.length() == 1 ? monthString.charAt(0) - '1'
							: 9 + monthString.charAt(1) - '0'] + " " + "19" + yearString);

		}
	}
}
