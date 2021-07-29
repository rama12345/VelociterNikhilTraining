package com.velociter.nikhil.chapter8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SentanceTokenizer {

	public static void main(String[] args) {

		String textOfString;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		// taking input from user
		textOfString = input.nextLine();
		// Stringtokenizer breaks the string from delimeter
		StringTokenizer stringTokens = new StringTokenizer(textOfString, ",");
		// printing the string
		while (stringTokens.hasMoreTokens()) { // iteration for the printing
			System.out.println(stringTokens.nextToken());
		}
	}

}
