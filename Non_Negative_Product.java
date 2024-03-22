import java.util.*;
import java.lang.*;
import java.io.*;

class Non_Negative_Product
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a []= new int [n];
		    int negative = 0;
		    boolean zero = false;
		    for(int i=0;i<n;i++){
		        a[i]=scan.nextInt();
		    }
		    Arrays.sort(a);
		    int j =0;
		    for(;j<n;j++){
		        if (a[j]<0)
		            negative++;
		        if (a[j]==0){
		            zero = true;
		            break;
		        }
		    }
		    if (zero)
	        	System.out.println(0);
		    else{
		        if (negative%2!=0)
		            System.out.println(1);
		        else
		            System.out.println(0);
		    }
	
		    
	    }	
	    
	}
}
