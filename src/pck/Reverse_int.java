package pck;
import java.util.*;
import java.lang.String;

public class Reverse_int
{
	public static void number(long n)
	{
		int count=0;
		long newno=0, r=0,pow=10;
		//String num;
		for(long i=n;i>0 ;)
		{
			r=i%10;
			System.out.println("r is before  "+r);
			i/=10;
			System.out.println("i "+i);
			pow=1;
			for(int j=0;j<count;j++)
			{
				if(count==1)
					pow=10;
				else
				pow=pow*10;
			}
			System.out.println("pow count "+pow+"  "+count);
			/*if(count==1)
				r=10*r;*/
			if(count>=1)
				r=pow*r;
			System.out.println("r is after pow  "+r);
			System.out.println("new no before  "+newno);
			newno=r+newno;
			System.out.println("newno "+newno);
		
			if (count==2 ||count==4 || count==6 || count==8 || count==10)
			{
				String num=String.valueOf(newno);
				String comma="," + num;
				//num;
				System.out.println("with comma "+comma);
			}

			count++;
			
		}
		
	}
	public static void main(String []s)
	{
		 //boolean b =((1>5)?true:false);
		//System.out.println(b);
		number(123456);
	}
}