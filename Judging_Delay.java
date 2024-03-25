import java.util.*;
import java.lang.*;
import java.io.*;

class Judging_Delay
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    int a []= new int [2*n];
		    int count=0;
		    for (int i =0;i<2*n;i++){
		        a[i]=scan.nextInt();
		    }
		    for(int i =0;i<2*n;i+=2)
		    if ((a[i+1]-a[i])>5)
		    count++;
		    System.out.println(count);
		    
		}

	}
}
