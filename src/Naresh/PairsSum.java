package Naresh;
/* find out element pairs whose sum is 10
 * 
 */
public class PairsSum {
	static void sum(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]+a[j])==10)
					System.out.println(" "+a[i]+" "+a[j]);
			}
		}
	}
	public static void main(String []s)
	{
		int a[]= {9,2,6,1,7,3,8,4,5};
		sum(a);
	}

}
