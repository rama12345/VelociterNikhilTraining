package com.velociter.nikhil.chapter3;

public class Exercise1 {
	public static void main(String args[]) {
		int myChoice = 0;
     //here generated a random choice by using random method
		myChoice = (int) (6.0 * Math.random());
		switch (myChoice) {
		case 0:
			System.out.println("Breakfast choice is scrambled eggs");
			break;
		case 1:
			System.out.println("Breakfast choice is waffles");
			break;
		case 2:
			System.out.println("Breakfast choice is fruit");
			break;
		case 3:
			System.out.println("Breakfast choice is cereal");
			break;
		case 4:
			System.out.println("Breakfast choice is toast");
			break;
		case 5:
			System.out.println("Breakfast choice is yogurt");
			break;
		}
	}
}
