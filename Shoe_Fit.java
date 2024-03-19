import java.util.*;
import java.lang.*;
import java.io.*;

class Shoe_Fit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    if((a!=b)||(a!=c))
		    System.out.println(1);
		    else 
		    System.out.println(0);
		}

	}
}
