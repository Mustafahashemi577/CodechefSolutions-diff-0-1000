import java.util.*;
import java.lang.*;
import java.io.*;

class Expert_Setter
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    if((y*100/x)>=50)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}
