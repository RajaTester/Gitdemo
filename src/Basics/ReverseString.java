package Basics;

public class ReverseString {

	public static void main(String[] args) 
	{
		String x="Rajendra";
		String rev="";
		for(int i=x.length()-1;i>=0;i--)//decreasing the order
		{
			rev=rev+x.charAt(i);
		}
		System.out.println(rev);
		
	}

}
