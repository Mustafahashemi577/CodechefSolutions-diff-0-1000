import java.util.*;
import java.lang.*;
import java.io.*;

class Divisible_BY_3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int count =0;
		    while(a!=0 && b!=0){
		    if (a%3==0 || b%3==0){
		    System.out.println(count);
		    break;
		    }
            a = a-b;
            count++;
		}
		if (a==0 || b==0)
		System.out.println(count);

	}
}

}