package ImpProgram;

class sports{
	void getname()
	{
		System.out.println("inside sports");
	}
}
class football extends sports{
	void getname()
	{
		super.getname();
		System.out.println("inside football");
	}
}
public class MethodOverRide {
	public static void main(String []str)
	{
		sports s=new sports();
		football f= new football();
		s.getname();
		f.getname();
	}
	

}
