package com.velociter.nikhil.chapter6.Exercise1;

public class Circle extends Shape {
	double areaOfCircle, radius;

	// create constructor Of Circle
	public Circle(double areaOfCircle, double radius) {
		this.areaOfCircle = areaOfCircle;
		this.radius = radius;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		areaOfCircle = (22 / 7) * radius * radius; // calculating area of circle

	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
	}

	public String toString() {
		return "Circle [areaOfCircle=" + areaOfCircle + ", radius=" + radius + "]";
	}

	public void show() {
		// TODO Auto-generated method stub
		// showing the result area of circle
		System.out.println("Area Of Circle : " + areaOfCircle);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(15, 5);
		// calling the method
		circle.area();
		circle.show();
	}

}
