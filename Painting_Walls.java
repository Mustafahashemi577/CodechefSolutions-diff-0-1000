import java.util.*;
import java.lang.*;
import java.io.*;

class Painting_Walls
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        int x = scan .nextInt();
	        int y = scan .nextInt();
	        int z = scan.nextInt();
	        System.out.println(z/((x*y)*2));
	    }

	}
}
