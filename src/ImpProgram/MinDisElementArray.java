package ImpProgram;

import java.util.*;

/* find the min dis between duplicate elements in array
 if Array is 1 2 4 1 2 5 7 1
 Ist dis of 1-1 3-0=3    2nd dis 1-1 7-3 =4 
 Ans is 3 for dis of 1-1 bcx 3<4 
 */

public class MinDisElementArray {
/*	static void dis(int arr[])
	{
		int preindx=0,curindx=0;
		int min = Integer.MAX_VALUE;

		HashMap <Integer, Integer>  hmap=new HashMap <Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if (hmap.containsKey(arr[i]))
			{
				curindx=i;
				preindx=hmap.get(arr[i]);
				min=Math.min((curindx-preindx),min);
				System.out.println("in IF preindx "+preindx+" curindx "+curindx);
			}
			else
			{
				hmap.put(arr[i],i);
				System.out.println("in Else value "+hmap.get(i)+" key "+hmap.get(arr[i]));
			}
		}
	}
	public static void main(String []s)
	{
		int a[]={1,2,3,2,1,4,5,3,1};
		for(int i=0; i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		dis(a);
	}*/
	
	    public static int minDistanceOfSameElements(int[] arr) {
	        int minDistance = Integer.MAX_VALUE; // Initialize minDistance to maximum value
	        HashMap<Integer, Integer> lastIndexMap = new HashMap< Integer, Integer>(); // Store the last index of each element

	        for (int i = 0; i < arr.length; i++) {
	            int currentElement = arr[i];

	            if (lastIndexMap.containsKey(currentElement)) {
	                int lastIndex = lastIndexMap.get(currentElement);
	                int currentDistance = i - lastIndex;
	                minDistance = Math.min(minDistance, currentDistance);
	            }

	            lastIndexMap.put(currentElement, i);
	            System.out.println("Minimum distance of same elements: " + arr[i]+" is "+minDistance);
		    }
	        return minDistance;
	        }

	        
	    

	    public static void main(String[] args) {
	        int[] arr = {3, 2, 1, 2, 3, 4, 5, 2, 3}; // Example array
	        for(int i=0; i<arr.length;i++)
				System.out.print(arr[i]+" ");
	         minDistanceOfSameElements(arr);
	     
	}
}


