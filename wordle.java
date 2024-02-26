import java.util.*;
import java.lang.*;
import java.io.*;

class Wordle
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner (System.in);
	    int t = scan.nextInt();
	    while(t-->0){
	        String s = scan.next();
	        String d = scan.next();
	        String r = "";
	        for(int i =0;i<s.length();i++){
	            if (s.charAt(i)==d.charAt(i))
	            r+='G';
	            else
	            r+='B';
	        }
	        System.out.println(r);
	    }

	}
}
