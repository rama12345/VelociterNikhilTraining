package com.velociter.nikhil.chapter9;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Example {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String string = sc.nextLine();
		String store = null;
		String first = null;
		String fileNameStore = null;

		StringTokenizer st = new StringTokenizer(string, ".");
		while (st.hasMoreTokens()) {
			first = st.nextToken();
			store = st.nextToken();
			break;
			// System.out.println(store=st.nextToken());
			// System.out.println("Token is:"+store);
		}
		System.out.println("first and store is:" + first + " " + store);
		for (int i = 1; i <=store.length(); i++)
			fileNameStore = first + "." + i;

		System.out.println("New Name is:"+fileNameStore);
	}
}
