package pck;
import java.util.*;
public class anagramCheckingStringArray  // eat is anagram to tae or ate  
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
		/*System.out.println();
		for(int i=0;i<=ch.length-1;i++) //ascii of lower case 97-122
		
			System.out.println("sorted char "+ch[i]);*/

		String s=new String(ch);
		//System.out.println("after for insort "+s);*/
		return s;
		
			
	}
	void checkAnagram(String s)
	{
		String []strArray=null,str[]=null;
		int i=0,c=0;
		strArray=s.split(" ");
		/*for(i=0;i<strArray.length;i++)
			strArray[i]=strArray[i].replaceAll("\\s","");*/
		for(i=0;i<strArray.length;i++)
			strArray[i]=strArray[i].toLowerCase();
		for(i=0;i<strArray.length;i++)
		   System.out.println("Str is check method "+strArray[i]);
		for(i=0;i<strArray.length;i++)
		{
		 char[] ch=strArray[i].toCharArray();
		 strArray[i]=sort(ch);
		}
		System.out.println("after sorting method str is ");
		for(i=0;i<strArray.length;i++)
			   System.out.println(strArray[i]);
		for(i=0;i<strArray.length;i++)
		{
			for(int j=strArray.length-1;j>=0;j--)
			{
				if(i!=j)
				{
				 if (strArray[i].equals(strArray[j]) )
				 {
					 System.out.println("anagram string are "+strArray[i]+"  "+strArray[j]);
					 c=1;
				 }
				}
			}
		}
		if (c==0)
			System.out.println("no anagram strings");
		 
	}
	public static void main(String[] args)
	{
		anagramCheckingStringArray a= new anagramCheckingStringArray();
		Scanner sc=new Scanner(System.in);
		String str=new String();
		System.out.println("Enter  strings to check anagram seprated by space");
		  str=sc.nextLine();
		  a.checkAnagram(str);
	}

}
