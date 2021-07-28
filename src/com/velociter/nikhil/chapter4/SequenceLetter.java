package com.velociter.nikhil.chapter4;

public class SequenceLetter {
	public static void main(String args[]) {
		String string = "To be or not to be.";
		String reversetext = "";
		char character = ' ';

		int substring = 0;
		int i = 0, j = 0, index = 0; // i and j for the iteration

		System.out.println("Text before reversing    :    " + string);

		for (i = 0; i < string.length();) {

			index = string.indexOf(character, substring); // find the index until space not come

			for (j = index - 1; j >= substring; j--) // here substring=0;
			{
				reversetext += string.charAt(j); // one word is reversed

			}

			if (index != -1) {
				substring = index + 1;
				i = substring; // increment the i value by the index

				reversetext += " ";

			} else
				break;

		}

		for (int n = string.length() - 2; n >= substring; n--) // reverse the string
			reversetext += string.charAt(n);

		System.out.println("\nText after reversing    :    " + reversetext + ".");

	}
}
