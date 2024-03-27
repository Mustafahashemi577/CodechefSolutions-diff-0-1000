import java.util.*;
import java.lang.*;
import java.io.*;

class Chess_Match
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            
            int c = 2*(180+n);
            System.out.println(c-(a+b));
        }

	}
}
