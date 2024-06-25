package pck;
import java.util.*;

public class HCF_GCF 
{
   int hcf(int x, int y)
   {
	  	   int f=1,c=0,s=0;
	   for(int i=1;(f<=x && f<=y);i++)
	   {
		   if ((x%f==0) &&(y%f==0))
		   {
			   s=f;
		   }
		   f++;
	   }
	   return s; 
   }
   public static void main(String[] args)
   {
	int a,b;
	 HCF_GCF h= new HCF_GCF();
	Scanner sc= new Scanner(System.in);
	System.out.println("enter 2 no for HCF ");
	a = sc.nextInt();
	b= sc.nextInt();
	System.out.println("HCF is "+(h.hcf(a,b)));
	}
}
