import java.util.*;
import java.lang.*;
import java.io.*;

class Candy_Distribution 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int m = scan.nextInt();
		    if((n%m==0)&&((n/m)%2==0))
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}

	}
}
