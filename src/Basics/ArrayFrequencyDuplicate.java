package Basics;

import java.util.Arrays;

public class ArrayFrequencyDuplicate {

	public static void main(String[] args) 
	{


		String[] arr= {"Raja","Raj","Rajendra","Raja","Raj","Raj"};
		Arrays.sort(arr);
		int i,j,fre;
		for(i=0;i<arr.length;i++)
		{
			fre=1;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					fre++;
				}
				else
				{
					break;
				}
			}
			i=j-1;
			if(fre>1)
			{
				System.out.println(arr[i]+": "+"Number of Frequency is:"+fre);
			}
		}
		
			

	}

}
