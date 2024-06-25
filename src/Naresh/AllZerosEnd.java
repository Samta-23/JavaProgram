package Naresh;
/* send all zeros at the end of array /
 * This logic can work only on max length/2zeros can be held by this as array 
 * 
 */

public class AllZerosEnd {
	static void zero(int a[])
	{
		int c=1, l=a.length;
		System.out.println(l/2);
		for(int i=0,j=l-1;i<=(l/2);)
		{
			if((a[i]!=0) && (c==1))i++; // if swapping is done then increase i value
			if (a[i]==0)
			{
				c=0;
				if(a[j]!=0 && j!= l/2) // if a[j]=0 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					System.out.println("i "+i+" j " +j);
					System.out.println("ai "+a[i]+" aj " +a[j]);
					j--;
					c=1;
					
				}
				else {
					j--;
				
				}
			}
			}
		
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
	}
	public static void main(String s[])
	{
		//int a[]= {3,4,0,2,0,1,0,0,5,7,0,9,0};
		int a[]= {3,4,2,1,0,5,7};
		zero(a);
	}
	
}
