import java.util.*;
import java.lang.*;
import java.io.*;

class AOrB
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int x = scan.nextInt();
            int y = scan.nextInt();
            int first = (500-(x*2))+(1000-((x+y)*4));
            int second = (1000-(y*4))+(500-((x+y)*2));
            System.out.println(Math.max(first,second));
        }
	}
}

