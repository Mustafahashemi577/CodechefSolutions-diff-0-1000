import java.util.*;
import java.lang.*;
import java.io.*;

class Make_A_B_Equal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    if (a==b)
		    System.out.println("YES");
		    else if(a<b){
	        while(a<b){
	            a=a*2;
	            if(a==b)
	            break;
	        }
	        if (a==b)
	        System.out.println("YES");
	        else 
	        System.out.println("NO");
	        }
	        else{
	             while(a>b){
	            b=b*2;
	            if(a==b)
	            break;
	        }
	        if (a==b)
	        System.out.println("YES");
	        else 
	        System.out.println("NO");
	        }
		}
	}
}