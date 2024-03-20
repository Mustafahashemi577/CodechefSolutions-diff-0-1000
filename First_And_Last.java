import java.util.*;
import java.lang.*;
import java.io.*;

class First_And_Last
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a[]=new int[n];
		    for(int i =0;i<n;i++)
		    a[i] = scan.nextInt();
		    int sum =a[0]+a[n-1];
		    for(int i =0;i<n-1;i++)
		    if ((a[i]+a[i+1])>sum)
		    sum = a[i]+a[i+1];
		    
		    System.out.println(sum);
		}

	}
}
