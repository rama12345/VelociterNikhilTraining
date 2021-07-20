package com.velociter.nikhil.chapter8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise2 {

	public static void main(String[] args) {
		
		String string,word="",arrayOfString[] = new String[50];
		int i,l,nw=0;
		char ch;
		//taking a input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		string  = sc.nextLine();
		string = string + " ";
		//finding a string length from string function
		l = string.length();
		for(i=0;i<l;i++) {
			//fiding a one by one character from string using charAt() 
			ch = string.charAt(i);
			if(ch!=' ') {
				//adding a character in word 
				word = word+ch;
			}else{
				//assign the word on the arrayofString index
				arrayOfString[nw++] = word + ":" ;
				word="";
			}
		}
		for(i=0;i<nw;i++)
			System.out.print(arrayOfString[i]+"");
	}
}
