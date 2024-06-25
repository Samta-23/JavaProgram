package pck;

public class SwappingInt {
	
	public static void swap (int a, int b)
	{
		a=a+b;// a=3 b=4 a=7
		b=a-b; //7-4 b=3
		a=a-b; //7-3 a=4
		System.out.println("a is "+a+" b is "+b);
	}
	public static void main(String []str)
	{
		int a =23, b=4;
		System.out.println("in main a is "+a+"  b is "+b);
		swap(a,b);
	}
}
