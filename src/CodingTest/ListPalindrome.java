package CodingTest;
/* if arrayList={'ball','bal','ab','top'}
 * how many palidrome can make with the combination of these words
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ListPalindrome {
	static int check(ArrayList<String> list)
	{
		String s;
		StringBuilder sb=new StringBuilder();
		int count=0, j=0;
		for(int i=j;i<list.size();i++)
		{
			s=list.get(j);
			sb.setLength(0);
			sb.append(s);
			for(int k=j+1;k<list.size();k++)
			{
				sb.append(list.get(k));
				System.out.println(sb);
				String str=sb.toString();
				char ch[]=str.toCharArray();
				Arrays.sort(ch);
				
				sb.setLength(0);
				//System.out.println("after 0 "+sb);
				int c=1,l=0;
				for( l=0;l< ch.length-1;l++)
				{
					
						if(ch[l]==ch[l+1])
						{
							c++;
							
						}
						else
						{	
					
					System.out.println("count of letter "+ch[l]+" "+c);
					if((c%2)!=0)
						sb.append(ch[l]);
				//	System.out.println("after count check sb is "+sb);
					c=1;
						}
				}
				if((c%2)!=0)
					sb.append(ch[l]);
				if(sb.length()<=1)
					count++;
				System.out.println("finaally sb is "+sb);
				sb.setLength(0);
				sb.append(s);
									
			}
			if(j<list.size())
				j++;
			
							
		}
		return count;
	}
	
	public static void main (String []s)
	{
		ArrayList <String> list=new ArrayList<>();
		list.add("top"); list.add("pop"); list.add("op"); list.add("to");
		System.out.println("main "+check(list));
		
	}

}
