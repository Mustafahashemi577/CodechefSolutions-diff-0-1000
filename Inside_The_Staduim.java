import java.util.*;
import java.lang.*;
import java.io.*;

class Inside_The_Staduim
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a []= new int [n];
		    int d =0;
		    int s = 0;
		    for(int i =0;i<n;i++)
		    {
		        a[i]=scan.nextInt();
		        s+=a[i];
		        if (s/(i+1.0)*100==100)
		        d++;
		    }
		    System.out.println(d);
		}

	}
}
