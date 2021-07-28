package com.velociter.nikhil.chapter7;

class IteratedArithmeticException {
	// declared variable and assign the value
	int divisor = 0;
	int result = 0;
	int iteratedCount = 0;

	public void iteratedExceptionOccures() throws ArithmeticException {
		// doing the iteration
		for (int iteration = 0;; iteration++) {
			divisor = (int) (100 * Math.random());// generate the random diviser
			result = 1000 / divisor;
			iteratedCount++; // increment the iteration count
			System.out.println("Iteration count:" + iteratedCount);
		}
	}
}

public class HandleArithmeticException {
	public static void main(String args[]) {
		// object created
		IteratedArithmeticException iae = new IteratedArithmeticException();
		try {
			// method call
			iae.iteratedExceptionOccures();
		} catch (ArithmeticException exceptionObj) // handle the exception
		{
			System.out.println("ArithmeticException Exception Occures:" + exceptionObj.getMessage());
		}

	}

}
