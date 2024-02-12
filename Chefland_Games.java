import java.util.*;
import java.lang.*;
import java.io.*;

class Chefland_Games
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a [] = new int [4];
		    int s =0;
		    for(int i=0;i<4;i++){
		        a[i]= scan.nextInt();
		        s+=a[i];
		    }
		    if(s==0)
		    System.out.println("IN");
		    else
		    System.out.println("OUT");
		}

	}
}
