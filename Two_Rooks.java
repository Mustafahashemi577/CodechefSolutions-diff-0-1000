import java.util.*;
import java.lang.*;
import java.io.*;

class Two_Rooks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x1 = scan.nextInt();
		    int y1 = scan.nextInt();
		    int x2 = scan.nextInt();
		    int y2 = scan.nextInt();
		    if (x1==x2||y1==y2)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}
