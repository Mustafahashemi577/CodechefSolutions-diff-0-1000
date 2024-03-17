import java.util.*;
import java.lang.*;
import java.io.*;

class Avoid_Contact
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int a = Math.abs(x-y);
		    if (x==y)
		    System.out.println(2*y-1);
		    else
		    System.out.println(2*y+a);
		}

	}
}
