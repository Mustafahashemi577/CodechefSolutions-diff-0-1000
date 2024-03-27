import java.util.*;
import java.lang.*;
import java.io.*;

class Kitchen_Timetable
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int [] a = new int [n];
		    int [] b = new int [n];
		    for(int i =0;i<n;i++){
		        a[i] = scan.nextInt();
		    }
		    for(int i =0;i<n;i++)
		        b[i]=scan.nextInt();
		    int count = 0;
		    for(int i =0;i<n;i++){
		        if (i==0)
		        {
		            if (a[i]-0>=b[i])
		            count++;
		        }
		        else
		        {
		            if ((a[i]-a[i-1])>=b[i])
		            count++;
		        }
		    }
		    System.out.println(count);
		         
		}

	}
}
