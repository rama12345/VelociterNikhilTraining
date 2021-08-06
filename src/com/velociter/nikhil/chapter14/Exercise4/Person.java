package com.velociter.nikhil.chapter14.Exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Scanner;

public class Person implements Comparable<Person>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] firstName = new String[20];
	private String[] surname = new String[20];

	// constructor with parameter
	public Person(String[] firstName, String[] surname) {
		this.firstName = firstName;
		this.surname = surname;
	}

	// Read a person from the keyboard
	public static Person readPerson() {
		String[] firstName = new String[20];
		String[] surname = new String[20];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name : ");
		for (int i = 0; i < firstName.length; i++)
			firstName[i] = input.nextLine();
		System.out.println("Enter surname : ");
		for (int i = 0; i < surname.length; i++)
			surname[i] = input.nextLine();
		return new Person(firstName, surname);
	}

	// Compare Person objects
	public int compareTo(Person person) {
		int result = surname.length;
		return result == 0 ? firstName.length : result;
	}

	public String toString() {
		return firstName + " " + surname;
	}

	// store user input to buffer.
	private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
}