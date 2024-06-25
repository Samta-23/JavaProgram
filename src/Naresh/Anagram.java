package Naresh;
/* Anagrams are those Strings which are having same character ignoring case, order
 * and puntuation marks annd frequency of letter
 * ascii A-Z= 65-90
 * a-z=97-122
 */

public class Anagram {
	static void check(String s1, String s2)
	{
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		for( int i=0;i<s1.length();i++)// change in lower case
		{
			int ascii= (int)s1.charAt(i);
			char c= s1.charAt(i);
			if(ascii>=65 && ascii<=90)
				ascii+=32;
			if(ascii>=97 && ascii<=122)// add only char in uppper case ignoring others 
			{
				c= (char)ascii;
				sb1.append(c);
			}
			
		}
		System.out.println(sb1.toString());
		for( int i=0;i<s2.length();i++)// change in lower case
		{
			int ascii= (int)s2.charAt(i);
			char c= s2.charAt(i);
			if(ascii>=65 && ascii<=90)
				ascii+=32;
			if(ascii>=97 && ascii<=122)
			{
				c= (char)ascii;
				sb2.append(c);
			}
			
		}
		System.out.println(sb2.toString());
		s1=sb1.toString();
		s2=sb2.toString(); int cc=0;
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		//s1=new String(ch1);
		
		
		// Sorting of array
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=i+1;j<ch1.length;j++)
			{
			//	System.out.println("ch[j] "+ch1[j]);
				int a1=(int)ch1[i];
				int a2=(int) ch1[j];
				if(a1>a2)
				{
					char temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
				//	System.out.println("after swap ch[i] "+ch1[i]);
					//System.out.println("ch[j] "+ch1[j]);
				}
			}
		}
		for(int i=0;i<ch2.length;i++)
		{
			for(int j=i+1;j<ch2.length;j++)
			{
			//	System.out.println("ch[j] "+ch1[j]);
				int a1=(int)ch2[i];
				int a2=(int) ch2[j];
				if(a1>a2)
				{
					char temp=ch2[i];
					ch2[i]=ch2[j];
					ch2[j]=temp;
				//	System.out.println("after swap ch[i] "+ch1[i]);
					//System.out.println("ch[j] "+ch1[j]);
				}
			}
		}
		System.out.println("sorted "+new String(ch1));
		System.out.println("sorted "+new String(ch2));
		// 9=remove duplicacy 
		int l=ch1.length;
		sb1.setLength(0);
		for(int i=0;i<l-1;i++) // ssamtt
		{
			while((ch1[i]==ch1[i+1])&& ((i+1)!=(l-1)))
			{
					i++;
						System.out.println("while ");
			}
			//else
			System.out.println("ch["+i+" ] "+ch1[i]);
			sb1.append(ch1[i]);
			if((i+1)==(l-1))
			{
				char p=sb1.charAt((sb1.length()-1));
				if(p!=ch1[l-1])
						sb1.append(ch1[l-1]);
			}
		}
		System.out.println("remove "+sb1.toString());
		
		
		if(cc==0)
		System.out.println("not");
		else
			System.out.println("yes");
		
	}
	public static void main (String []s)
	{
		check("sMm M%taTa", "A t M&S s");
	}

}
