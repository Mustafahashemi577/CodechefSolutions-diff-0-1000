import java.util.*;
import java.lang.*;
import java.io.*;

class Economics_Class
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int s [] = new int [n];
		    int d []= new int [n];
		    for(int i = 0;i<n;i++)
		    s[i]= scan.nextInt();
		    for(int i =0;i<n;i++)
		    d[i]= scan.nextInt();
		    int count = 0;
		    for(int j =0;j<n;j++)
		    if(s[j]==d[j])
		    count++;
		    System.out.println(count);
		}

	}
}
