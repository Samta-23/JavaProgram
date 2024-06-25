package Naresh;
/* find out a intersection b
 * 
 */
public class CommomElement {

	static void common (int a[], int b [])
	{
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
	public static void main(String []s)
	{
		int a[]= {1,2,0,3,4,5,6};
		int b[]= {3,0,6,8,1,6,4};
		common(a,b);
	}
}
