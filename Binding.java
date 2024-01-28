import java.util.*;
import java.lang.*;
import java.io.*;

class Binding
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    if ((a>b)&&(a>c))
		    System.out.println("Alice");
		    else if ((b>a)&&(b>c))
		    System.out.println("Bob");
		    else
		    System.out.println("Charlie");
		}

	}
}
