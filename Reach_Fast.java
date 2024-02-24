import java.util.*;
import java.lang.*;
import java.io.*;

class Reach_Fast
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int k = scan.nextInt();
		    int d = Math.abs(y-x);
		    if (d%k==0)
		    System.out.println(d/k);
		    else
		    System.out.println((d/k)+1);
		}

	}
}
