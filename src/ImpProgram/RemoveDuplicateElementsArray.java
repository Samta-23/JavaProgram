package ImpProgram;

import java.util.*;

public class RemoveDuplicateElementsArray {
	
	static List<Integer> remove(int [] arr)
	{
		int l=arr.length, unq[]= new int [l],len=0;
		int j=0;
		List <Integer> list= new ArrayList<Integer>();
		for(int i=0;i<l;i++)
		{
			boolean isdup= false;
			for(int k=0;k<j;k++)
			{
				if (arr[i]==unq[k])
				{
					isdup=true;
					break;
				}
			}
			if (!isdup)
			{
				unq[j++]=arr[i];
				len++;
			}
		}
		l=unq.length;
		 for(int i=0;i<len;i++)
	       list.add(unq[i]);
		return list;
		
	}

		    public static void main(String[] args) {
	        int[] a = {3, 2, 1, 3, 1, 5, 2};
	        List<Integer> l=new ArrayList<Integer>();
	       l=remove(a);
	        for(int i: l)
	        	System.out.println(i);
	      
	       
	        
	        }
	}






