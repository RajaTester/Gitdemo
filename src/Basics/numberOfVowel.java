package Basics;

import java.util.Scanner;

public class numberOfVowel {

	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word");
		String word=sc.nextLine();
		
		word=word.toLowerCase();
		int count=0;
		
		
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)=='a' ||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
			{
				count=count+1;
				System.out.print(word.charAt(i)+" ");
				
			}
		}
		System.out.println(" ");
		System.out.println(count);
		
	}

}
