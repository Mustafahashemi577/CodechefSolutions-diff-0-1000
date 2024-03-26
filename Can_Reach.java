import java.util.*;
import java.lang.*;
import java.io.*;

class Can_Reach
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int k = scan.nextInt();
		    if (y%k==0 && x%k==0)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}
