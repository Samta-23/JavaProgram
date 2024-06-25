package CodingTest;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
//import util.Array;
/* str="eeyegeyggyge"   final str="eeeeeggggyyy"
 * 
 */

public class SortArrayWithCharLength {
	static void check(String s)
	{
		char ch[]=s.toCharArray();
		int count=0, l=ch.length;
		HashMap <Character,Integer> hmap=new HashMap<>();
		Arrays.sort(ch);
		for(int i=0;i<l-1;i++)
		{
			if(ch[i]==ch[i+1])
				count++;
			else
			{
				hmap.put(ch[i],count);
				count=0;
			}
			
		}
		hmap.put(ch[l-1],count);
		 for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
	            Character key = entry.getKey();
	            Integer value = entry.getValue();
	            System.out.println("Key: " + key + ", Value: " + value);
	        }
		 	
		
	}
	public static void main(String [] str)
	{
		String s="eeyegeyggygeyy";
		check(s);
	}

}
