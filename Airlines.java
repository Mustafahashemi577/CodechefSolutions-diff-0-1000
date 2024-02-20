import java.util.*;
import java.lang.*;
import java.io.*;

class Airlines
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int n = scan.nextInt();
		    if(n<=(x*100))
		    System.out.println(0);
		    else{
		    if(n%100==0)
		    System.out.println((n-(x*100))/100);
		    else
		   System.out.println(((n-(x*100))/100)+1); 
		
		        
		    }
        }
	}
}
