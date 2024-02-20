import java.util.*;
import java.lang.*;
import java.io.*;

class Fill_Candies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    int m = scan.nextInt();
		    if(n<=m*k)
		    System.out.println(1);
		    else if(n%(m*k)==0)
		    System.out.println(n/(m*k));
		    else
		    System.out.println((n/(m*k))+1);
		}

	}
}
