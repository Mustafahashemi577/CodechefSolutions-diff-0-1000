import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    if(a%2==0 && b%2==0 && Math.abs(b/2-a/2)==1 || a%2==1 && b%2==1 && Math.abs(b/2-a/2)==1 || Math.abs(a-b)==1 && Math.min(a,b)%2==1)
		        System.out.println("Yes");
		    else    
		        System.out.println("No");
		}

	}
}

