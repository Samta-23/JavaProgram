package ImpProgram;
/* if no is divisible by 3 --- fizz if by 5--- Buzzz if by both -- FizzBuzz
 * if no array is 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 \
 * 1 2 Fizz 4 Buzz 5 FIzz 7 8  Fizz Buzz 11 Fizz 13 14 FizzBuzz
 */
public class FizzzBuzz {
	static void FB(int l)
	{
		//int l=arr.length;
		for (int i=1;i<l;i++)
		{
			if ((i%3==0)&& (i%5==0))
				System.out.println(i+ " FizzBuzz");
			else if ((i%3==0))
				System.out.println(i+" Fizz");
			else if ( (i%5==0))
				System.out.println(i+" Buzz");
			else
				System.out.println(i);
		}
	}
	
	public static void main(String []s)
	{
		FB(20);
	}

}
