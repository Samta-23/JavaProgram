package Naresh;
/* String to char array without inbuilt function only alpha character
 * Logic: use Ascii code for checking this A-Z 65-90 a-z 97-122 
 */
public class StringToCharArray {
	public static void main (String []str)
	{
		String s="Samta09#Ra a3 5 g";
		int l=s.length(),j=0;
		char c[]=new char[l];
		for (int i=0;i<l;i++)
		{
			int a= (int)s.charAt(i);
			if((a>=65 && a<=90) || (a>=97 && a<=122))
			{
				c[j]=s.charAt(i);
				j++;
			}
		}
		System.out.println(" char array ");
		for(int i=0;i<j;i++)
			System.out.print(c[i]);
		
	}

}
