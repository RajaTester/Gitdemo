package Basics;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) 
	{


		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the munber");
		int num=sc.nextInt();
		int rem;
		int rev=0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		
		if(num==rev)
		{
			System.out.println(num+": is a pallendrom");
		}else
		{
			System.out.println(num+": is a not pallendrom");
		}
	}

}
