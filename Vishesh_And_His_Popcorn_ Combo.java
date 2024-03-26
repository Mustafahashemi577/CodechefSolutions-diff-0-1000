import java.util.*;
import java.lang.*;
import java.io.*;

class Vishesh_And_His_Popcorn_ Combo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a [] = new int [6];
		    for(int i =0;i<6;i++){
		        a[i]=scan.nextInt();
		    }
		    int max = 0;
		    for(int i=0;i<6;i+=2)
		    if (a[i]+a[i+1]>max)
		    max = a[i]+a[i+1];
		    
		    System.out.println(max);
		}

	}
}
