package pck;

public class Vowel {
	public static void checkVowel (String s)
	{
		if(s==null)
		{
			System.out.println("null");
			return;
		}
		char ch[]=s.toCharArray();
		int len=s.length(),c=0;
		for (int i=0; i<len;i++)
		{
			if(Character.toLowerCase(ch[i])=='a' ||Character.toLowerCase(ch[i])=='e'||
			Character.toLowerCase(ch[i])=='i'||Character.toLowerCase(ch[i])=='o'||
			Character.toLowerCase(ch[i])=='u')
				c++;
		}
		System.out.println("no of vowel "+c);
	}
	public static void main (String[] s)
	{
		checkVowel("AIPMNEOQA");
		
	}
		
}
