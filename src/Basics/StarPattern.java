package Basics;

public class StarPattern {

	public static void main(String[] args)
	{
		int i,j;

		int size = 4;
		for (i = 0; i < size; i++) 
		{
		    for (j = 2 * (size - i); j >= 0; j--) 
		{
		        System.out.print(" ");
		    }
		    for (j = 0; j <= i; j++) 
		{
		        System.out.print("* ");
		    }
		    System.out.println();
		}   

	}

}
