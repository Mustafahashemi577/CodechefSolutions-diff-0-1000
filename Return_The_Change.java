import java.util.*;
import java.lang.*;
import java.io.*;

class Return_The_Change
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int n = x-10*(x/10);
		    if (n<5)
		    System.out.println(100-((x/10)*10));
		    else
		    System.out.println(100-(((x/10)+1)*10));
		}

	}
}
