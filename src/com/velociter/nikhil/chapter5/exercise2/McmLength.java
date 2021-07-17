package com.velociter.nikhil.chapter5.exercise2;

public class McmLength {
	  public static final int CM_PER_M = 100;
	  public static final int MM_PER_CM = 10;
	  public static final int MM_PER_M = MM_PER_CM*CM_PER_M;
	 
	  private int meters = 0;
	  private int centimeters = 0;
	  private int millimeters = 0;
	 
	  public McmLength(double cm) {
	    this((int)Math.round(cm*MM_PER_CM));
	  }
	 
	  public McmLength(int mm) {
	    meters = mm/MM_PER_M;
	    centimeters = (mm - meters*MM_PER_M)/MM_PER_CM;
	    millimeters = mm - meters*MM_PER_M - centimeters*MM_PER_CM;
	  }
	  
	  public McmLength(int m, int cm, int mm) {
	    this(m*MM_PER_M + cm*MM_PER_CM + mm);
	  }
	 
	  public McmLength(){}
	 
	  public String toString() {
	    return Integer.toString(meters) + "m " + centimeters + "cm " + millimeters + "mm";
	  }
	 
	  public int toMM() {
	    return meters*MM_PER_M + centimeters*MM_PER_CM + millimeters;
	  }
	 
	 
	  public double toMeters() {
	    return meters + ((double)(centimeters))/CM_PER_M + ((double)(millimeters))/MM_PER_M;
	  }
	 
	  public McmLength add(McmLength length)
	  {
	    return new McmLength(toMM()+length.toMM());
	  }
	 
	  public McmLength subtract(McmLength length)
	  {
	    return new McmLength(toMM()-length.toMM());
	  }
	 
	  public McmLength multiply(int n)
	  {
	    return new McmLength(n*toMM());
	  }
	 
	  public McmLength divide(int y)
	  {
	    return new McmLength(toMM()/y);
	  }
	 
	  public long area(McmLength length) {
	    return (toMM()*length.toMM());
	  }
	 
	  public int compare(McmLength length) {
	    return greaterThan(length) ? 1 : (equals(length) ? 0 : -1);
	  }
	 
	  public boolean equals(McmLength length) {
	   return toMM() == length.toMM();
	  }
	 
	  public boolean lessThan(McmLength length) {
	   return toMM() < length.toMM();
	  }
	 
	  public boolean greaterThan(McmLength length) {
	   return toMM() > length.toMM();
	  }

}
