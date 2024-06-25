package ImpProgram;

/* Abstract class in which no defination of class*/ 

abstract class vehicle{
	abstract  void define();
}
class cycle extends vehicle
{
	void define()
	{
		System.out.println(" in clycle");
	}
}

 public class Abstract {
	 public static void main(String []s)
	 {
	 cycle c= new cycle();
	 c.define();
	 }
	
}
  
