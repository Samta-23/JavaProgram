package ImpProgram;
import java.util.*;
public class ArraySAmeElement {
	static void same(int a[], int b[])
	{
		int l=a.length, len=b.length;
		List <Integer>la=new ArrayList<Integer> ();// it sort in one step
		List <Integer>ll=new ArrayList<Integer> ();
		HashSet <Integer> set1=new HashSet<Integer>();// it eliminate duplicate while adding 
		HashSet <Integer> set2=new HashSet<Integer>();
		boolean issame=true;
		for(int i=0;i<l;i++)
		{
			set1.add(a[i]);
		}
		for(int i=0;i<len;i++)
		{
			set2.add(b[i]);
		}
		la.addAll(set1);// add all HashSet element in ArrayList in on go
		ll.addAll(set2);
		Collections.sort(la);// sort the list one go
		Collections.sort(ll);
		System.out.println("l1 is "+la);
		System.out.println("l12 is "+ll);
		/*return l1.equals(ll2);
		/*Integer[] aa=la.toArray(new Integer[ la.size()]);// cover list in not Array
		Integer [] bb=ll.toArray(new Integer[ ll.size()]);
		if(aa.length==bb.length)
		{
		for(int i=0; i<aa.length;i++ )
		{
				if(!aa[i].equals(bb[i]))// compare list with one other list
				{
					issame=false;
					break;
				}
					
		}*/
		if(ll.equals(la))
			System.out.println("same array");
		else
			System.out.println("not same array");
		/*}
		else
			System.out.println("not same array");*/
		
	}
	public static void main(String []s)
	{
		int i[]={3,1,4,1,7,2,3,4,2};
		int ii[]={3,1,4,2};
		same(i,ii);
	}

}
