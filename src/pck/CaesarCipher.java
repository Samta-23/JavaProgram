package pck;
import java.util.*;

public class CaesarCipher {
	public static String encrypt(String s, int k)
	{
		char [] ch= s.toCharArray();
		StringBuilder str=new StringBuilder();
		while(k>26)
			k%=26;
		char coded;
		for(char c:ch)
		{
			System.out.println("c is  "+c);
			if ((c>='a'&& c<='z')||( c>='A'&& c<='Z'))
			{
				System.out.println("c+k "+(c+k));
				if (((c+k)>'z')&& ((c>='a')&&(c<='z')))
				{
					coded=(char)('a'+k-1-('z'-c));
					System.out.println("1 is "+coded);
				}
				else if(((c+k)>'Z')&&((c>='A')&&(c<='Z')))
				{
						coded=(char)('A'+k-1-('Z'-c));
						System.out.println("2  "+coded);
				}
				else
				{
					coded=(char)(c+k);
					System.out.println("3  "+coded);
				}
			}
			else
			{
				coded=c;
				System.out.println("4 "+coded);
			}
			str.append(coded);
		}
		return str.toString();
	}
	public  static void main(String []s)
	{
		String s1="159357lcfd";
		System.out.println("coded is 159357lcfd   "+encrypt(s1,98));
	}

}
