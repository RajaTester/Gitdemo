package Basics;

public class AverageofArray {

	public static void main(String[] args)
	{
		int[] x= {12,32,34,54,67,32};
		
		double sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		

		double avg=sum/x.length;
		System.out.println(avg);

	}

}
