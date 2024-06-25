package ImpProgram;

public class Exception {
	
	public static void main(String []str)
	{
		String s=null;int i=-2;
		try{
			//int l=s.length();
			
			if (i<0)
				throw new IllegalArgumentException(" no must be more then 0") ;
		}catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		double n=9.7;
		System.out.printf("%09.6f",+n);
	}
		
		
}
