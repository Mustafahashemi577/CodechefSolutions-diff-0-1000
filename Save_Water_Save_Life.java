import java.util.*;
import java.lang.*;
import java.io.*;

class Save_Water_Save_Life
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int h = scan.nextInt();
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int c = scan.nextInt();
		    if ((x+(y/2))*h<=c)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}
