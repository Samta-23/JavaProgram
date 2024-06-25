package pck;

import java.util.*;

public class GoodSet 
{
	public static void check(List <String> words)
	{
		HashMap <String, Integer> mapprefix= new HashMap<String, Integer>();
		HashMap<String, Integer> mapword=new HashMap<String, Integer>();
		String prefix="", word="";
		String returnstring="Good Set";
		boolean badset=false;
		for(int i=0;i<words.size();i++)
		{
			word=words.get(i);
			for(int j=0;j<word.length();j++ )
			{
				prefix=word.substring(0,j+1);
				if (j<word.length()-1)
				{
					mapprefix.put(prefix,0);
				}
				System.out.println("word is "+word);
				System.out.println("prefix is "+prefix);
				if((mapword.containsKey(prefix))|| mapprefix.containsKey(word))
				{
					returnstring="Bad Set \n"+word;
					badset=true;
					break;
				}
				
			}
			if(badset)break;
			else
				mapword.put(word,0);
			
		}
		System.out.println(returnstring);
			 
	}
	public static void main(String []str)
	{
		List <String> words=new ArrayList<String> ();
		words.add("aab");
		words.add("bed");
		words.add("ifsds");
		words.add("debe");
		words.add("cda");
		words.add("edc");
		words.add("ifs");
		check(words);
	}

}
