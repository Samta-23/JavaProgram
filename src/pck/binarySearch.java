package pck;

public class binarySearch {
	public static int binarySearch(int[] arr,int target)
	{
		
		if(arr==null)
		{
			System.out.println("null");
			return -1;
		}
		int mid,left=0, right=arr.length-1;
		while(left<=right)
		{
			 mid=left+(right-left)/2;
			 System.out.println("mid ");
			if(arr[mid]==target)
				return mid;
			if(arr[mid]<target)
				left=mid+1;
			else
				right=mid-1;
		}
		
			return -1;
	}
	public static void main(String[]s)
	{
		int arr[]={20,10,30,40},i=30;
		int r=binarySearch(arr,i);
		System.out.println("REsult of serching is " + binarySearch(arr,i));
		
		
	}
}
