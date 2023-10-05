package Basics;

import java.util.Arrays;

public class DescendingArray {

	public static void main(String[] args)
	{
		int [] x= {12,32,12,34,4,32,56};
		
		int temp=0;
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]<x[j])
				{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					
				}
			}
		}
		//System.out.println(Arrays.toString(x));
		for(int l=0;l<x.length;l++)
		{
			System.out.println(x[l]);
		}

	}

}
