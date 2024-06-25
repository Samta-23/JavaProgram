package ImpProgram;
/* Concept :::: if we perform bitwise left one time followed by and operation, it reduce 
 * one 1 from number. So as many times these operations done to acieve 0, that 
 * time consecutive persent in the number 
 */

public class FindConsecutive1s {
	static int check1s(int no)
	{
		int count=0;
		while(no>0)
		{
			no=no & (no<<1);
			count++;
		}
		return count;
	}
	public static void main(String []s)
	{
		int n= 34654; // = 101011010   
				// n= 211184   4 consecutive 1s
		System.out.println("no of 1s re " +check1s(n));
	}

}
