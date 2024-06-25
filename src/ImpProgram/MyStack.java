package ImpProgram;
import java.util.*;

/* if option is 1--- push the entered element
 * 2--- delete the top element from stack
 * 3--- print the max value of stack
 */

public class MyStack {

	public static void main(String [] s)
	{
		Stack <Integer> mainstack= new Stack<Integer>();
		Stack <Integer> maxstack= new Stack<Integer>();
		maxstack.push(Integer.MIN_VALUE);
		Scanner sc=new Scanner(System.in);
		int cycle,option;
		System.out.println("how many time run the cycle");
		int N=sc.nextInt();
		for(int i=0;i<N;i++)
		{
			System.out.println("Enter option for operation");
			option=sc.nextInt();
			switch (option)
			{
			case 1:
				System.out.println("Enter element for push ");
				int n=sc.nextInt();
				mainstack.push(n);
				if (n>(maxstack.peek()))
					maxstack.push(n);
				break;
			case 2:
				 int no=mainstack.peek();
				 mainstack.pop();
				 if (no== maxstack.peek())
					 maxstack.pop();
				 break;
			case 3:
				System.out.println(" deleted item is "+mainstack.peek());
				if (mainstack.peek()==maxstack.peek())
				{
					mainstack.pop();
					maxstack.pop();
				}
				else
					mainstack.pop();
				
				
				break;
			case 4:
				System.out.println("max is "+maxstack.peek());
				break;
			default:
				System.out.println("invalid option");
		}
		
				
					
				
			}
		
	}
}

