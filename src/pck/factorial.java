package pck;
import java.util.LinkedList;

public class factorial {
	public static int fac(int i)
	{
		if (i==1)
			return 1;
		return (i*fac(i-1));
			
	}
	public static void main(String []s)
	{
		System.out.println("factorial is "+fac(6));
	}
}
