package Naresh;
/* reverse Array without  using duplicate array
 * 
 */
public class ReverseArray {
	static void revers (int a[])
	{
		int l=a.length;
		for(int i=0,j=l-1;i<=j;i++,j--)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			//System.out.print("a[i] "+a[i]+" a[j] "+a[j]);
		}
		System.out.println("after reverse");
		for(int i=0;i<l;i++)
			System.out.print(" "+a[i]);
	}
	public static void main(String s[])
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		revers(a);
	}

}
