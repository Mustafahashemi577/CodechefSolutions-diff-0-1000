import java.util.*;
import java.lang.*;
import java.io.*;

class World_Chess_Championship
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		int x = scan.nextInt();
		String s = scan.next();
		int carlsen = 0;
		int chef =0;
	    for(int i =0;i<14;i++){
	    if (s.charAt(i)=='C')
	    carlsen+=2;
	    else if (s.charAt(i)=='N')
	    chef+=2;
	    else
	    {
	        carlsen++;
	        chef++;
	    }
	    }
	    if (chef==carlsen)
	    System.out.println(55*x);
	    else 
        {
            if (carlsen>chef)
            System.out.println(60*x);
            else 
            System.out.println(40*x);
        }
	    }
	}
}
