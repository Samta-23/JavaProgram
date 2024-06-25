package pck;
import java.util.*;
public class anagramString  // eat is anagram to tae or ate  
{
	String sort(char[]ch)
	{
		int c1,c2,n=0;char temp;
		//System.out.println("length of char array "+ch.length);
		for(int i=0;i<=ch.length-1;i++) //ascii of lower case 97-122
		{
			c1=ch[i];
			//System.out.println("aScii of ch [i] "+c1);

			for(int j=0;j<=ch.length-1;j++)
			 {
				c2=ch[j];
				//System.out.println("aScii of ch [j] "+c2);
				if(c1>c2)//eat
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			//System.out.print(ch[i]);

		}
		//System.out.println();
		//for(int i=0;i<=ch.length-1;i++) //ascii of lower case 97-122
		
			//System.out.println("sotted char "+ch[i]);

		String s=new String(ch);
		//System.out.println("after for insort "+s);
		return s;
		
			
	}
	boolean checkAnagram(String s1,String s2)
	{
		 s1=s1.replaceAll("\\s","");
		 s2=s2.replaceAll("\\s","");
		 if(s1.equalsIgnoreCase(s2))
			 return true;
		s1=s1.toLowerCase();
		//System.out.println("S1 is in main "+s1);
		//System.out.println("S2 is in main "+s2);
		 s2=s2.toLowerCase();
		 char[] ch1=s1.toCharArray();
		 char[] ch2=s2.toCharArray();
		 s1=sort(ch1);
		 s2=sort(ch2);
		 if (s1.equals(s2))
			 return true;
		 else
			 return false;
		 
	}
	public static void main(String[] args)
	{
		anagramString a= new anagramString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 string to check anagram ");
		  String str1=sc.nextLine();
		  String str2=sc.nextLine();
		System.out.println("string are anagram  "+a.checkAnagram(str1,str2));
		
		
		
	}

}
