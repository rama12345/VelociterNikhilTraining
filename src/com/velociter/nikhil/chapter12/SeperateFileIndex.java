package com.velociter.nikhil.chapter12;

import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;
import java.util.Scanner;

class Person3 implements java.io.Serializable {
	public int index;
	public String name;

	// constructor
	public Person3(int index, String name) {
		this.index = index;
		this.name = name;
	}

}

class SeperateFileIndex {
	public static void main(String[] args) {
		try {
			String filename = "file.txt"; // file name
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream outputStreamObj = new ObjectOutputStream(file); // creating a file

			System.out.println("Enter the input size for input :");
			Scanner scanner = new Scanner(System.in); // taking a input from user
			int inputSize = scanner.nextInt();
			String name[] = new String[inputSize];
			int index[] = new int[inputSize];
		
			for (int i = 0; i < inputSize; i++) {

				System.out.println("Enter the index");
				index[i] = scanner.nextInt();
				scanner.nextLine();

				System.out.println("Enter the Name:");
				name[i] = scanner.nextLine();
				Person3 personObject = new Person3(index[i], name[i]);// created a person class object
				// Method for serialization of object
				outputStreamObj.writeObject(personObject); // passing object of person class
				personObject = null;

			}
			file.close();
			outputStreamObj.close(); // closing the file
			System.out.println("Written SuccessFully");
			
		}catch (IOException exceptoinObj) {
			System.out.println("IOException is caught");
		}
	}
}

