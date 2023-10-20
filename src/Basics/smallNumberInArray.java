package Basics;

public class smallNumberInArray {

	public static void main(String[] args) 
	{
		int[] a= {234,345,10,333,10,23,43,-23,1,2,45,53,231};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);

	}

}
