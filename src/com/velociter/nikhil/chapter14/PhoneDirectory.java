package com.velociter.nikhil.chapter14;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectory {

	public static void main(String[] args) {
		
		// creating HashMap object of type <String, String>
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("Enter the size for input:");
		int size=scannerObj.nextInt();
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the key(123..):");
			int key=scannerObj.nextInt();
			
			scannerObj.nextLine();
			System.out.println("Enter the Name:");
			String name=scannerObj.nextLine();
			
			hashMap.put(key,name);
		}	
	
		// get the key from user.
		System.out.println("Enter the KeyNumber for search : ");
		int keyNumber =scannerObj.nextInt();
		
		// check the condition it will be contain entered key.
		if (hashMap.containsKey(keyNumber)) {
			// store key to Object of value
			String  value = hashMap.get(keyNumber);
			System.out.println("Key : " + keyNumber + "\t" + "Value : " + value);
		} 
		else {
			System.out.println("Not Founded Any Pair With Key!!!!");
		}
	}

}