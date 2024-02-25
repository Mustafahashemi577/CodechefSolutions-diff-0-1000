import java.util.*;
import java.lang.*;
import java.io.*;

class Recent_Contest_Problems
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int l =0;
		    int a = 0;
		    for(int i = 0;i<n;i++){
		    String s = scan.next();
		    if (s.equals("START38"))
		    a++;
		    else if (s.equals("LTIME108"))
		    l++;
		    }
		    System.out.println(a+" "+l);
		}

	}
}
