package ImpProgram;

public class Prime {
static boolean p(int n)
{
	int c=0;
	if (n==1 || n==0)
		return false;
	else if (n==2) 
		return true;
	else
	{
		for(int i=2;i<n/2;i++)
		{
			if (n%i==0)
			{
				c=1;
				break;
			}
				
		}
	}
	if (c==0)
		return true;
	else
		return false;
	
}
public static void main(String []s)
{
	System.out.println("37 is prime "+p(77));
}
}
