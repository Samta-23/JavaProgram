package Naresh;
/* remove duplicate elements of Array without using duplicate Array
 * LOgic: override the elements from right till end of array 
 */
public class RemoveDuplicate {
	static void remove(int a[])
	{
		int l=a.length;
		for(int i=0;i<=l;i++)
		{
			for(int j=i+1;j<=l;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("in equal "+a[i]+" a[j] "+a[j]);
					for(int k=j;k<=l;k++)
					{
						System.out.println("in before shift "+a[k]);
						a[k]=a[k+1];
						l--;
						System.out.println("in shift "+a[k]);
					}
				}
			}
		}
		System.out.println("len "+l);
		System.out.println("after shifting");
		for(int i=0;i<=l+1;i++)
		{
			System.out.print(" " +a[i]);
		}
	}
	public static void main(String []s)
	{
		int  u[]= {1,3,2,4,2,1,4,0,3,1};
		remove(u);
	}

}
