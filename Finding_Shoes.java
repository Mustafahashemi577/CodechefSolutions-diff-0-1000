import java.util.*;
import java.lang.*;
import java.io.*;

class Finding_Shoes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int m = scan.nextInt();
		    if(n<m)
		    System.out.println(n);
		    else
		    System.out.println(2*n-m);
		}

	}
}
