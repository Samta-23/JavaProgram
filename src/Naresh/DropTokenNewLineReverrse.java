package Naresh;
/* Input String = " I am a Java Programmer"
 * Output I
 * ma
 * a
 * avaj
 * remmargorp
 * Ascii of Spaec=32 
 */

public class DropTokenNewLineReverrse {
	static void drop(String s)
	{
		int l=s.length(),sp=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<l;i++)
		{
			//sp++;
			
			if(sp>l)
				break;
			while(((int)ch[sp]!=32)&& sp<l)
			{
				if((sp+1)<(l))
				sp++;
				else
					break;
				//System.out.println("while "+sp);
			}
			int cc=0;
			for(int j=sp-1;j>=i;j--)
			{
				if(sp==(l-1)&&cc==0)
				{
					System.out.print(ch[l-1]);
					cc=1;
				}
				System.out.print(ch[j]);
			}
			//System.out.println("after For "+sp+" i "+i);
			

			System.out.println();
			i=sp;
			sp++;
			
				
		}
	}
	public static void main(String []str)
	{
		String s="I am a java ProgSAM";
		drop(s);
	}

}
