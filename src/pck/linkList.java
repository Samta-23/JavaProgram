package pck;
import java.util.*;
public class linkList {
	public static void main(String []s)
	{
		LinkedList<String> list = new LinkedList<String>();
		list.add("tipu");
		list.add("sam");
		list.add("anshu");
		list.add("cherru");
		Iterator<String> i= list.iterator();
		System.out.println("hi "+list); // o/p [tt, sam, anshu, cherru]
		while(i.hasNext())
			System.out.println(i.next()); //o/p tt sam anshu cherru all in new line
		Iterator <String> d=list.descendingIterator(); //reverse traversing
		while(d.hasNext())
			System.out.println(d.next());
		list.remove("tipu");
		System.out.println("after delete"+list);
			
		
	}

}
