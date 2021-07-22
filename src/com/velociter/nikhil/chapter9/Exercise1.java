package com.velociter.nikhil.chapter9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exercise1 {
	public static void main(String[] args) {
		// finding a args length and doing file ends with extention
		if (null != args[0] && args[0].length() > 5 && args[0].endsWith(".txt")) {
			File textFile = new File(args[0]);
			// variable declared
			FileOutputStream outputFile = null;
			// cheking file exist or not
			if (textFile.isFile()) {
				System.out.println("file.txt already exists.");
			} else {
				try {
					// creating a file
					outputFile = new FileOutputStream(textFile);
					System.out.println("file.txt output stream created");
				} catch (FileNotFoundException e) {
					e.printStackTrace(System.err);
				}
			}
		}
	}
}
