import java.util.*;
import java.lang.*;
import java.io.*;

class Find_Reminder
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    System.out.println(a%b);
		}

	}
}
