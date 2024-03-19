import java.util.*;
import java.lang.*;
import java.io.*;

class Work_Smarter
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int l = scan.nextInt();
	        int v1 = scan.nextInt();
	        int v2 = scan.nextInt();
	        int t1 = (int) Math.ceil((double) l / v1);
	        int t2 = (int) Math.ceil((double) l / v2);
	        if(t1==t2)
	        System.out.println(-1);
	        else
	        System.out.println(t1-t2-1);
	    }

	}
}
