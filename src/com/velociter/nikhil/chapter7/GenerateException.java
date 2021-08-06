package com.velociter.nikhil.chapter7;

public class GenerateException {
	public static void main(String args[]) {
		String name = null;
		// initialize array
		int[] array = { 1, 2, 3, 4 };
		try {
			if (name.equals("Java")) { // checking the name compression from equal method
				System.err.println("Welcome to Java");
			}

		} catch (NullPointerException e) {
			System.out.println("The Exception occuers" + e.getMessage());
			System.out.println("The contents of the stack trace are:\n");
			e.printStackTrace();
		}
		try {
			// initialize - size in array for occurs the exception
			int[] arr = new int[-10];

		} catch (NegativeArraySizeException e1) { // handle the exception

			System.out.println("The Eexception Occurs:" + e1.getMessage());
			System.out.println("The contents of the stack trace are:\n");
			e1.printStackTrace();
		}
		try {
			// printing the array values
			for (int i = 0; i <= array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e2) {
//System generate message printed by getMessage()
			System.out.println("The Exception occurs:" + e2.getMessage());
			System.out.println("The contents of the stack trace are:\n");
			e2.printStackTrace();
		}
	}
}