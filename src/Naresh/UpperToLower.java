package Naresh;
/* change upper to lower case and without changing other character of String
 * ascii of A-Z 65-90 
 * a-z 97-122 
 * +32 covert upper to lower
 */
import java.lang.*;
public class UpperToLower {
	static String change(String s)
	{
		/*char ch[]=new char[20];
		for(int i=0; i<s.length();i++)
		{
			int ascii= (int)s.charAt(i);
			char c=s.charAt(i);
			if (ascii>=65 && ascii<=90)
			{
				ascii+=32;
				c=(char)ascii;
			}
			ch[i]=c;// count the length of array of ch and traverse till that lenght to avoid garbage value 
		}
		return String.valueOf(ch);*/
		
		// With StringBuilder class
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s.length();i++)
		{
			int ascii=(int) s.charAt(i);
			char c=s.charAt(i);
			if(ascii>=65 && ascii<=90)
				ascii+=32;
			c=(char)ascii;
			sb.append(c);
			
		}
		return sb.toString();
}
	public static void main(String []s)
	{
		
		System.out.println(change("A+B b-a&% D * G"));
	}

}
