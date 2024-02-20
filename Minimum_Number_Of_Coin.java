import java.util.*;
import java.lang.*;
import java.io.*;

class Minimum_Number_Of_Coin
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int x = scan.nextInt();
	        if(x%5!=0)
	        System.out.println(-1);
	        else
	        System.out.println((x/10)+(x%10)/5);
	    }

	}
}
