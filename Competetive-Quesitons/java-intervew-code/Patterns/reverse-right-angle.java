

import java.util.*;


class test{

	public static void main(String args[])

	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();

		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{

				System.out.print("* ");
			}

			System.out.println();

		}


	}


}
