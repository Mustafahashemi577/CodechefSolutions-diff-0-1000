import java.util.*;
import java.lang.*;
import java.io.*;

class Counting_pretty_Numbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int l = scan.nextInt();
		    int r = scan.nextInt();
		    int s =0;
		    int d =0;
		    for(int i =l;i<=r;i++)
		    {
		        d = i-10*(i/10);
		        if ((d==2)||(d==3)||(d==9))
		        s++;
		    }
		    System.out.println(s);
		}

	}
}
