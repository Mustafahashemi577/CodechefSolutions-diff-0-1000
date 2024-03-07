import java.util.*;
import java.lang.*;
import java.io.*;

class Hattrick
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    boolean f = false;
		    String s = "";
		    for(int i = 0;i<6;i++)
		     s += scan.next();
		     
		    for (int i = 0;i <4;i++)
		    if ((s.charAt(i)=='W')&&(s.charAt(i)==s.charAt(i+1))&&(s.charAt(i+1)==s.charAt(i+2)))
		    f = true;
		    
		    if (f)
		    System.out.println("YES");
		    else 
		    System.out.println("NO");
		}

	}
}
