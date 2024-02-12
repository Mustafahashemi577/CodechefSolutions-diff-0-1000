import java.util.*;
import java.lang.*;
import java.io.*;

class High_Accuracy
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan =new Scanner (System.in);
		int t = scan .nextInt();
		while(t-->0){
		    int x = scan .nextInt();
		    int c = 0;
		    if(x==0)
		    System.out.println(0);
		    else{
		    while(c<x){
		        c+=3;
		    }
		    System.out.println(c-x);
		}
		}

	}
}
