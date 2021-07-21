package com.velociter.nikhil.chapter2;

public class Exercise2 {
	public static void main(String args[]) {
		double doubleVariable = 1234.5678;//created a double type variable and assigning the double value
		short shortVariable = (short) doubleVariable;//doing a type cast into a short
		System.out.println(shortVariable);
		long longVariable = (long) (doubleVariable % 1.0 * 10000);// separated digit after decimal and printing in new line
		System.out.println(longVariable);

	}
}
