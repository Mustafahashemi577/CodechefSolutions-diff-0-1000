import java.util.*;
import java.lang.*;
import java.io.*;

class Expiring_Bread
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int m = scan.nextInt();
		    int k = scan.nextInt();
		    if(m*k>=n)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}
