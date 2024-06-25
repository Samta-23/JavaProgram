package ImpProgram;
 /* Utopian Tree 
  Period     Height
  0				1		*2
  1				2		+1
  2				3		*2
  3				6		+1
  4				7 so on
  means at flag  0  +1 operation 
  		at flag  1	*2 operation
  		toggle flag
  */

public class utopianTree {
	 static void utopiantree(int n)
	 {
		 int h=1, flag=0;
		 for(int i=0;i<=n;i++)
		 {
			 System.out.println(" "+i+"   "+h);
			 if (flag==0)
			 {
				 h*=2;
				 flag=1;
			 }
			 else
			 {
				 h+=1;
				 flag=0;
			 }
			 
			 
			 
		 }
		 
	 }
	 public static void main(String[] s)
	 {
		 utopiantree(7);
	 }

}
