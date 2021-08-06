package com.velociter.nikhil.chapter10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MatchDuplicateWordFile {

	public static void main(String args[]) throws IOException {
		String string, word = "", storeString = ""; // "the fact cat "

		int size = 100;
		String arrayOfString[] = new String[size];
		char character;
		int lengthOfString, i, numberOfWords = 0; // i variable for iteration

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");

		if (input.hasNext("[A-Za-z]*")) { // condition for validation
			string = input.nextLine();

			// add the empty word string of last word.
			string = string + " ";
			lengthOfString = string.length();

			for (i = 0; i < lengthOfString; i++) {
				// finding a one by one character from string using charAt()
				character = string.charAt(i);
				if (character != ' ') {
					// adding a character in word
					word = word + character;
				} else {
					// add the word into the array of string and count it.
					arrayOfString[numberOfWords] = word;
					numberOfWords++;
					// set as empty word
					word = "";
				}
			}
			// creating a file
			FileWriter fileWriter = new FileWriter("E:/Arrayindex.txt");
			int length = numberOfWords - 1;

			// fetching and iterating the word of possible permutation
			for (int j = 0; j < factorial(numberOfWords); j++) {

				for (int e = 0; e <= length - 1; e++) { // e variable for the iteration

					if (e <= e + 1) {
						storeString = arrayOfString[e]; // swapping the word
						arrayOfString[e] = arrayOfString[e + 1];
						arrayOfString[e + 1] = storeString;

					}
				}
				// written the content into the file
				for (i = 0; i <= length; i++) {
					fileWriter.write(arrayOfString[i] + " ");
				}

				fileWriter.write("\n");

			}

			fileWriter.close();
			System.out.println("write successfully");
		} else {
			System.out.println("Please Enter a Valid Sentence.");
		}

	}

	public static int factorial(int num) {
		System.out.println("The lenght of Number:" + num);

		int i = 1, factorial = 1;
		while (i <= num) {
			factorial *= i;
			i++;
		}
		System.out.println("The lenght of factorial Number:" + factorial);
		return factorial;
	}
}
