package Basics;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) 
	{
		int[] x= {10,21,32,12,32};
		
		for(int i=x.length-1;i>=0;i--)
		{
			//System.out.println(x[i]);
			System.out.println(Arrays.toString(x));
		}

	}

}
