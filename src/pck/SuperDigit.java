package pck;

public class SuperDigit {

	public static int superDigit(String n, int k) {
	    // Write your code here
	    int no[]= new int[k], sum=0;
	    if (n.length()==1)
	        return Integer.parseInt(n);
	    
	    for(int i=0;i<n.length();i++)
	    {
	        no[i]=Character.getNumericValue(n.charAt(i));
	        System.out.println("no "+ no[i]);
	        sum+=no[i];
	        
	    }
	    System.out.println("sum "+ sum);
	    String ss=String.valueOf(sum);
	  
	  //  int r=0,rr=0;
	   // while(sum>0)
	    //	{
	    	return superDigit(ss,ss.length());
	    	/*r=sum%10;
	    	sum/=10;
	    	System.out.println("r "+ r);
	    	rr=r+rr;
	    	System.out.println("r r  "+ rr);
	    	System.out.println("sum "+ sum);
	    	}
	    
	      return (rr);*/
}
	public static void main(String []s)
	{
		String i="2001";
		int r=superDigit(i,3);
		System.out.println("2001 "+r);
		
	}
}
