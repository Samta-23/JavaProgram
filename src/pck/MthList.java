package pck;
import java.util.LinkedList;
import java.util.Scanner;

public class MthList {
	

	    public static void main (String[] args) {
	        Scanner input = new Scanner(System.in);
	        LinkedList<Integer> linkedList = new LinkedList<Integer>();
	        int idx=input.nextInt();
	        while (input.hasNext())
	        {	System.out.println("Enter no (press 0 to break) ");
	        	int n=input.nextInt();
	        	if(n==0)
	        		break;
	        	linkedList.push(n);
	        }
	        for(int i=0;i<idx;i++)
	        {
	        	
	        }
	            

	        System.out.println("fin");
	    }
	}


