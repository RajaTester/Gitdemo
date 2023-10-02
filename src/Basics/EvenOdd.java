package Basics;

import java.io.InputStream;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		
		if(num%2==0 && num!=0)
		{
			System.out.println("This is an even:"+ num);
		}
		else
		{
			System.out.println("This is odd: "+num);
		}

	}

}
