package com.velociter.nikhil.chapter4;

public class StringOperation {
	public static void main(String args[]) {

		String textOfString = "Hardships often prepare ordinary people for an extraordinary destiny", words = "",
				arrayOfString[] = new String[20], tempCharacter, smallWords = "", largeWords = "";
		int i, j, lenghtOfString, numberOfWords = 0;//i and j for the iteration 
		char characterOfString;
		textOfString = textOfString + " ";
		lenghtOfString = textOfString.length();
		System.out.print("Before Asecnding Order Sentence is : " + textOfString);
		for (i = 0; i < lenghtOfString; i++) {
			characterOfString = textOfString.charAt(i); //breaks the string into the characters and iterated on the each characters one by one
			if (characterOfString != ' ') {
				words += characterOfString; //assign the each single characters in the  word variable  
			} else {
				arrayOfString[numberOfWords++] = words;
				words = "";
			}
		}
		smallWords = largeWords = arrayOfString[0];
		for (i = 0; i < numberOfWords; i++) {
			if (smallWords.length() > arrayOfString[i].length())
				smallWords = arrayOfString[i];
			if (largeWords.length() < arrayOfString[i].length())//compare the  length of the string and assign the string into the variable samllWords and largeWords
				largeWords = arrayOfString[i];
		}
		System.out.println("\nSmallest Word Of String : " + smallWords);
		System.out.println("Largest Word Of String : " + largeWords);

		for (i = 1; i < numberOfWords; i++) { // i and j for iteration
			for (j = 0; j < numberOfWords - i; j++) {
				if (arrayOfString[j].compareToIgnoreCase(arrayOfString[j + 1]) > 0) { //condition is true then..
					tempCharacter = arrayOfString[j];        //swapping of word           
					arrayOfString[j] = arrayOfString[j + 1]; 
					arrayOfString[j + 1] = tempCharacter;
				}
			}
		}

		System.out.print("The Resulting String After Asecnding Order : ");
		for (i = 0; i < numberOfWords; i++)
			System.out.print(arrayOfString[i] + " ");

	}

}
