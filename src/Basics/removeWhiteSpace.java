package Basics;

import java.util.Scanner;

public class removeWhiteSpace {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the word");
		String word=sc.nextLine();
		word=word.replaceAll("\\s+", "");
		System.out.println(word);
	}

}
