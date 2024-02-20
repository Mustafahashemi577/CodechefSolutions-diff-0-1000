import java.util.*;
import java.lang.*;
import java.io.*;

class Water_Mixing
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            if(a>b)
            {
                if((a-b)<=y)
                 System.out.println("Yes");
                 else
                  System.out.println("No");
            }
            else if (a<b){
                if((b-a)<=x)
                 System.out.println("Yes");
                 else
                  System.out.println("No");
            }else
             System.out.println("Yes");
        }

	}
}
