package pck;
import java.util.*;
public class Pyramid9_898_78987 {
	public static void dis(int no)
	{
		int r=no,r1=no, white=2*no;
	
		for (int i=no;i>0;i--)
		{
			for(int j=(white);j>=0;j--)
				System.out.print(" ");
			white=white-2;
			for(int j=i;j<=no;j++)
			{
				System.out.print(" "+j);
				r=j;
			}
			
			for(int k=no-1;k>=i;k--)
			{
				
				System.out.print(" "+k);
				//r1--;
			}
			//}
			
				
			System.out.println();
		}
	}
	public static void main(String []s)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ");
		int r=sc.nextInt();
		dis(r);
		sc.close();
	}
}
