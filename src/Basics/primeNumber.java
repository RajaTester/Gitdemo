package Basics;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		boolean n=false;
		
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				n=true;
				break;
			}
		}
		if(!n)
		{
			System.out.println("The prime number is"+ num);
		}
		else
		{
			System.err.println("This is not a prime number"+ num);
		}
	}

}
