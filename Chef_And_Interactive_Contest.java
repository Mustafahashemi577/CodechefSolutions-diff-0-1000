import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Interactive_Contest
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int t = scan.nextInt();
		while(n-->0){
		    int r = scan.nextInt();
		    if (r<t)
		    System.out.println("Bad boi");
		    else 
		    System.out.println("Good boi");
		}
		

	}
}
