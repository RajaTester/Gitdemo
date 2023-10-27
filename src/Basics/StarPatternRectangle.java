package Basics;

public class StarPatternRectangle {

	public static void main(String[] args)
	{
		int row,col;
		int num=4;
		
		for(row=1;row<=num;row++)
		{
			for(col=1;col<=num;col++)
			{
				if(row>=2 && row<=3 && col>=2 && col<=3)
				{
					System.out.print(" ");
				}
				else 
				{
				System.out.print("*");
				}
			}
			System.out.println(" ");
		}

	}

}
