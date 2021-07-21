package com.velociter.nikhil.chapter10;

public class Exercise4 {
	public static void main(String args[]) {
		String string = "the fact cat ", word = "", string1, string2, string3;
		String arrayOfString[] = new String[15];
		char character = ' ';
		int i, numberOfWords = 0; // i variable for iteration

		for (i = 0; i < string.length(); i++) {
			// fiding a one by one character from string using charAt()
			character = string.charAt(i);
			if (character != ' ') {
				// adding a character in word
				word = word + character;

			} else {

				arrayOfString[numberOfWords] = word;
				System.out.println("no.of word is:" + numberOfWords); // words copy in the arrayOfString
				numberOfWords++;
				word = "";

			}
		}
		string1 = arrayOfString[0]; // arrayOfString data pass in the String
		string2 = arrayOfString[1];
		string3 = arrayOfString[2];
		// System.out.println("The string is:"+str1+str2+str3);
		if (string1.charAt(0) < string2.charAt(0)) {
			for (i = 0; i < arrayOfString.length; i++)
				System.out.println(arrayOfString[i]);
		}
		for (int e = 0; e < arrayOfString.length; e++) {
			for (int f = e + 1; f <= arrayOfString.length; f++) {
				if (arrayOfString[e].charAt(0) < arrayOfString[f].charAt(0)) {
					String store = arrayOfString[e];
					arrayOfString[e] = arrayOfString[f];
					arrayOfString[f] = store;
				}
				System.out.println("Array Of String is:" + arrayOfString[f]);
				if (string1.charAt(0) < string2.charAt(0)) {
					String store = arrayOfString[i];
				}
			}
		}
	}
}
