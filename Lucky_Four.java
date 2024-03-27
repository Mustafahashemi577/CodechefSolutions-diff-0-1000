import java.util.*;
import java.lang.*;
import java.io.*;

class Lucky_Four
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan =  new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int count=0;
		    while(n>0){
		        if ((n-10*(n/10))==4)
		        count++;
		        n=n/10;
		    }
		    System.out.println(count);
		}

	}
}
