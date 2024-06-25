package ImpProgram;
/* 91011123
 99100
 1234  are beautiful string
 */
public class BeautifulString {
	
	static void beautiful(String s)
	{
		boolean beauty=false;
		String valid="";
		for(int i=1;i<s.length()/2;i++)// "12345" should check till mid only
		{
			 valid=s.substring(0,i);// take out 1,for checking 1234, 
												//12..for 121314 
			Long num=Long.parseLong(valid);
			//valid=substring;
		//	System.out.println("before while valid "+valid+" substring "+substring);
			while(valid.length()<s.length()) // compare with original string
			{
				System.out.println("in loop valid "+valid+" num "+num); 
				valid+=++num; // if take out 1... add 2 and valid 12... add 3 123 so on
				if(s.equals(valid))
				{ beauty=true;
					break;
				}
				
			//	System.out.println("valid "+valid+" substring "+substring);
			}
			
		}
		System.out.println(s +" is beautyful "+beauty);
		//return;
	}
	public static void main(String [] s)
	{
		beautiful("9101");
	}

}
