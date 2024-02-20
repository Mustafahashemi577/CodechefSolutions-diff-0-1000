import java.util.*;
import java.lang.*;
import java.io.*;

class Trade_Surplus
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a1 = scan.nextInt();
		    int a2 = scan.nextInt();
		    int b1 = scan.nextInt();
		    int b2 = scan.nextInt();
		    int c1 = (a2-b1)+(b2-a1);
		    int c2 = (a1-b2)+(b1-a2);
		    if(c1>c2)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}

	}
}
