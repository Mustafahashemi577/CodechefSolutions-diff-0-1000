import java.util.*;
import java.lang.*;
import java.io.*;

class The_Last_levels
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x =scan.nextInt();
		    int y = scan.nextInt();
		    int z = scan.nextInt();
		    if(x<=3)
		    System.out.println(x*y);
		    else if(x%3!=0)
		    System.out.println((x*y)+(x/3)*z);
		    else 
		    System.out.println((x*y)+((x/3)-1)*z);
		}

	}
}
