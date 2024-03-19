import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Price_Control
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    int a []= new int [n];
		    int lossRevenue =0;
		    for (int i =0;i<n;i++)
		    {
		        a[i]=scan.nextInt();
		        if (a[i]>k)
		        lossRevenue+=(a[i]-k);
		        
		    }
		    System.out.println(lossRevenue);
		}

	}
}
