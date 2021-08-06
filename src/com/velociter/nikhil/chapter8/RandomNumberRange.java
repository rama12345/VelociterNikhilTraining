package com.velociter.nikhil.chapter8;

import java.util.Random;

public class RandomNumberRange {

	public static void main(String[] args) {
		double minimumValue = -50.0, maximumValue = +50.0;
		// generate the random number
		Random theRandom = new Random();
		double theRandomValue = 0.0;

		for (int i = 1; i <= 20; i++) {
			// check the generate random number range -50 to 50
			if (Double.valueOf(maximumValue - minimumValue).isInfinite() == false)
				theRandomValue = minimumValue + (maximumValue - minimumValue) * theRandom.nextDouble();
			// %2f printing only two digit after decimal
			System.out.printf(i + ")" + "%.2f\n", theRandomValue);
		}
	}
}
