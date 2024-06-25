package pck;
import java.util.*;
import java.lang.String;

public class IndianSystemNumber
{
	public static void number(long n)
	{
		int count=0,len =(String.valueOf(n).length());
		long newno=0, r=0,pow=10;
		System.out.println("len  "+len);
		
		String num,comma="";
		for(long i=n;i>0 ;)
		{
			r=i%10;
			//System.out.println("r is before  "+r);
			i/=10;
			//System.out.println("i "+i);
			num=String.valueOf(r);
			comma=num+comma;
			System.out.println("with comma out of iif "+comma);
			if (count< len-1 && (count==2 ||count==4 || count==6 || count==8 || count==10))
			{
				comma="," + comma;
				//num;
				System.out.println("with comma inside if "+comma);
			}

			count++;
			
		}
		
	}
	public static void main(String []s)
	{
		 //boolean b =((1>5)?true:false);
		//System.out.println(b);
		number(123456789);
	}
}