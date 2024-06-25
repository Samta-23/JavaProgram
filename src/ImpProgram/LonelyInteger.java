package ImpProgram;
import java.util.*;

public class LonelyInteger {
	static int lonely(int [] arr)
	{
	//	Collections.sort(arr); sort is not applicable on array This is applicable on 
;		int lnly=0;
		int l=arr.length,temp;
		for(int i=0;i<l;i++) // sorting the array
		{
			for(int j=0;j<l;j++)
			{
				if (arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("after sorting ");
		for(int i=0;i<l;i++)
			System.out.println(arr[i]);
		for(int no : arr)
		{
			lnly^=no; // XOR operator give 0 
						//on same digits and 1 on different digits. This works on sorted array only
		}
		if (lnly>0)
			return lnly;
		else
			return -1;
	}
	public static void main(String []str)
	{
		int a[]={7,5,8,6,5,6,8,7};
		System.out.println("lonely int is "+lonely(a));
	}
}
