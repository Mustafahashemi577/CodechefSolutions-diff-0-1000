import java.util.*;
import java.lang.*;
import java.io.*;

class Bells_Of_Pilgrimage
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner  scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int k = scan.nextInt();
		    int p = scan.nextInt();
		    int o = 0;
		    int y = 0;
		    if (k==0)
		    System.out.println(p);
	        else 
	        {
	            if (k>x)
	            o = p+(x*10)+(k-x)*5;
	            else
	            o = p+(k*10);
	            if (k==n)
	            System.out.println(o+20);
	            else
	            System.out.println(o);
	        }
		}

	}
}
