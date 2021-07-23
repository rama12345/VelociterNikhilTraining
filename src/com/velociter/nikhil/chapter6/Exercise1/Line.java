package com.velociter.nikhil.chapter6;

public class Line extends Shape {
	public static String randomXYPointGenerate() {
		// For x and y, the maximum point is 1 and Minimum point is -1
		// maximum number
		int min = 0;
		// minimum number
		int max = 100;

		// generates x values
		double xValue = min + Math.random() * (max - min);
		// generates y values
		double yValue = min + Math.random() * (max - min);
		// returns and converts points to string
		return String.valueOf(xValue) + ", " + String.valueOf(yValue);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub

	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		System.out.println(randomXYPointGenerate());
	}

}
