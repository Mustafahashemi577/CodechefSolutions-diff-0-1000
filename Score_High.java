import java.util.*;
import java.lang.*;
import java.io.*;

class Score_High
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a []= new int [4];
		    for(int i =0;i<4;i++)
		        a[i]=scan.nextInt();
		    Arrays.sort(a);
		    System.out.println(a[3]);
		    
		}

	}
}
