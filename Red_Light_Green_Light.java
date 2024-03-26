import java.util.*;
import java.lang.*;
import java.io.*;

class Red_Light_Green_Light
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    int a [] = new int [n];
		    int result = 0;
		    for (int i =0;i<n;i++)
		    {
		        a[i]=scan.nextInt();
		        if (a[i]>k)
		        result++;
		    }
		    System.out.println(result);
		}

	}
}
