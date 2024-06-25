package pck;

public class DecimalToBinary 
{
	void convert(int n)
	{
		int i, r,b[]=new int[50];
		
		for( i=0;n>0;i++)
		{
			r=n%2;
			//System.out.println(r);
			b[i]=r;
			n/=2;
		}
		System.out.println("i is "+i+" n is "+n);
		n=i;
		System.out.println(" n is "+n);
		for(n=i-1;n>=0;n--)
		{
			System.out.print(b[n]);
			
		}
	}
	public static void main(String[] args)
	{
		DecimalToBinary b=new DecimalToBinary();
		b.convert(24);
	}
}
