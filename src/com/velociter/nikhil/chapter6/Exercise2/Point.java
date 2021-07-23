package com.velociter.nikhil.chapter6.Exercise2;

public class Point {
	private final double x;
	private final double y;

	// constructor of point
	public Point(double x, double y) {
		this.x = x;
		this.y = y;// x and y variable content the point value
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return ("(" + x + "," + y + ")");
	}
}
