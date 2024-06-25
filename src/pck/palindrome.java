package pck;
public class palindrome{
	public static boolean isPalindrome(String s)
	{
		if (s==null)
			return false;
		int l=s.length();
		for(int i=0; i<(l)/2;i++)
		{
			if(s.charAt(i)!=s.charAt(l-(i+1)))
					return false;
		}
		return true;
	}
	public static void main(String [] s)
	{
		System.out.println("abcdedcba is palindrome "+isPalindrome("abcdedcbag"));
	}
}