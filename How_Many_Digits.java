How_Many_Digitsimport java.util.*;
import java.lang.*;
import java.io.*;

class How_Many_Digits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int c = 0;
		while(n>0){
		    n/=10;
		    c++;
		}
		if (c==1)
		System.out.println(1);
		else if (c==2)
		System.out.println(2);
		else if (c==3)
		System.out.println(3);
		else 
		System.out.println("More than 3 digits");

	}
}
