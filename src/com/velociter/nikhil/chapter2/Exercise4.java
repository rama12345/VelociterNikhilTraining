package com.velociter.nikhil.chapter2;

public class Exercise4 {
	public static void main(String args[]) {
		double sunRad = 865000.0 / 2.0;
		double earthRad = 7600.0 / 2.0;
		double fourOverThree = 4.0 / 3.0;
		double sunVolume = 0;
		double earthVolume = 0;
		double ratioVolume = 0;

		// Find the volumes of earth and sun:
		earthVolume = fourOverThree * Math.PI * Math.pow(earthRad, 3);//PI is a radius
		sunVolume = fourOverThree * Math.PI * Math.pow(sunRad, 3);

		// Find the ratio of their volumes:
		ratioVolume = sunVolume / earthVolume;
		
//   after the calculating printing a variable data
		System.out.println("Volume of the earth is " + earthVolume + " cubic miles");
		System.out.println("Volume of the sun is " + sunVolume + " cubic miles");
		System.out.println("The sun's volume is " + ratioVolume + " times greater than the earth's.");
	}

}
