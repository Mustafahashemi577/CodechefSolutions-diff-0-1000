import java.util.*;
import java.lang.*;
import java.io.*;

class Mileage_Matters
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    double p = ((float)n/a)*x;
		    double d = ((float)n/b)*y;
		    if (p<d)
		    System.out.println("PETROL");
		    else if (d<p)
		    System.out.println("DIESEL");
		    else
		    System.out.println("ANY");
		}

	}
}
