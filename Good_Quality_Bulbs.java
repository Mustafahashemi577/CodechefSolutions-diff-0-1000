import java.util.*;
import java.lang.*;
import java.io.*;

class Good_Quality_Bulbs
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int n = scan.nextInt();
	        int x = scan.nextInt();
	        int a [] = new int [n-1];
	        int p=0;
	        for(int i =0;i<n-1;i++)
	        {
	            a[i]=scan.nextInt();
	            p+=a[i];
	        }
	        if(p/n>=x)
	        System.out.println(0);
	        else
	        System.out.println(x*n-p);
	    }
	}
}
