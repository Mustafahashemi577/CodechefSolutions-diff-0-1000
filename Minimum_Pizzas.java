import java.util.*;
import java.lang.*;
import java.io.*;

class Minimum_Pizzas
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n= scan.nextInt();
		    int x = scan.nextInt();
		    int b = x*n;
		    int c = b%4;
		    if(c==0)
		    System.out.println(b/4);
		    else
		    System.out.println((b/4)+1);
		}

	}
}
