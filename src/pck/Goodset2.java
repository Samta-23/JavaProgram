package pck;
import java.util.*;

public class Goodset2
{
	public static void noPrefix(List<String> words) {
	    // Write your code here
	        String returnString = "GOOD SET";
	        boolean badSet = false;
	        
	        HashMap<String, Integer> mapPrefix = new HashMap<String, Integer>();
	        HashMap<String, Integer> mapWord = new HashMap<String, Integer>();
	        
	        String prefix = "";
	        String word = "";
	        for (int i = 0; i < words.size(); i++)
	        {
	            word = words.get(i);
	            
	            for (int j = 0; j < word.length(); j++)
	            {
	                prefix = word.substring(0, j + 1);
	                
	                if (j < word.length() - 1)
	                    mapPrefix.put(prefix, 0);
	                    
	                if (mapWord.containsKey(prefix) || mapPrefix.containsKey(word))
	                {
	                    returnString = "BAD SET\n" + word;
	                    badSet = true;
	                    break;
	                }
	            }
	            
	            if (badSet) break;
	            else
	                mapWord.put(word, 0);
	        }
	        
	        System.out.println(returnString);
	    }
	public static void main(String []s)
	{
		
	}
}
