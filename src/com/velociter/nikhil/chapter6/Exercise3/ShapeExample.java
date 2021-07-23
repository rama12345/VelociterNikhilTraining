package com.velociter.nikhil.chapter6.Exercise3;

interface Shape {
	// abstract method
	void draw();

	double area();
}

class Rectangle implements Shape {
	int length, width;

	// constructor
	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public void draw() {
		System.out.println("Rectangle has been drawn ");
	}

	public double area() {
		return (double) (length * width);
	}
}

class Circle implements Shape {

	double pi = 3.14;
	int radius;

	// constructor
	Circle(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("Circle has been drawn ");
	}

	public double area() {
		return (double) ((pi * radius * radius) / 2);
	}
}

public class ShapeExample {
	public static void main(String[] args) {

		// creating the Object of Rectangle class
		// and using shape interface reference.
		Shape rectangle = new Rectangle(2, 3);
		System.out.println("Area of rectangle: " + rectangle.area());

		// creating the Objects of circle class
		Shape circle = new Circle(2);
		System.out.println("Area of circle: " + circle.area());

	}
}
