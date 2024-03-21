import java.util.*;
import java.lang.*;
import java.io.*;

class Am_I_Lucky
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int k = scan.nextInt();
		    int g = n-x;
		    int r1 = x%k;
		    int r2 = g%k;
		    System.out.println(Math.abs(r1-r2));
		}

	}
}
