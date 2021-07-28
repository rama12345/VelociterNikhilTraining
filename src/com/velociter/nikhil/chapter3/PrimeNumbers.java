package com.velociter.nikhil.chapter3;

public class PrimeNumbers {
	public static void main(String args[])
	{
		//generated a random number range 1 to 100
		int number= (int)(100*Math.random()+1);
	 	System.out.println("random no is:"+number);
		if(number%2!=0) //check the number is prime or not
		{
			number=(int) Math.sqrt(number); //find out the square root of the prime number
			System.out.println("Prime no.square root is" +number);
		}
		else
		{
			System.out.println(" its Not not prime No.square root" +number);
		}
	}

}
