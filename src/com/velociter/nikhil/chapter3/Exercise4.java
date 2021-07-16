package com.velociter.nikhil.chapter3;

public class Exercise4 {
	public static void main(String args[]) {
		char rndmSymbol = 0;
		int i = 0;
		while (i < 20) {
			rndmSymbol = (char) (26 * Math.random() + 'A');
			if (rndmSymbol == 'A' || rndmSymbol == 'E' || rndmSymbol == 'I' || rndmSymbol == 'O' || rndmSymbol == 'U') {
			} else
				System.out.println(rndmSymbol + " ");
			i++;
		}
	}
}
