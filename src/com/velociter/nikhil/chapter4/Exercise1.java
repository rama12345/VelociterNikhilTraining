package com.velociter.nikhil.chapter4;

public class Exercise1 {

	public static void main(String[] args) {
		String months[]= {"januray","febuary","march","april","may","june","july","Agust","september","october","november","december"};
		double values[]=new double[12];
		for(int i=0;i<=11;i++)
		{
	    values[i]=(double)(100.0*Math.random()+1.0);
		}
		for(int i=0;i<=11;i++)
		{
			for(int j=i;j<=i;j++)
			{
				System.out.println("Months with Decimal vlaues:"+ months[i]+"  "+values[j]);
			}
		}
		System.out.println("Avarage of the values");
		double avarage=values[0]+values[1]+values[2]+values[3]+values[4]+values[5]+values[6]+values[7]+values[8]+values[9]+values[10]+values[11];
		avarage=avarage/12;
		System.out.println("Avarage is:"+avarage);

	}

}
