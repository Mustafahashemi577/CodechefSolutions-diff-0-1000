import java.util.*;
import java.lang.*;
import java.io.*;

class Malvika_Is_Peculiar
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String s = scan.next();
		    int a =0 , b = 0;
		    for(int i =0;i<s.length();i++){
		    if (s.charAt(i)=='a')
		        a++;    
		    else
		    b++;
		    }
		    System.out.println(Math.min(a,b));
		}

	}
}
