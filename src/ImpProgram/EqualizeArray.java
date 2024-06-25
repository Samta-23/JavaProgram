package ImpProgram;
import java.util.*;

public class EqualizeArray {
	static int equlize(int [] arr)
	{
		int len=arr.length,freq=0,no,count=0;
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		//int [] dup=new int [100];
		
		for(int i=0;i<len;i++,freq=0)
		{
			no=arr[i];
			if(  map.size()>0)
			{
				for(String s : map.keySet())
				{
					int value=map.get(s);
					System.out.println(value);
				
					/*if (s.equals(map.get(s))) //map("3",2)  (element,freq) (key,value)
					{
						int f=map.get(s);
						f++;
						map.put(Integer.toString((arr[i]),f)));
						count=1;
					}*/
					
				}
			}
			
				else if (count ==1)
				{
					map.put(Integer.toString(arr[i]),1);
					count=0;
				}
				else
					map.put(Integer.toString(arr[i]),1);
			}
				
		//System.out.println("element "+key +" max frequency "+maxfreq);
		
		return 1;//len-maxfreq;
	}
	public static void main(String []s )
	{
		int n[]={1,2,2,3,3,3};
		equlize(n);
	}
}
