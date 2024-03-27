import java.util.*;
import java.lang.*;
import java.io.*;

class Cookie_Day
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		    }
		    int min = Integer.MAX_VALUE;
		    for(int i =0;i<n;i++)
		    {
		        if(a[i]>=k){
		        if (a[i] % k < min )
		        min= a[i] %k;
		        }
		    }
		    if(min == Integer.MAX_VALUE)
		    System.out.println(-1);
		    else
		    System.out.println(min);
		}

	}
}
