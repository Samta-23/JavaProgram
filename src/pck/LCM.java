package pck;
import java.util.*;

public class LCM 
{
	double lcm(int x, int y, int z)
	{
		int c=1;
		double f=0,g;
		if(x>y)
		{
			if(x>z)
				f=x;
			else
				f=z;
		}
		else
		{
			if(y>z)
				f=y;
			else
				f=z;
		}
		
		System.out.println("value of f  "+f);
		g=f;
		
		for(int i=1; c==1; i++)
		{
			f=g*i;
				if ((f%x==0) && (f%y==0)&&(f%z==0))
				{
					System.out.println("in if  value of f  "+f);
					
					c=0;
				}
				
		}
		
			return f;
					
	}
	public static void main(String[] args) 
	{
		LCM l= new LCM();
		int a,b,c;
		System.out.println("please enter 3 nos for finding LCM");
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Lcm is  "+l.lcm(a,b,c));
	}	
}
