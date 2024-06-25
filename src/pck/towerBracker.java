package pck;
import java.util.*;

public class towerBracker {
	public static int tower(int n, int len)
	{
		Stack <Integer> tower= new Stack<Integer>(); 
		boolean winner=true;
		for (int i=1;i<=len;i++)
		{
			tower.push(i);
		}
		if (len==1|| n%2==0)
			return 2;// winner player 2  Stack 1, 2, 3, 4, 5, 6 pop 3
		else
			return 1; // winner player 1
	}
	public static void main(String s[])
	{
		System.out.println("winner is if pop is 3 len is 6 retrun 2 for player 2 : "+tower(2,2));
		System.out.println("winner is if pop is 4 len is 10 : "+tower(1,4));

	}

}
