package Basics;

import java.util.Scanner;

public class AddCharToString {

	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word");
		String word=sc.nextLine();
		
		char ch='r';
//		word=word+ch;
//		System.out.println(word);
		
		StringBuffer stb= new StringBuffer(word);
		stb.insert(1, ch);
		System.out.println(stb);

	}

}
