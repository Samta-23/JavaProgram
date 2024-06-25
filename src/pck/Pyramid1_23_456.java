package pck;

import java.util.Scanner;

public class Pyramid1_23_456 {
	public static void display(int no)
	{
		int white=no,num=1;
		for(int j=white-1;j>1;j--)
		{
			System.out.print(" ");
		}
		for (int i=1;i<=no;i++)
		{
			for(int j=white;j>1;j--)
			{
				System.out.print(" ");
			}
			white--;
			for(int j=2;j<=i;j++)
				
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
			
		}
	}
	public static void main(String [] s)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rows  ");
		int row= sc.nextInt();
		sc.close();
		display(row);
	}

}
