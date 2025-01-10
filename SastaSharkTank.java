import java.util.*;
import java.lang.*;
import java.io.*;
class SastaSharkTank
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a=scan.nextInt();
		    int b=scan.nextInt();
		    if(10*a>5*b){
		        System.out.println("FIRST");
		    } if(5*b>10*a){
		    System.out.println("SECOND");
		    }if(10*a==5*b){
		    System.out.println("ANY");
		    }
	    }
    }
}

