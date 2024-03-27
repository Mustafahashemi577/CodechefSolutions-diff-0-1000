import java.util.*;
import java.lang.*;
import java.io.*;

class Keplers_Laws
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int t1 = scan.nextInt();
		    int t2 = scan.nextInt();
		    int r1 = scan.nextInt();
		    int r2 = scan.nextInt();
		    double a =(double)(t1*t1)/(r1*r1*r1);
		    double b = (double)(t2*t2)/(r2*r2*r2);
		    
		    System.out.println(a==b? "Yes" : "No");
		}

	}
}
