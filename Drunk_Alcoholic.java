import java.util.*;
import java.lang.*;
import java.io.*;

class Drunk_Alcoholic
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int k = scan.nextInt();
		    if (k%2==0)
		    System.out.println(k);
		    else
		    System.out.println(k-1+3);
		}

	}
}
