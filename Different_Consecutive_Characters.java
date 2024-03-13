import java.util.*;
import java.lang.*;
import java.io.*;

class Different_Consecutive_Characters
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    String s = scan.next();
		    int b =0;
		    for(int i =0;i<n-1;i++)
		    if (s.charAt(i)==s.charAt(i+1))
		        b++;
		    System.out.println(b);
		}

	}
}
