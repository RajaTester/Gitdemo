package Basics;

import java.util.Arrays;

public class changeIndexofArray {

	public static void main(String[] args) 
	{


		int[] x= {10,20,34,54,12};
		//OotPut:-{10,20,12,54,34};
		
		int ip=2;
		int fp=4;
		int temp=x[ip];
		x[ip]=x[fp];
		x[fp]=temp;
		System.out.println(Arrays.toString(x));

	}

}
