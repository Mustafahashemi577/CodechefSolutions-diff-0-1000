import java.util.*;
import java.lang.*;
import java.io.*;

class It_Is_My_Serve
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int p = scan.nextInt();
		    int q = scan.nextInt();
		    int y = p+q;
		    int d = y/2;
		    if(d%2==0)
		    System.out.println("Alice");
		    else
		    System.out.println("Bob");
		}
	}
}
