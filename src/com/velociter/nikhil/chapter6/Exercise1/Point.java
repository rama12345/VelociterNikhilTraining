package com.velociter.nikhil.chapter6.Exercise1;

public class Point {
	private final double x;
	private final double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
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

