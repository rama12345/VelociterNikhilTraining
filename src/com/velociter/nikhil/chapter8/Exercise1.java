package com.velociter.nikhil.chapter8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {

	public static void main(String[] args) {
		
		String textOfString;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		textOfString = input.nextLine();
		StringTokenizer stringTokens = new StringTokenizer(textOfString,",");  
	     while (stringTokens.hasMoreTokens()) {  
	         System.out.println(stringTokens.nextToken());  
	     }  
	}

}
