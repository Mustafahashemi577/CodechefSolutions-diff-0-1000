import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a = n%100;
    	    int b = a%50;
    	    int c = b%10;
    	    int d = c%5;
    	    int e = d%2;
    	    System.out.println((n/100)+(a/50)+(b/10)+(c/5)+(d/2)+e);
		}

	}
}

