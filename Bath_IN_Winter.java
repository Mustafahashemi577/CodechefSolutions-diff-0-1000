import java.util.*;
import java.lang.*;
import java.io.*;

class Bath_IN_Winter
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    System.out.println(x/(2*y));
		}

	}
}
