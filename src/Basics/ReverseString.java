package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Word");
		String st=sc.nextLine();
		
		String rev="";
		for(int i=st.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		System.out.println(rev);
		
//		char[] ch=st.toCharArray();
//		for(int i=ch.length-1;i>=0;i--)
//		{
//			System.out.print(ch[i]);
//		}
		if(st.equals(rev))
		{
			System.out.println("True");
		}
	}
	

}
