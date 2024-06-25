package ImpProgram;
/* change string into ch[] and save it into StingBuilder 
 * 
 */
import java.util.*;
public class RemoveSpaceFromString {

	static String remove(String s)
	{
		int l=s.length();
		char ch[]=s.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<l;i++)
		{
			if(ch[i]!=' ')
				sb.append(ch[i]);
		}
		return sb.toString();
		
	}
	public static void main(String []s)
	{
		System.out.println(remove("sam r a g g "));
	}
}
