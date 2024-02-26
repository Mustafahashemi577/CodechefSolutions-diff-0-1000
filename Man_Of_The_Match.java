import java.util.*;
import java.lang.*;
import java.io.*;

class Man_Of_The_Match
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
        while(t-->0){
            int max =0;
            int r =-1;
            int a [] = new int [44];
            for (int i = 0;i<44;i++)
                a[i]= scan.nextInt();
                
            for(int i =0;i<44;i+=2)
                if (max<a[i]+20*a[i+1])
                { max =a[i]+20*a[i+1];
                r = i;
                }
            System.out.println((r/2)+1);
            
        }		

	}
}
