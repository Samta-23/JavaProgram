package ImpProgram;
import java.io.*;
public class FractionPosNEegZeroInARRAy {
	static void fraction (int [] arr)
	{
		int pos=0,neg=0,z=0, l=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
				pos++;
			else if(arr[i]<0)
				neg++;
			else
				z++;
		}
		int v=8;
		System.out.printf("%1.6f\n",(double)pos/l);//0.500000
		System.out.printf("%1.6f\n",(double)neg/l);//0.333333
		System.out.printf("%1.6f\n",(double)z/l);
		System.out.printf("%05d",v);//00008
	}
	public static void main(String []s)
	{
		int n[]={-3,3,-2,0,4,1};
		fraction(n);
	}

}
