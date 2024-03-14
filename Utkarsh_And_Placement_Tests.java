import java.util.*;
import java.lang.*;
import java.io.*;

class Utkarsh_And_Placement_Tests
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    char a = scan.next().charAt(0);
		    char b = scan.next().charAt(0);
		    char c = scan.next().charAt(0);
		    char d = scan.next().charAt(0);
		    char e = scan.next().charAt(0);
		    if ((a==d)||(a==e))
		    System.out.println(a);
		    else if ((b==d)||(b==e))
		    System.out.println(b);
		    else 
		    System.out.println(c);
        }
	}
}
