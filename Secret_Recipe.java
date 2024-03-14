import java.util.*;
import java.lang.*;
import java.io.*;

class Secret_Recipe
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x1 = scan.nextInt();
		    int x2 = scan.nextInt();
		    int x3 = scan.nextInt();
		    int v1 = scan.nextInt();
		    int v2 = scan.nextInt();
		    int b = Math.abs(x1-x3);
		    int c = Math.abs(x2-x3);
		    double d =(double)v1/b;
		    double f = (double)v2/c;
		    if (f>d)
		    System.out.println("Kefa");
		    else if (f<d)
		    System.out.println("Chef");
		    else if (f==d)
		    System.out.println("Draw");
		}

	}
}