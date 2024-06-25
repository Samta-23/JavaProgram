package pck;
import java.util.*;
public class outpattern 
{
	static void pattern(int p)
	{
		int count=0;
		for(int i=0;i<p+1;i++)
		{
			count=0;
			System.out.println();
			System.out.print(count+" ");
			count++;
			for(int j=0;j!=i && i!=0;++j)
			{
				if(i==1 && count==1)
				System.out.print(" "+i*count+" ");
				else
					System.out.print(" "+i*count+" ");
				count++;
								
			}
		}
		for (int i=0;i<=p;i++)
		{
			System.out.println();
			count--;
			for(int j=0;j<count;j++)
			{
				System.out.print(" *  ");
				//p--;
				
				
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System .in);
		System.out.println("enter no");
		int p= sc.nextInt();
		pattern(p);
		
	}
}
