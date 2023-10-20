package Basics;

import java.util.Scanner;

public class DuplicateinString {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word");
		String word=sc.nextLine();
		System.out.println("Reverse Word is :");
		char[] ch=word.toCharArray();
		for(int i=0;i<word.length();i++)
		{
			for(int j=i+1;j<word.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
				}
			}
		}
	}

}
