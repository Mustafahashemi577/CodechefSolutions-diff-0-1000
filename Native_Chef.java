import java.util.*;
import java.lang.*;
import java.io.*;

class Native_Chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    double pro_a = 0;
		    double pro_b = 0;
		    int c [] = new int [n];
		    for(int i =0;i<n;i++){
		        c[i]=scan.nextInt();
		        if (c[i]==a)
		        pro_a++;
		        if (c[i]==b)
		        pro_b++;
		    }
		    System.out.println((double)((double)pro_a/n)*((double)pro_b/n));
		    
		}

	}
}
