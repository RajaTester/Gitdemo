package Basics;

public class StarPatternCross {

	public static void main(String[] args)
	{
		int row,col;
		int num=5;
		
//		for(row=1;row<=num;row++)
//		{
//			for(col=1;col<=num;col++)
//			{
//				if(row==col || row+col==6)
//				{
//				System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println("");
//		}
		for(row=0;row<num;row++)
		{
			for(col=0;col<num;col++)
			{
				if(row==col || row+col==4)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
