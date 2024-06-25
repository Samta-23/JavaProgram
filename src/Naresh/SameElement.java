package Naresh;
/* take out same elements of 2 array using foreach loop 
 * out put 10,10
 * 20,20 etc
 */

public class SameElement {
	static void same(int a[],int b[])
	{
		//int la=a.length,lb=b.length;
		int []c= {-1,-1,-1,-1,-1,-1,-1,-1,-1};
		int l=0;
		int counter=0;
		
		for(int i:a)
		{
			counter=0;
			for(int j:b)
			{
				if(i==j)
				{
				  for(int k=0;k<c.length;k++)
				  {
					  counter=1;
					  if(c[k]==i)// to avoid multiple value of same element
					  {
						 counter=2; 
						 break;
					  }
				  }
				}
				
			}
			if (counter==1)
			{
				c[l]=i;
				l++;
			}
			
		}
		for (int i=0;i<l;i++)
			System.out.println(c[i]);
	}
	public static void main(String []s)
	{
		int a[]= {10,20,30,40,50};
		int b[]= {40,10,70,90,30,30,50,30};
		same(a,b);
	}

}
