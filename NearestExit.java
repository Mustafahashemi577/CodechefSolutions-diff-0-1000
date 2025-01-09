import java.util.*;
import java.lang.*;
import java.io.*;

class NearestExit
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int x = scan.nextInt();
            System.out.println(x<=50?"LEFT":"RIGHT");
        }
        
	}
}

