package CodingTest;

/* ascii value of 0=48 1=49 .. 9=57  
 * method used ascii value of charcter is (int)Ch
 */
import java.util.Arrays;

public class parseIntMy {
	public static void main(String []str)
	{
		String s="2l";
		int l=s.length() ;
		char []ch=s.toCharArray();
		int n=0;
		for(int i=0;i<l;i++)
		{
			int ascii=(int) ch[i];
			if(ascii>=48 && ascii<=57)
			{
				if (ascii==50)
						{
				n=n*10+2;
						}
				if (ascii==51)
				{
		n=n*10+3;
				}
			}
			else
			{
				
				n=-1;
				break;
			}
		
		
		}
		
		if(n>=0)
			System.out.println(n);
		else
			System.out.println("invalid entry");
		
	}

}
