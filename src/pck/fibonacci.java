package pck;
public class fibonacci{
	/*public static void fibo(int len)
	{
		int a=0,b=1,f;
		System.out.print(" "+a+" "+b+" ");
		for (int i=0;i<len-2;i++)
		{
			f=a+b;
			a=b;
			b=f;
			System.out.print(" "+f);
		}
/	}*/
	public static int fibo(int len)
	{
		if (len<=1)
			return len;
		return fibo(len-1)+fibo(len-2);
	}
	public static void main(String []s)
	{
		int l=14;
		System.out.println("fibo series till 14 ");
		for(int i=0; i<l;i++)
		{
			System.out.print(" "+fibo(i));
		}
		//fibo(10);
		
	}
	/*public static int fibonacci(int count) {
		if (count <= 1)
			return count;

		return fibonacci(count - 1) + fibonacci(count - 2);
	}

	public static void main(String args[]) {
    	int seqLength = 10;

    	System.out.print("A Fibonacci sequence of " + seqLength + " numbers: ");

    	for (int i = 0; i < seqLength; i++) {
      	    System.out.print(fibonacci(i) + " ");
    	}
  	}*/
}