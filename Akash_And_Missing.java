import java.util.*;
import java.lang.*;
import java.io.*;

class Akash_And_Missing
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t =scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    if (n%7==6)
		    System.out.println((n/7)+1);
		    else 
		    System.out.println(n/7);
		}

	}
}
