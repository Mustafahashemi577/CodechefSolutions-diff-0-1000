import java.util.*;
import java.lang.*;
import java.io.*;

class Pass_the_exam
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    if((a+b+c>=100)&&(a>=10)&&(b>=10)&&(c>=10))
		    System.out.println("PASS");
		    else
		    System.out.println("FAIL");
		}

	}
}