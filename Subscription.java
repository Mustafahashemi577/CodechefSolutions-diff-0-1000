import java.util.*;
import java.lang.*;
import java.io.*;

class Subscriptions
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int x = scan.nextInt();
            int r = n%6;
            if(r==0)
            System.out.println((n/6)*x);
            else
            System.out.println(((n/6)+1)*x);
        }

	}
}
