package ImpProgram;
import java.util.*;  
/* traversing Linked list do with the help of ietrator */

public class myLinkedList {
	static void back_traversing (LinkedList<String> ll)
	{
		int ii=0;
        Iterator i=ll.descendingIterator();  //
        while(i.hasNext())  // it return object
        {  
     	  // System.out.println(i.next()
     	   ii++;
     	   i.next(); 
          	if(ii==3)
            {System.out.println(i.next());  }
        }
		
	}
	static void delete(LinkedList <String>ll)
	{
		ll.remove("Vijay");
		System.out.println("After remove Vijay");
		Iterator i = ll.iterator();
		while(i.hasNext())
		{
		 System.out.println(i.next());	
		}
	//	ll.removeLast()  ll.removeFirst()  ll.removeAll ll.remove(index)
		
	}

	public static void main(String[] args){  
	  
	 LinkedList<String> ll=new LinkedList<String>();  
	  
	           ll.add("Ravi");  
	           ll.add("Vijay");  
	           ll.add("Ajay");  
	           ll.add("samta");
	           ll.add("tapu");
	           //Traversing the list of elements in reverse order  
	           System.out.println("4th element from back");
	           back_traversing(ll);
	           System.out.println("delete");
	           delete(ll);
	             
	 }  
	}  

