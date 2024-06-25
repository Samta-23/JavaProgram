package pck;
import java.util.*;

public class listInteger {
	public static void isOdd(List<Integer> l)
	{
		for(int i:l)
		{
			if(i%2!=0)
			System.out.println(i+" is odd numer");
		}
	}
	public static void main(String []str )
	{
		List <Integer> list= new ArrayList<Integer>();
		//list.addAll(List.of(1, 2, 3, 4, 5));
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		isOdd(list);
	}

}
