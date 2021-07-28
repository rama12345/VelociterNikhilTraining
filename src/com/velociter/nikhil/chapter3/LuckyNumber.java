package com.velociter.nikhil.chapter3;

public class LuckyNumber {

	public static void main(String[] args) {

		int setCount = 5;
		int setSize = 6;
		int range = 49;
		int lucky;
		int luckyCount;

		for (int i = 0; i < setCount; ++i) {
			//initialize a variable and assigning by default value is 0
			int lucky1 = 0;
			int lucky2 = 0;
			int lucky3 = 0;
			int lucky4 = 0;
			int lucky5 = 0;
			int lucky6 = 0;

			luckyCount = 0;
			while (luckyCount < setSize) { //0<6  time loop will be iterated 
				lucky = (int) (range * Math.random()) + 1;
				switch (luckyCount) {
				case 0:
					lucky1 = lucky; //assigning the random generated lucky value to lucky1 
					luckyCount++; //and incremented by 1;
					break;
				case 1:
					if (lucky != lucky1) { //here is checking lucky is not equal to lucky1 then assign the value to lucky2
						lucky2 = lucky;
						luckyCount++;
					}
					break;
				case 2:                           //each time random value occurs and same process will continue upto 0 to 6   
					if (lucky != lucky1 && lucky != lucky2) {
						lucky3 = lucky;
						luckyCount++;
					}
					break;
				case 3:
					if (lucky != lucky1 && lucky != lucky2 && lucky != lucky3) {
						lucky4 = lucky;
						luckyCount++;
					}
					break;
				case 4:
					if (lucky != lucky1 && lucky != lucky2 && lucky != lucky3 && lucky != lucky4) {
						lucky5 = lucky;
						luckyCount++;
					}
					break;
					//the each lucky does not content same value every time their value will be unique 
				case 5:
					if (lucky != lucky1 && lucky != lucky2 && lucky != lucky3 && lucky != lucky4 && lucky != lucky5) {
						lucky6 = lucky;
						luckyCount++;
					}
					break;
				}
			}

			System.out.print("\nSet " + (i + 1) + ":");

			System.out.print(" " + lucky1 + " " + lucky2 + " " + lucky3 + " " + lucky4 + " " + lucky5 + " " + lucky6);
		}
	}
}