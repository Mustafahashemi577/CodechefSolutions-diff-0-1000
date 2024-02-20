import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_Even
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(n<=1)
            System.out.println(b);
            else{
            int c = n/2;
            if(n%2==0)
            System.out.println((c*a)+(c*b));
            else
            System.out.println(((c+1)*b)+(c*a));
            }
        }
	}
}
