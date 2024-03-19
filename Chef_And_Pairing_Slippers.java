import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Pairing_Slippers
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int l = scan.nextInt();
            int x = scan.nextInt();
            int r = Math.min(l,n-l);
            System.out.println(x*r);
        }

	}
}
