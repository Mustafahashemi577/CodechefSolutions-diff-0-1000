import java.util.*;
import java.lang.*;
import java.io.*;

class Single_Use_Attack
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int h = scan.nextInt();
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    if ((h-y)%x==0)
		    System.out.println(((h-y)/x)+1);
		    else
		    System.out.println(((h-y)/x)+2);
		}

	}
}
