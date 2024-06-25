package pck;
import java.util.*;
import java.lang.*;

public class TimeConversion {
	
	// time is stored in String variable
	
	/*public static String time (String s)
	{
		int l=s.length(),h,min,sec;  //( "01:01:00PM  is "+time("01:01:00PM"));
		h=Integer.parseInt(s.substring(0,2));
		min=Integer.parseInt(s.substring(3,5));
		sec=Integer.parseInt(s.substring(6,8));
		String shift= s.substring(8);
		System.out.println("shift "+shift);
		if (shift.equalsIgnoreCase("PM") && h!=12)
			h+=12;
		else if(shift.equalsIgnoreCase("AM") && h==12)
			h=0;
		String hr=String.format("%02d",h);
		String m=String.format("%02d",min);
		String se=String.format("%02d",sec);
		String time1=hr+":"+m+":"+se;
		return time1;
		
	}*/
	
	// Time is stored in the List<Integer>
	public static String time( List <Integer> list)
	{
		int h,m,s; String hr=" ",min=" ",sec=" ";
		for(int i :list)
			System.out.println("i is "+i);
		return sec;

	}
	public static void main(String []str)
	{ 
		int arr[]={1,2,3,4};
		
		System.out.println( "arr   is "+Arrays.toString(arr));
		
			
	}
	

}
