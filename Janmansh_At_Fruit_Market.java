import java.util.*;
import java.lang.*;
import java.io.*;

class Janmansh_At_Fruit_Market
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    int min = Math.min(c,(Math.min(a, b)));
		    if (min == a)
		    System.out.println((x-1)*a+Math.min(b,c));
		    else if (min == b)
		    System.out.println((x-1)*b+Math.min(a,c));
		    else
		    System.out.println((x-1)*c+Math.min(b,a));
		}

	}
}
