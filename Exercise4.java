package com.velociter.nikhil.chapter2;

public class Exercise4 {
	public static void main(String args[]) {
		double sunRad = 865000.0 / 2.0;
		double earthRad = 7600.0 / 2.0;
		double fourOverThree = 4.0 / 3.0;
		double sunVol = 0;
		double earthVol = 0;
		double ratioVol = 0;

		// Find the volumes of earth and sun:
		earthVol = fourOverThree * Math.PI * Math.pow(earthRad, 3);
		sunVol = fourOverThree * Math.PI * Math.pow(sunRad, 3);

		// Find the ratio of their volumes:
		ratioVol = sunVol / earthVol;

		System.out.println("Volume of the earth is " + earthVol + " cubic miles");
		System.out.println("Volume of the sun is " + sunVol + " cubic miles");
		System.out.println("The sun's volume is " + ratioVol + " times greater than the earth's.");
	}

}
