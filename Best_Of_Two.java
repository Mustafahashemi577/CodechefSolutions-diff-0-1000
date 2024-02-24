import java.util.*;
import java.lang.*;
import java.io.*;

class Best_Of_Two
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int a []= new int [3];
	        int c []= new int [3];
	        for(int i = 0;i<3;i++)
	        a [i]= scan.nextInt();
	        for(int i = 0;i<3;i++)
	        c[i]= scan.nextInt();
	        Arrays.sort(a);
	        Arrays.sort(c);
	        int d = a[2]+a[1];
	        int b = c[2]+c[1];
	        if (d==b)
	        System.out.println("Tie");
	        else if (d<b)
	        System.out.println("Bob");
	        else
	        System.out.println("Alice");
	    }

	}
}
