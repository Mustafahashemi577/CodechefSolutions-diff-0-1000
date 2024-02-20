import java.util.*;
import java.lang.*;
import java.io.*;

class Online_Or_Offline
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int m = scan.nextInt();
            if((90*n/100.0)<m)
            System.out.println("ONLINE");
            else if ((90*n/100.0)>m)
            System.out.println("DINING");
            else
            System.out.println("EITHER");
            
        }

	}
}
