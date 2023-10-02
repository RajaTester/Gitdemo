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
		

		int num=1234;
		int rev1=0;
		for(;num !=0;num=num/10)
		{
			int reminder=num%10;
			rev1=rev1*10+reminder;
		}
		System.out.println(rev1);
	}

}
