package ImpProgram;
import java.util.HashMap;
/* counting each charater frequency in String
 * 
 */
public class HashMapEach {
	static void count(String s)
	{
		char ch[]=s.toCharArray();
		HashMap<Character, Integer> hmap=new HashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++)
		{
			if(hmap.containsKey(ch[i]))
				hmap.put(ch[i],(hmap.get(ch[i]))+1);
			else
				hmap.put(ch[i],1);
		}
		
	System.out.println(hmap);
		
	}
	public static void main(String [] s)
	{
		String ss="sassattppnnn";
		count(ss);
	}

}
