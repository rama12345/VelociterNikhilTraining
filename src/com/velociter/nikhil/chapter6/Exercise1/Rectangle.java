package com.velociter.nikhil.chapter6.Exercise1;

public class Rectangle extends Shape {
	int weight, height, length;
	float areaOfRectangle, volumnOfRectangle;

	// constructor
	public Rectangle(int weight, int height, int length) {
		this.weight = weight;
		this.height = height;
		this.length = length;
	}

	@Override
	public void area() {
		areaOfRectangle = weight * height; // calculating the area of rectangle
	}

	@Override
	public void volume() {
		volumnOfRectangle = length * height * weight; // calculating the volume of rectangle
	}

	@Override
	public void show() { // printing the data
		System.out.println("Area Of Rectangle : " + areaOfRectangle);
		System.out.println("Volumn of Rectangle : " + volumnOfRectangle);
	}

	@Override
	public String toString() {
		return "Rectangle [weight=" + weight + ", height=" + height + ", length=" + length + ", areaOfRectangle="
				+ areaOfRectangle + ", volumnOfRectangle=" + volumnOfRectangle + "]";
	}

	public static void main(String[] args) {
		Rectangle rc = new Rectangle(5, 12, 6);// passing the value in constructor
		rc.area();
		rc.volume();// calling the method
		rc.show();
	}
}