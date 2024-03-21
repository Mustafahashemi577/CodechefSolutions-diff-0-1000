import java.util.*;
import java.lang.*;
import java.io.*;

class Car_Range
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int p = scan.nextInt();
		    int m = scan.nextInt();
		    int v = scan.nextInt();
		    
		    System.out.println((m+1-p)*v);
		}

	}
}
