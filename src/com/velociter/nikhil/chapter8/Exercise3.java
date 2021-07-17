package com.velociter.nikhil.chapter8;

import java.util.Random;

public class Exercise3 {

	public static void main(String[] args) {
		double minValue = -50.0, maxValue = +50.0;
		Random theRandom = new Random();
		double theRandomValue = 0.0;
		for (int i = 1; i <= 20; i++) {
			if (Double.valueOf(maxValue - minValue).isInfinite() == false)
				theRandomValue = minValue + (maxValue - minValue) * theRandom.nextDouble();
			System.out.printf(i+")"+"%.2f\n", theRandomValue);
		}
	}
}
