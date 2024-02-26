import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_His_Fruit_Stand
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int p = x/2;
		    System.out.println(Math.min(p,y));
		}

	}
}
