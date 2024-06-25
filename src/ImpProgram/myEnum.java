package ImpProgram;

//import ImpProgram.Enum.weekDay;


public class myEnum {

	enum weekDay{SUN, MON, TUES}
	
	public static void main(String []s)
	{
			
		//weekDay day=weekDay.mon;
		for(weekDay d :weekDay.values())
			System.out.println(d);
		
	}
	

}
