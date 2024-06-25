package ImpProgram;

public class RemoveLeadingTrailingSpace {
	
	static void dup(String s)
	{
		StringBuilder sb = new StringBuilder();
		char [] c=s.toCharArray();int k=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(c[i]==' ' && k==0){
				k=0;
				//sb.append(c[i]);
			}
			else
			{
				k=1;
			System.out.println(" in  "+c[i]);
			sb.append(c[i]);
			}
		}
		System.out.println(sb);//.toString());
		
	}
	
		public static void main(String []str)
	{
			String s="   smat";
			dup(s);	
	}

}
