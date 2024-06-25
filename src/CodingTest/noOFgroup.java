package CodingTest;
/* String s="abc" s2="abcbabc" there are 3 grp of abc in s2*/

public class noOFgroup {
	static int check(String s1, String s2)
	{
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int count=0,counter=0, l=s1.length(),p=0;// p for take out value of next occurance of 'a'
		while(true)
		{
		for(int i=p;i<ch2.length;i++)
		{
			//System.out.println("p is "+ p );
			if(ch2[i]==ch1[0])
			{
				//p=i;
				System.out.println("in if ch2["+i+"] is "+ ch2[i] );
				for(int j=1;j<ch1.length;j++)
				{
					if((ch2[i+j]!=ch1[j]))// && (i<s2.length()))
					{ 
						counter=0;
						break;
					}
					else
					{
					//System.out.println("p is "+p);
						System.out.println("in equal ch2 "+ ch2[i]+"  at i "+i+" ch1 "+ch1[j] );
						counter=1;
					}
					
				}
			}
			if(counter==1)
			{
				count++;
				System.out.println("count is "+count);
			}
			counter=0;
		}
			if((p+l+1)>s2.length())
				break;
			else
			{
				p=s2.indexOf(ch1[0],p+1);	
				
				System.out.println("p is "+p);
			}
		}
		return count;
		
	}
	public static void main(String s[])
	{
		String s1="abcd", s2="abcdfabcdggabcdxabcd";
		System.out.println("count of grops are "+check(s1,s2));
	}

}
