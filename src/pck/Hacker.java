package pck;
import java.util.*;
// max sum of array and min sum of array
public class Hacker {
	
		    public static void main(String[] args) {
	        // Create a List of integers
	        List<Integer> numbers = new ArrayList<Integer>();
	        int min=0, max=0; 
	        // Add some integers to the list
	        numbers.add(5);
	        numbers.add(2);
	        numbers.add(8);
	        numbers.add(1);
	        int l=numbers.size();

	        // Sort the list
	        Collections.sort(numbers);
	        
	        System.out.println("length " + l);

	        // Print the sorted list
	        System.out.println("Sorted List: " + numbers);
	        for (int i=1;i<l;i++)
	        {
	        	max+=numbers.get(i);
	             System.out.println("max in looop  " + max);
	        }
	        for(int i=l-2;i>=0;i--)
	        	min+=numbers.get(i);
	        System.out.println("max  " + max);
	        System.out.println("min " + min);
	    }
	}

	


