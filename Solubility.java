import java.util.*;
import java.lang.*;
import java.io.*;

class Solubility
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    System.out.println((a+(100-x)*b)*10);
		}

	}
}
