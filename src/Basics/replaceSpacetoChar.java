package Basics;

import java.util.Scanner;

public class replaceSpacetoChar {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word");
		String word=sc.nextLine();
		char ch='_';
		word=word.replace(' ', ch);
		System.out.println(word);
		
		

	}

}
