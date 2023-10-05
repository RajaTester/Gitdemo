package Basics;

public class Palindrome1 {

	public static void main(String[] args)
	{
		String x="RaR";
		String rev="";
		for(int i=x.length()-1;i>=0;i--)
		{
			rev=rev+x.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(x))
		{
			System.out.println(x +"is a Palindrome");
		}
		else
		{
			System.out.println(x +"is a not Palindrome");
		}

		int r=1251;
		int p=r;
		int rev1=0;
		for(;r!=0;r=r/10)
		{
			int rem=r%10;
			rev1=rev1*10+rem;
			
		}
		System.out.println(rev1);
		if(p==rev1)
		{
			System.out.println(p +"  :is a Palindrome");
		}
		else
		{
			System.out.println(p +"  :is a not Palindrome");
		}
		
	}

}
