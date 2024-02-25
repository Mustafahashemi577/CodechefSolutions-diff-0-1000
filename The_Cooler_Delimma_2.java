import java.util.*;
import java.lang.*;
import java.io.*;

class The_Cooler_Delimma_2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int d=y/x;
		       if (y%x==0)
		       System.out.println(d-1);
		       else
		       System.out.println(d);
		    
		}

	}
}
