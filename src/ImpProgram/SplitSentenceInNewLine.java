package ImpProgram;

import java.lang.*;

public class SplitSentenceInNewLine 
{
	    static void split(int no, String str) {
	        StringBuilder word = new StringBuilder();
	        for (char ch : str.toCharArray()) {
	            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	                word.append(ch);
	            } else {
	                if (word.length() > 0) {
	                    System.out.println(word);
	                    word.setLength(0); // Reset the StringBuilder
	                }
	            }
	        }
	        if (word.length() > 0) {
	            System.out.println(word);
	        }
	    }

	    public static void main(String[] args) {
	        String str = "he is good boy, isn;t he?";
	        split(0, str);
	    }
	}

	/*public static void main(String []str)
	{
		String s="He is very good Boy, Isn't he?";
		split(7,s);
	}
*/
