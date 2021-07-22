package com.velociter.nikhil.chapter10;

import java.io.FileWriter;
import java.io.IOException;

public class Exercise4 {
	public static void main(String args[]) throws IOException {
		String string = "the fact cat ", word = "";
		String arrayOfString[] = new String[14];
		char character = ' ';
		int i, numberOfWords = 0; // i variable for iteration

		for (i = 0; i < string.length(); i++) { // the logic here converts the string into the words
			// finding a one by one character from string using charAt()
			character = string.charAt(i);
			if (character != ' ') {
				// adding a character in word
				word = word + character;

			} else {

				arrayOfString[numberOfWords] = word; // words copy in the arrayOfString
				numberOfWords++;
				word = "";

			}
		}
		int length = 2;
		for (int e = 0; e <= length - 1; e++) { // e variable for the iteration
			if (e <= e + 1) {
				String storeString = arrayOfString[e];
				arrayOfString[e] = arrayOfString[e + 1];
				arrayOfString[e + 1] = storeString;
			}
		}
		// create a file
		FileWriter fileWriter = new FileWriter("Arrayindex.txt");
		for (i = 0; i <= length; i++) {
			fileWriter.write(arrayOfString[i] + " "); // written the content into the file
		}
		fileWriter.close();
		System.out.println("write successfully");

	}
}
