import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_Judges_A_Competition
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a [] = new int [n];
		    int b [] = new int [n];
		    int result_a=0, result_b=0;
		    for(int i =0;i<n;i++)
		    {
		        a[i]= scan.nextInt();
		        result_a +=a[i]; 
		    }
		    for(int i =0;i<n;i++)
		    {
		        b[i]=scan.nextInt();
		        result_b += b[i];
		    }
		    Arrays.sort(a);
		    Arrays.sort(b);
		    result_b -= b[n-1];
		    result_a -= a[n-1];
		    if (result_a == result_b)
		    System.out.println("Draw");
		    else
		    System.out.println(result_a>result_b ? "Bob" : "Alice");
		    
		}

	}
}
