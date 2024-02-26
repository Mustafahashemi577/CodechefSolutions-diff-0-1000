import java.util.*;
import java.lang.*;
import java.io.*;

class The_Block_Game
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int b = n;
		    int k =n;
		    int f = 0, d=0;
		    long s=0;
		    while(b>=1){
		        b=b/10;
		        f++;
		    }
		   while(k>=1){
		      d = k-10*(k/10);
		      s+=d*Math.pow(10,f-1);
		      k= k/10;
		      f--;
		   }
		   if (s==n)
		   System.out.println("wins");
		   else
		   System.out.println("loses");
		    
		}
		    

	}
}