package com.velociter.nikhil.chapter10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSeperation {
	public static void main(String args[]) {
		String dataStore;
		try {

			// Accept a string
			String string = "Hand/ling /n Java /" + " FileWriter / FileReader";
			char character;

			// attach a file to FileWriter
			FileWriter fileWriter = new FileWriter("file.txt");

			// read character wise from string and write
			// into FileWriter
			for (int i = 0; i < string.length(); i = i++) { // i variable is used for iteration 
				character = string.charAt(i);
				if (character == '/') {
					// do nothing

				} else {
					fileWriter.write(string.charAt(i));

				}
			}

			System.out.println("Writing successful");
			// close the file
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
