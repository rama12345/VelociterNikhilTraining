package com.velociter.nikhil.chapter12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.Serializable;

class Person implements Serializable {
	String name;
	String address;

	// constructor of class
	Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
}

public class Exercise1 {
	public static void main(String args[]) throws IOException {
		// taking input from user
		Scanner scannerobj = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name = scannerobj.nextLine();
		System.out.println("Enter the Address:");
		String address = scannerobj.nextLine();

//create a file
		File fileObj = new File("MyFile.txt");
		ObjectOutputStream objectOut = null;
		try {
			objectOut = new ObjectOutputStream(new FileOutputStream(fileObj));
			objectOut.writeObject(new Person(name, address)); // passing the object of person class
		} catch (IOException e) {
			e.printStackTrace(System.err);
		}

		objectOut.close();
		System.out.println("Succesfully write in a File");

	}

}
