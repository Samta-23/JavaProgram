package Naresh;

/* Leader element: if element is  greater than the element its right side is called
 * Leader elements
 * int a[]={12,2,9,4,3,5,8,1} leader elements are 12,9,8
 * 
 */
public class LeaderElement {
	static void leader(int a[])
	{
		int l=a.length;
		for(int i=0;i<l-1;i++)
		{
			if(a[i]>a[i+1])
				System.out.print(" " +a[i]);
		}
		
	}
	public static void main(String []s)
	{
		int a[]= {12,2,9,4,3,5,8,1	};
		leader(a);
	}

}
