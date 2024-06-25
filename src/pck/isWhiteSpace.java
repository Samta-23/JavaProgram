package pck;
import java.util.*;
import java.lang.*;

public class isWhiteSpace {
	public static void removeWhiteSpace(String s)
	{
		if (s==null)
			
			System.out.println("invalid string");
		int l=s.length(),c=0;
		char []ch=s.toCharArray();
		StringBuilder ch2= new StringBuilder();
		for(char ch1 : ch)
		{
			//if((int)ch[i]!=32)
			String.valueOf(ch1);
			ch2=ch2.append(ch1);
			//else
				//c++;//i++;
				           
			
		}
		//String str= new String(ch2);
		System.out.println("after removing "+ch2);
	}
/*
	public static String removeWhiteSpaces(String input) {
		StringBuilder output = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		for (char c : charArray) {
			if(int ch[i]!=32)
				//output.append(String.valueOf(c));
		}
		
		return output.toString();
	}
	public static void main(String [] s)
	{
		removeWhiteSpaces("a m t a  a ");
	}
*/
}
