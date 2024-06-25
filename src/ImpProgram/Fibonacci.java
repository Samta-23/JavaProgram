package ImpProgram;
/** 1+1+2+3+5+8+13+21+34+55........    */

public class Fibonacci {
	static int fabo(int i)
	{
		if(i<=1)
			return i;
	//	System.out.println(i);
		return fabo(i-1)+fabo(i-2);
	}
	public static void main(String []s)
	{
		for(int i=0;i<8;i++)
			System.out.print(" "+fabo(i));
		
		//System.out.print(fabo(8));
	}

}
