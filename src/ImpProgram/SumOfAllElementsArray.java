package ImpProgram;

public class SumOfAllElementsArray {
	static void sum(int [] a)
	{
		int s=0;
		for(int i :a)
			s+=i;
		System.out.println(s);
		
		
	}
	public static void main(String []s)
	{
		int a[]={1,2,3,4,5,6,7};
		sum(a);
	}
}
