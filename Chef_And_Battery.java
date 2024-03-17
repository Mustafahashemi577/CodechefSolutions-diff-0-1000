import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Battery
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int d = 0;
		    while ((n>50)||(n<50))
		    {if (n>50)
		    {
		        n-=3;
		        d++;
		    }
		    if (n<50)
		    {
		        n+=2;
		        d++;
		    }
		}
		System.out.println(d);
		}

	}
}