package com.velociter.nikhil.chapter4;

public class Exercise5 {
	public static void main(String args[])
	{
        String str = "To be or not to be.";
        String reversetext="" ;
        char ch = ' ';
       
        int substr = 0;
        int i=0, j=0, index=0;
       
        System.out.println("Text before reversing    :    " + str);
       
          for(i=0; i<str.length(); )
        {
       
            index = str.indexOf(ch,substr);
           
            for(j=index-1; j>=substr; j--)
            {
                reversetext += str.charAt(j);
                               
            }
           
            if(index != -1)
            {   
                substr = index+1;
                i= substr;
                reversetext += " ";
            }
            else
                break;           
               
        }
   
        for(int n=str.length()-2; n>=substr; n--)
            reversetext += str.charAt(n);
            
        System.out.println("\nText after reversing    :    "+reversetext +".");
           

	}
	}

