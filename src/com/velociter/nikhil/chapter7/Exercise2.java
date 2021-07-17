package com.velociter.nikhil.chapter7;

class IndexOutOfBoundsException 
{

public void divide()
{
	String[] arr = {"Rohit","Shikar","Virat","Dhoni"};
    
    for(int i=0;i<=arr.length;i++) {       
         System.out.println(arr[i]);                 
    } 
}
}

public class Exercise2 {
	public static void main(String args[])
	{
	IndexOutOfBoundsException object=new IndexOutOfBoundsException();
	try {
	object.divide();
	}catch(Exception e)
	{
		System.out.println("Exception is:"+ e.getMessage());
	}
	}
	
	}


