package com.velociter.nikhil.chapter4;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		   System.out.print("Please enter the size of the table: "); 
		   Scanner input = new Scanner(System.in);
		   
		     int  size = input.nextInt(); 
		    
		     // formatting in string length of the size    
		       int formatStringLength = Integer.toString(size*size).length(); 
		      
		       //convert formatting of size in string
		       int axesFormatStringLength = Integer.toString(size).length(); 
		    
		       //converting  format of space according to formatStringLength 
		       String formatString = String.format("%%%ds", formatStringLength); 
		    
		       String axesFormatString = String.format("%%%ds", axesFormatStringLength);
		       
		   
		           for (int i = 1; i <= size; i++) { 
		        	   //displaying i value with spaces
		               System.out.printf(formatString + " ", i); 
		    
		           } 
		  
		    
		           // Display table divider
		           for (int i = 1; i <= size-1; i++) { 
		    
		               System.out.print("----"); 
		    
		           } 
		    
		           System.out.println(); 
		    
		     
		           // Displaying Multiplication of table
		           for (int i = 1; i <= size; i++) { 
		         
		               for (int j = 1; j <= size; j++) { 
		            	    
		                   System.out.printf(formatString + " ", i * j); 
		    
		               } 
		 
		               System.out.println(); 
		    
		           } 
	}
}
		 


