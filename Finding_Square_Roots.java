import java.util.*;
import java.lang.*;
import java.io.*;

class Finding_Square_Roots
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    System.out.println((int)(Math.sqrt(n)));
		}

	}
}
