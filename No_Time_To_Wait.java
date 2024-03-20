import java.util.*;
import java.lang.*;
import java.io.*;

class No_Time_To_Wait
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int h = scan.nextInt();
		int x = scan.nextInt();
		boolean find = false;
		int a[]= new int [n];
		
		for(int i =0;i<n;i++)
		{
		    a[i]=scan.nextInt();
		    if (a[i]>=x)
		    find = true;
		}
		if (find)
		System.out.println("YES");
		else 
		System.out.println("NO");
	}
}
