import java.util.*;
import java.lang.*;
import java.io.*;

class Game_Between_Friends
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int a = scan.nextInt();
	        int b = scan.nextInt();
	        int c = scan.nextInt();
	        int d = scan.nextInt();
	        if (b<=a)
	        b+=c;
	        else
	        a+=c;
	        if (b<=a)
	        b+=d;
	        else
	        a+=d;
	        System.out.println(a>=b? 'N': 'S');
	    }

	}
}
