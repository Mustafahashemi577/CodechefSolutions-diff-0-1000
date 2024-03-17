import java.util.*;
import java.lang.*;
import java.io.*;

class Count_The_Holidays
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a []= new int [n];
		    int b=0;
		    int holyday = 8; 
		    for(int i = 0;i<n;i++){
		        a[i]=scan.nextInt();
		        if ((a[i]%7==0)||((a[i]+1)%7==0))
		        b++;
		        else
		        holyday++;
		        
		    }
		    System.out.println(holyday);
		}

	}
}
