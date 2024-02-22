import java.util.*;
import java.lang.*;
import java.io.*;

class Endless_Appetizers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int r = scan.nextInt();
		    int d =r/30;
		    int p =(x+d)/y;
		        if((x+d)%y==0)
		        System.out.println(p);
		        else
		        System.out.println(p+1);
		    
		}

	}
}
