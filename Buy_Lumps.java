import java.util.*;
import java.lang.*;
import java.io.*;

class Buy_Lumps
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    if (x>y)
		    System.out.println((k*x)+(n-k)*y);
		    else
		    System.out.println(n*x);
		}

	}
}