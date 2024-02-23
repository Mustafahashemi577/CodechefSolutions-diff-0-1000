import java.util.*;
import java.lang.*;
import java.io.*;

class Dracula_Eat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    if(n<2)
		    System.out.println("0");
		    else if (n==2)
		    System.out.println("1");
		    else {
		    int d = n-2;
		    System.out.println((d/7)+1);
		        
		    }
		    
		}

	}
}
