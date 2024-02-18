import java.util.*;
import java.lang.*;
import java.io.*;

class Chess_Rating
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int z = 0;
		    while(x<y){
		        x+=8;
		        z++;
		    }
		    System.out.println(z);
		}

	}
}
