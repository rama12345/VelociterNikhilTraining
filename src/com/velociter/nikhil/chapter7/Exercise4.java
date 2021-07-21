package com.velociter.nikhil.chapter7;

class ArithmeticExceptionExample {
	int divisor = 0;
	int result = 0;
	int iteratedCount = 0;

	public void iteratedExceptionOccures() throws ArithmeticException {
		for (int iteration = 0;; iteration++) {
			divisor = (int) (100 * Math.random()); // generate a random number
			result = 1000 / divisor;
			iteratedCount++; // increment the iterated count
		}
	}
}

public class Exercise4 {
	public static void main(String args[]) {
		// creating an object
		ArithmeticExceptionExample iae = new ArithmeticExceptionExample();
		try {
			// method call
			iae.iteratedExceptionOccures();
		} catch (ArithmeticException e)// handle the exception
		{
			System.out.println("ArithmeticException Exception Occures:" + e.getMessage());
		} finally// in the any situation finally block will executed
		{
			System.out.println("Iteration count:" + iae.iteratedCount);
		}

	}

}
