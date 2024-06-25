package pck;
//import java.util.*;

public class reverseString {
	public static String reverse(String str)
	{
		String clone;
		int len=str.length();
		char [] ch1=str.toCharArray();
		char [] ch2=new char[len];
		for(int i=len-1,j=0;i>=0;i-- , j++)
		{
			ch2[j]=ch1[i];
			//System.out.println(ch2[j]);
		}
		clone = new String(ch2);
		System.out.println("clone is "+clone);
		return clone;
	}
	
	public static void main(String [] s)
	{
		System.out.println(reverse("samagg"));
	}

}
