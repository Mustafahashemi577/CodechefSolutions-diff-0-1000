import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_and_NextGen
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int x = scan .nextInt();
		    int y = scan.nextInt();
		    if((a*b)<=(x*y))
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}
