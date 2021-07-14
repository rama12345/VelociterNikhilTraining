package com.velociter.nikhil.chapter2;

public class Exercise2 {
	public static void main(String args[]) {
		double d = 1234.5678;
		short s = (short) d;
		System.out.println(s);
		long l = (long) (d % 1.0 * 10000);
		System.out.println(l);

	}
}
