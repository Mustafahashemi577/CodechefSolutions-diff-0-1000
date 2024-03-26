import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Lockout_Draws
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    if (a+b==c || a+c==b || c+b==a)
		    System.out.println("YES");
		    else 
		    System.out.println("NO");
		}

	}
}
