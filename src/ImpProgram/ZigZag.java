package ImpProgram;

import java.util.*;
/* zigzag array  4<5>3<6>8<9>1  
 means < is at odd place and > at even place
 */

public class ZigZag {
	static void  zigzag (int [] n )
	{
		int flag=0;int temp;
		for(int i=0;i<n.length-1;i++)
		{
			if(flag==0) // checking no at first 3rd and so on place
			{
				if (n[i]>n[i+1])// at odd palce > operator should come, if not , swap no
				{
					temp=n[i];
					n[i]=n[i+1];
					n[i+1]=temp;
				}
				flag=1;  // Change the condition for checking place in array
			}
			else // checking no at second 4rd and so on place
			{
				if (n[i]<n[i+1]) // at even palce > operator should come, if not , swap no
				{
					temp=n[i];
					n[i]=n[i+1];
					n[i+1]=temp;
				}
				flag=0;
			}
				
		}
		System.out.println("Zigzag array ");
		for(int i=0;i<7;i++ )
		{
		System.out.print(n[i]);
		}
	}
	public static void main(String []s)
	{
		Scanner sc=new Scanner(System.in);
		int n[]= new int[7];
		for(int i=0;i<7;i++ )
		{
			n[i]=sc.nextInt();
		}
		for(int i=0;i<7;i++ )
		{
		System.out.print(n[i]);
		}
		zigzag(n);
		
	}

}
