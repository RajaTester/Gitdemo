package Basics;

import java.util.Arrays;

public class AccendingOrderArraywithDuplicate {

	public static void main(String[] args)
	{


		int[] x= {23,3,1,34,2,3,4,2,1,11,13,1,45,43,41,26,75};
		
		int temp=0;
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(x));
		
		int m,n,fre;
		
		for(m=0;m<x.length;m++)
		{
			fre=1;
			for(n=m+1;n<x.length;n++)
			{
				if(x[m]==x[n])
				{
					fre++;
				}
				else
				{
					break;
				}
			}
			m=n-1;
			if(fre>1)
			{
				System.out.println(x[m]+"->"+fre);
			}
		}
		
	}

}
