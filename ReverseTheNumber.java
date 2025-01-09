import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseTheNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String s = scan.next();
		    String a="";
		    for(int i = s.length()-1;i>=0;i--){
		        a+=s.substring(i,i+1);
		    }
		    while(a.substring(0,1).equals("0")){
		        a=a.substring(1,a.length());
		    }
		    System.out.println(a);
		}

	}
}

