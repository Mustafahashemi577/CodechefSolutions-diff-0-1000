import java.util.*;
import java.lang.*;
import java.io.*;

class Compress_The_Video
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    
		    int a[]= new int [n];
		    if (n==1){
		    int b = scan.nextInt();
		    System.out.println(1);
		    }
		    else{
		        int result = n;
		        for(int i = 0;i<n;i++){
		        a[i]= scan.nextInt();
		        }
		        for(int i =1;i<n;i++)
                    if (a[i-1]==a[i])
                    result--;
		    
		        System.out.println(result);
		}

	}
}
}
