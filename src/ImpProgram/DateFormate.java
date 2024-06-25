package ImpProgram;
import java.util.*;

public class DateFormate {
	
	static void c(String d)
	{
		int h=Integer.parseInt(d.substring(0,2));
		int m=Integer.parseInt(d.substring(3,5));
		int s=Integer.parseInt(d.substring(6,8));
		String p= d.substring(8,9);
		if(p.equalsIgnoreCase("P"))
		{
			h=h+12;
			if(h==12)
				h=0;
		}
		/*else
		{
			if(h>=1&&h<=11)
			{
				h=h+1;
			}
		}*/
		System.out.printf("sec is "+p+"  ");
		//	System.out.printf("%2d"+h);//+":"+"%2d"+m+":"+"%2d"+s);
			System.out.printf("%02d:%02d:%02d", h, m, s);
	}
	
	
	
	public static void main(String []str ){
	String d="01:04:20am";
	
	c(d);
				}
		

}

