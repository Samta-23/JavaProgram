package ImpProgram;

// can not done multple interhance in java so concept of interface came 
interface mother
{
	void skincolor();
}
interface father
{
	void haircolor();
}

class child implements mother, father
{
	public void skincolor()
	{
		System.out.println("in skin");
	}
	public void haircolor()
	{
		System.out.println("in hair");
	}
}


public class Interface {
	public static void main(String []s)
	{
		child c= new child();
		c.haircolor();
		c.skincolor();
	}
	
}
