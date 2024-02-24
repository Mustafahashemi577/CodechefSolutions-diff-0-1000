import java.util.*;
import java.lang.*;
import java.io.*;

class Mutated_Minions
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    int b = 0;
		    int a [] = new int [n];
		    for(int i = 0;i<n;i++){
		        a[i]= scan.nextInt();
		        if((a[i]+k>6)&&((a[i]+k)%7==0))
                    b++;		        
		    }
		    System.out.println(b);
		}

	}
}
