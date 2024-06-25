package pck;

import java.util.*;

public class lonelyInteger{
	static int lonely (List <Integer> list)
	{
		int l=list.size(),c;
		int arr[]=new int [l];
		Collections.sort(list);
		System.out.println("After sorting");
		System.out.println(list);

		for (int i=0;i<l;i++)
			arr[i]=list.get(i);
		for(int i=0;i<l-1;)
		{	
			c=0;
			int j=i+1;
			if(arr[i]==arr[j])
			{
				System.out.println("arr[i] "+arr[i]+"arr[j) "+arr[j]);
					c=1;
			}
			if(c==0)
				return arr[i];
			i+=2;
			
			if(i>=l-1)
				return arr[l-1];
			
			
			
			//i+=2;
		}
		return -1;
		
	}
	
	public static void main(String[] args)
	{
		List <Integer> l= new ArrayList <Integer>();
		l.add(1);
		l.add(3);
		l.add(2);
		l.add(5);
		l.add(2);
		l.add(1);
		l.add(3);
		int len=l.size();
		System.out.println(l);
		int a=lonely(l);
		System.out.println("lonely integer is "+a);
	}

}
