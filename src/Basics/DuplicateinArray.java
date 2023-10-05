package Basics;

public class DuplicateinArray {

	public static void main(String[] args) 
	{


		//int
		int [] x= {12,32,12,34,4,32,56};
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
					System.out.println(x[i]);
				}
			}
		}
		
		//String
		

		String [] y= {"Raj","Raz","Priyanka","Raj"};
		
		for(int i=0;i<y.length;i++)
		{
			for(int j=i+1;j<y.length;j++)
			{
				if(y[i]==y[j])
				{
					System.out.println(y[i]);
				}
			}
		}

	}

}
