package Basics;

import java.util.Scanner;

public class RemoveDuplicateFromString {

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word");
		String word=sc.nextLine();
		
		char[] ca=word.toCharArray();
		
		int count;
		for(int i=0;i<ca.length;i++)
		{
			count=1;
			for(int j=i+1;j<ca.length;j++)
			{
				if(ca[i]==ca[j] && ca[i]!='0')
				{
					count++;
					ca[j]='0';
				}
			}
			if(count==1 && ca[i]!='0')
			{
				System.out.println(ca[i]);
			}
		}

	}

}
