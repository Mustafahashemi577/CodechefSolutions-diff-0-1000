import java.util.*;
import java.lang.*;
import java.io.*;

class Degree_Of_Polynomial
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int n = scan.nextInt();
	        int a []= new int [n];
	        for(int i =0;i<n;i++)
	        a[i]= scan.nextInt();
	        int p = n-1;
	        while(p>=0){
	            if(a[p]!=0){
	            System.out.println(p);
	            break;
	            }
	            else
	            p--;
	        }
	    }

	}
}
