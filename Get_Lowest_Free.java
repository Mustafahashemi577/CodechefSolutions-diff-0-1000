import java.util.*;
import java.lang.*;
import java.io.*;

class Get_Lowest_Free
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    int m=Math.min(a,b);
		    int mm=Math.min(c,m);
		    System.out.println((a+b+c-mm));
		}

	}
}
