import java.util.*;
import java.lang.*;
import java.io.*;

class Minimum_Number_Of_Flips
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a []= new int [n];
		    int c=0;
		    int d = 0;
		    for(int i=0;i<n;i++){
		        a[i]=scan.nextInt();
		        if (a[i]==1)
		        c++;
		        else
		        d++;
		    }
		    if(n%2!=0)
		     System.out.println(-1);
		     else if (d==c)
		      System.out.println(0);
		      else {
		     if(c<d)
		      System.out.println((n/2)-c);
		     else
		     System.out.println((n/2)-d);
		     }
		}

	}
}
