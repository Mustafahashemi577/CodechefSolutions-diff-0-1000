import java.util.*;
import java.lang.*;
import java.io.*;

class Equal_Integers
{
    static int opp(int ma, int mi){
        int c =Math.abs(ma-mi);
        if (c%2==0)
                return (c/2);
                else 
                return ((c/2)+2);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x==y)
            System.out.println(0);
            else if (x<y)
            System.out.println(y-x);
            else if (y<x)
            System.out.println(opp(x,y));
            
        }
        }

	}
