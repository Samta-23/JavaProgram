package ImpProgram;

/* if String is samta Change string is resers atmas"
 * 
 */
import java.util.*;
public class reverseString {
	static String back(String  s)
	{
		StringBuilder sb= new StringBuilder();
		char ch[]=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			sb.append(ch[i]);
		}
		//System.out.println(sb);
		return sb.toString();
		
	}
	public static void main(String []s)
	{
		System.out.println("reverse is "+back("samagg"));
	}

}
