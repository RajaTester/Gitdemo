package Basics;

public class sumOfArray {

	public static void main(String[] args) 
	{
		int[] a= {0,333,10,23,43,1,2,45,53,231};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}
