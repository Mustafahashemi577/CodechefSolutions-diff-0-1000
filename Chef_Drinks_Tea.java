import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_Drinks_Tea
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan .nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int z = scan.nextInt();
		    if(x%y==0)
		    System.out.println((x/y)*z);
		    else
		    System.out.println(((x/y)+1)*z);
		}

	}
}
