package com.velociter.nikhil.chapter7;

class IndexOutOfBoundsException {

	public void divide() {
		String[] array = { "Rohit", "Shikar", "Virat", "Dhoni" };
//printing the arr vlaues     
		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

public class ExceptionHandle {
	public static void main(String args[]) {
		// creating an object of the base class
		IndexOutOfBoundsException object = new IndexOutOfBoundsException();
		try {
			object.divide(); // call the method
		} catch (Exception exceptionObj) // handle the exception
		{
			System.out.println("Exception is:" + exceptionObj.getMessage());
		}
	}

}
