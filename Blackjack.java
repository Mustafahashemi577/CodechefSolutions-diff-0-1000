import java.util.*;
import java.lang.*;
import java.io.*;

class Blackjack
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int j = 21-(a+b);
		    if(j<=10)
		    System.out.println(j);
		    else
		    System.out.println(-1);
		}

	}
}
