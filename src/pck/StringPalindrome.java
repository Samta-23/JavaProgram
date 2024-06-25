package pck;
import java.util.*;

public class StringPalindrome 
{
	boolean check(String s)
	{
		String str="";
		int l= s.length();
		for (int i=l-1;i>=0;i--)
		{
			str=str+s.charAt(i);
		//	System.out.println(str);
		}
		if(s.equals(str))
			return true;
		else
			return false;
	}
	boolean checkArray(String s)
	{
		char []ch=s.toCharArray();
		String str="";
		for (int i=s.length()-1;i>=0;i--)
		{
			//			System.out.println("char in array "+ch[i]);
			str+=ch[i];
		}
		
		if(s.equals(str))
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string to check ");
		String s=sc.nextLine();
		StringPalindrome p=new StringPalindrome();
		System.out.println("Entered string is plaindrome "+p.checkArray(s));
		//System.out.println("Entered string is plaindrome "+p.check(s));
		
	}

}
