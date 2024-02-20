import java.util.*;
import java.lang.*;
import java.io.*;

class X_Jump
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    if(x%y==0)
		    System.out.println(x/y);
		    else
		    System.out.println((x/y)+x%y);
		}

	}
}
