package Basics;

public class LargeNumberInArray {

	public static void main(String[] args) 
	{
		
		int[] a= {0,333,10,23,43,1,2,45,53,231};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
