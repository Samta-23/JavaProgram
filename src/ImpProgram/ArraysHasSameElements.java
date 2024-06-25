package ImpProgram;
/* sort the array then check its elements
 * 
 */
import java.util.*;
public class ArraysHasSameElements {
	static boolean check(int [] n1, int [] n2)
	{
		//Arrays.sort(n1);n1->n3
		//Arrays.sort(n2); n2-> n4
		int l1=n1.length, l2=n2.length;
		int n3[]= new int[l1], n4[]=new int[l2];
		for(int i=0;i<n1.length;i++)
		{
			for(int j=0;j<n1.length;j++)
			{
				if(n1[i]>n1[j])
				{
					/*temp=n1[j]; 
					n1[j]=n1[i];
					n1[i]=temp;*/
					n3[i]=n1[i];
				}
				else if(n[i]==n[j])
				{
				 i++,j++
				}
					
		}
		}
		for(int i=0;i<n2.length;i++)
		{
			for(int j=0;j<n2.length;j++)
			{
				if(n2[i]>n2[j])
				{
					temp=n2[j];
					n2[j]=n2[i];
					n2[i]=temp;
				}
		}
		}

		//for(int i=0;i<n1.length;i++)
		{ System.out.println("sort4d  "+n1[i]);}
	
		for (int i=0;i<n1.length;i++)
		{
		//	System.out.println("second largest"+n1[1]);
			for(int j=0;j<n2.length;j++)
			{
				if(n[i]!=n2[j])
					break;
			}
		return true;
	}
	public static void main(String[]s)
	{
		int n1[]={5,3,6,1,0,8};
		int n2[]={5,3,6,1,1,8};
		check(n1,n2);
	}

}
