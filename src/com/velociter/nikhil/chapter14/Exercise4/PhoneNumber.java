package com.velociter.nikhil.chapter14.Exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Scanner;

class PhoneNumber implements Serializable {

	private static final long serialVersionUID = 1L;
	private String[] areacode = new String[20];
	private String[] number = new String[20];

	// constructor with parameter
	public PhoneNumber(String[] areacode, String[] number) {
		this.areacode = areacode;
		this.number = number;
	}

	public String toString() {
		return areacode + " " + number;
	}

	// Read a phone number from the keyboard
	public static PhoneNumber readNumber() {
		
		String[] area = new String[20]; // Stores the area code
		String[] localcode = new String[20]; // Stores the local code
		Scanner input = new Scanner(System.in);

		// get the area code and local code, number name from user.
		System.out.print("Enter area code: ");
		for (int i = 0; i < area.length; i++)
			area[i] = input.nextLine();
		System.out.print("Enter local code: ");
		for(int i=0;i< localcode.length;i++)
			localcode[i] = input.nextLine();
		System.out.print("Enter the number: ");
//		localcode=keyboard.readLine().trim();
		return new PhoneNumber(area, localcode);
	}

	// store user input to buffer.
	private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
}