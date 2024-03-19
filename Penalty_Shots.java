import java.util.*;
import java.lang.*;
import java.io.*;

class Penalty_Shots
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a []= new int [10];
		    int score1 = 0;
		    int score2=0;
		    for(int i =0;i<10;i++){
		        a[i]=scan.nextInt();
		        if (i%2==0)
		        score1+=a[i];
		        else 
		        score2+=a[i];
		    }
		    if (score1>score2)
		    System.out.println(1);
		    else if (score2>score1)
		    System.out.println(2);
		    else
		    System.out.println(0);
		}

	}
}
