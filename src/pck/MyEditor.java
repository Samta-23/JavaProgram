package pck;
import java.util.*;
import java.lang.*;
import java.io.*;
public class MyEditor {
	public static void main(String []s) throws IOException
	{
		StringBuilder editor=new StringBuilder();
		Stack<String> st= new Stack<String>();
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		while(true)
		{
		String line=br.readLine();
		int nocmd=0;
		while(line !=null)
		{
			String cmd[]=line.split(" ");
			if (nocmd==0)
			{
				nocmd=Integer.valueOf(cmd[0]);
				continue;
			}
			if( cmd[0].equals("1"))
			{
				editor.append(cmd[1].trim());
				
				st.add(editor.toString());
			}
			else if(cmd[0].equals("2"))
			{
				int num= Integer.valueOf(cmd[1]);
				int end = editor.length()-num;
				if(num>editor.length())
				{
					editor=new StringBuilder();
				}
				else
					editor=new StringBuilder(editor.substring(0,end));
				st.add(editor.toString());
			}
			else if(cmd[0].equals("3"))
			{
				int idx= Integer.valueOf(cmd[1]);
				System.out.println(editor.charAt(idx-1));
			}
			else if(cmd[0].equals("4"))
			{
				if(st.size()>0)
					st.pop();
				if(st.size()>0)
					editor=new StringBuilder(st.peek());
				else
					editor=new StringBuilder();
				
			}
			line=br.readLine();
		}
		}
			
			
		
	}
	
}
