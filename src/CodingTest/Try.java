package CodingTest;

public class Try {
	public static void main(String [] str)
	{
		String s="abcxabchhabcma";
		char c='a';int p=0;
		for(int i=0;i<s.length();i++)
		{
			
			
			 p=s.indexOf(c,p+i);
			System.out.println(p);
		}
}

}
