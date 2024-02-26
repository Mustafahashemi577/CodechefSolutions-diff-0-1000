import java.util.*;
import java.lang.*;
import java.io.*;

class Gross_Salary
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    if (x<1500)
		    System.out.println(2.00*x);
		    else
		    System.out.println(x+500.0+(98.00*x/100));
		    
		}

	}
}
