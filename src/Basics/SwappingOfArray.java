package Basics;

import java.util.Arrays;

public class SwappingOfArray {

	public static void main(String[] args)
	{


		int[] x= {10,20,30};
		int[] y= {11,21,31};
		
		for(int i=0;i<x.length;i++)
		{
			x[i]=x[i]-y[i];
			y[i]=x[i]+y[i];
			x[i]=y[i]-x[i];
			
		}
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		for(int i=0;i<x.length;i++)
		{
			
			System.out.print(x[i]+",");
			
		}
	}

}
