import java.util.*;
import java.lang.*;
import java.io.*;

class Joining_Date
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    int result=0;
		    if (n%5!=0)
		    result = (n/5)+1;
		    else
		    result = (n/5);
		    System.out.println(k%5==0 ? result-(k/5) : result-((k/5)+1));
		}

	}
}
