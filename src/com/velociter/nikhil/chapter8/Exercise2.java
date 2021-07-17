package com.velociter.nikhil.chapter8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise2 {

	public static void main(String[] args) {
		
		String string,word="",arraOfString[] = new String[50];
		int i,l,nw=0;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence : ");
		string  = sc.nextLine();
		string = string + " ";
		l = string.length();
		for(i=0;i<l;i++) {
			ch = string.charAt(i);
			if(ch!=' ') {
				word = word+ch;
			}else{
				arraOfString[nw++] = word + ":" ;
				word="";
			}
		}
		for(i=0;i<nw;i++)
			System.out.print(arraOfString[i]+"");
	}
}
