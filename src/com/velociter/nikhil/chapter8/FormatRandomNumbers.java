package com.velociter.nikhil.chapter8;

import java.util.Random;

public class FormatRandomNumbers {

	public static void main(String[] args) {
		double minimumValue = -50.0, maximumValue = +50.0;
		Random theRandom = new Random();
		double theRandomValue = 0.0;

		for (int i = 1; i <= 20; i++) {
			// Checking for a valid range-
			if (Double.valueOf(maximumValue - minimumValue).isInfinite() == false)
				theRandomValue = minimumValue + (maximumValue - minimumValue) * theRandom.nextDouble();
			System.out.print(String.format("%.2f\n", theRandomValue));
		}
	}

}
