package Basics;

public class Factorial {

	public static void main(String[] args)
	{
		int i;
		int factorial=1;
		int number=3;
		for(i=1;i<=number;i++)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}

}
