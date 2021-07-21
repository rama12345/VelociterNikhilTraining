package com.velociter.nikhil.chapter8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise2 {

	public static void main(String[] args) {

		String string, word = "", arrayOfString[] = new String[50];
		int i, length, numberOfWords = 0; // i variable for iteration
		char character = ' ';
		// taking a input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		string = sc.nextLine();
		string = string + " ";
		// finding a string length from string function
		length = string.length();
		for (i = 0; i < length; i++) {
			// fiding a one by one character from string using charAt()
			character = string.charAt(i);
			if (character != ' ') {
				// adding a character in word
				word = word + character;
			} else {
				// assign the word on the arrayofString index
				arrayOfString[numberOfWords++] = word + ":";
				word = "";
			}
		}
		for (i = 0; i < numberOfWords; i++)
			System.out.print(arrayOfString[i] + "");
	}
}
