package pck;
//import java.util.Arrays;


public class bubbleSort {
	public static void bubbleSort(int []no )
	{
		int l=no.length,temp;
		for (int i=0; i<l-1 ;i++)
		{
			for(int j=0;j<l-i-1;j++)
			{
				if(no[j]>no[j+1])
				{
					temp=no[j];
					no[j]=no[j+1];
					no[j+1]=temp;
				}
			}
		}
		for(int i=0;i<l-1;i++)
		System.out.println("array after sorting "+no[i] );
	}
	public static void main(String []s)
	{
		int no[]={43,10,0,20,100,8,500,430};
		bubbleSort(no);
	}
}
