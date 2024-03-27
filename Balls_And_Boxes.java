import java.util.*;
import java.lang.*;
import java.io.*;

class Balls_And_Boxes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    if ((k*(k+1)/2)<=n)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		    
		}

	}
}
