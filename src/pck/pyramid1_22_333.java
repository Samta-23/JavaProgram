package pck;

import java.util.Scanner;

public class pyramid1_22_333 {

	public static void dis(int row)
	{
		int white=row,num=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=white;j>0;j--)
			{
				System.out.print(" ");
			}
			white--;
			for(int k=0;k<i;k++)
				System.out.print(i+" ");
			System.out.println();
		}
		
	}
	public static void main(String [] s)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter rows ");
		int row=sc.nextInt();
		dis(row);
		sc.close();
		
		
	}
}
