package CodingTest;

public class CompressStr {
	
	
	    public static void main(String[] args) {
	        String input = "abccdddeffffc";
	        String output = compressString(input);
	        System.out.println(output); // Output: abc2d3ef4
	    }

	    public static String compressString(String input) {
	        StringBuilder sb = new StringBuilder();int c=1;
	        for(int i=0;i<input.length()-1;i++)//abccdddeffffee
	        {
	        	if(input.charAt(i)==input.charAt(i+1))
	        		c++;
	        	else
	        	{
	        		
	        			sb.append(input.charAt(i));
	        			if(c>1)
	        			{
	        			sb.append(c);
	        			c=1;
	        			}
	        		}
	        	}
	        sb.append(input.charAt(input.length()-1));
	        if(c>1)
	        	sb.append(c);
	        	
	        
	        	return sb.toString();
	        }
	  }
	



