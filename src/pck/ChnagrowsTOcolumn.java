package pck;

public class ChnagrowsTOcolumn 
{
	void display(int[][] temp)
	{
		for (int i=0; i<temp.length;i++)
		{
			for(int j=0;j<temp[0].length; j++)
			{
				System.out.print(" "+temp[i][j]+" ");
			}
			System.out.println();
		}
	}
	void change(int [][]temp)
	{
		int tempnw[][]= new int[temp[0].length][temp.length];
		for(int i=0;i<temp.length;i++)
		{
			for(int j=0;j<temp[0].length;j++)
			{
				tempnw[j][i]=temp[i][j];
			}
		}
		System.out.println("calling modified aray");
		display(tempnw);
	}
	public static void main(String[] args) 
	{
		int [][]temp={{10,20,30},{40,50,60}};
		ChnagrowsTOcolumn c= new ChnagrowsTOcolumn();
		System.out.println("calling orignal aray");
		c.display(temp);
		c.change(temp);
		
	}
	
}
