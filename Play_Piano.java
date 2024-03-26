import java.util.*;
import java.lang.*;
import java.io.*;

class Play_Piano
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String log = scan.next();
		    boolean find = true;
		    for(int i =0;i<log.length();i+=2)
		    {
		        if (log.charAt(i)==log.charAt(i+1))
		        {
		            find = false;
		            break;
		        }
		    }
		    System.out.println(find==true? "yes" : "no");
		}

	}
}
