package ImpProgram;

public class ValidUserName {
	static int user(String s)
	{
		int l=s.length(),count=0;
		if(l>30 && l<8)
		{
			System.out.println("must contain 8-30");
			return -1;
		}
		char[] ch=s.toCharArray();
		if(!(ch[0]>='a'&&ch[0]<='z')||(ch[0]>='A'&&ch[0]<='Z'))
		{
			System.out.println("must starts with alphabets");
			return -1;
		}
		for(int i=1;i<l;i++)
		{
			if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')||
					(ch[i]>='1'&&ch[i]<='9')||(ch[i]=='_'))
			{
				//System.out.println("contain bad letter");
				continue;
			}
			else
			{
				System.out.println("contain bad letter");
				count=1;
				break;
			}
		}
		if(count==0)System.out.println("valid");
		return 1;
	}
	
	public static void main(String [] str)
	{
		String s="samtagg2_a4_gg";
		user(s);
	}

}
