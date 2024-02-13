import java.util.*;
import java.lang.*;
import java.io.*;

class Reverse_The_Number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan .nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int s=0;
		    int m =0;
		    int d=n;
		    while(d>0){
		        d=d/10;
		        s++;
		    }
		    int a [] = new int [s];
		    for(int i=0;n>0;i++){
		        a[i]=n-10*(n/10);
		        n=n/10;
	        }
	        for(int j =0;j<s;j++){
	            int h = s-(j+1);
	            int p =1;
	            while(h>0){
	               p=p*10;
	               h--;
	            }
	            m=p*a[j]+m;
	        }
	        System.out.println(m);
	}
}
}