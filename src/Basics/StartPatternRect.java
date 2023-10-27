package Basics;

public class StartPatternRect {

	public static void main(String[] args)
	{
		int row,col;
		int num=5;
		
		for(row=1;row<=num;row++)
		{
			for(col=1;col<=num;col++)
			{
				if((row==2 &&col==1) ||(row==3&&col==1) ||(row==4&&col==1)||(row==2&&col==3)||(row==2&&col==5)||
						(row==3&&col==2)||(row==3&&col==4)||(row==3&&col==5)||(row==4&&col==3)||(row==4&&col==5))
					
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
