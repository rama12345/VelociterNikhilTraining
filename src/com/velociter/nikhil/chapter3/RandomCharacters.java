package com.velociter.nikhil.chapter3;

public class RandomCharacters {
	public static void main(String args[]) {
		char randomSymbol = 0;
		int i = 0; //initialize a variable for iteration
		while (i < 20) {
			randomSymbol = (char) (26 * Math.random() + 'A'); //generated random characters A to z
			if (randomSymbol == 'A' || randomSymbol == 'E' || randomSymbol == 'I' || randomSymbol == 'O' || randomSymbol == 'U') {
			} else  //won't content the consonant  
				System.out.println(randomSymbol + " ");
			i++;
		}
	}
}
