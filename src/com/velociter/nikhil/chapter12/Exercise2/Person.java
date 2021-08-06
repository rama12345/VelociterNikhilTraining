package com.velociter.nikhil.chapter12.Exercise2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// implements the serializable to write an object to file.
public class Person implements Serializable {

 private static final long serialVersionUID = 1L;
	private String name;
	private String address;

	// create function to get the name and address from user.
	public void setDetails() {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		
		Scanner scannerObj=new Scanner(System.in);
		
		System.out.println("Enter the size for input:");
		int size=scannerObj.nextInt();
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Name:");
			String name=scannerObj.nextLine();
			list1.add(name);
			scannerObj.nextLine();
			System.out.println("Enter the Address:");
			String address=scannerObj.nextLine();
			list2.add(address);
		}

		// using addAll( ) method to concatenate the lists
		List<String> concatenated_list = new ArrayList<String>();
		concatenated_list.addAll(list1);
		concatenated_list.addAll(list2);
		System.out.println("Name : " + list1 + " Address : " + list2);
	}

	// display the name and address from user.
	public String showDetails() {
		return "Person Name is : " + name + "\n" + "Person Address is : " + address;
	}
}
