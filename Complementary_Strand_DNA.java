import java.util.*;
import java.lang.*;
import java.io.*;

class Complementary_Strand_DNA
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int n = scan.nextInt();
		    String s = scan.next();
		        
		    for(int j = 0;j<n;j++)
		    {
		        int i = s.charAt(j);
		        if(i == 'A')
		        System.out.print('T');
		        else if (i =='T')
		        System.out.print('A');
		        else if (i =='C')
		        System.out.print('G');
		        else if( i =='G')
		        System.out.print('C');
		    }
		    System.out.println();
		    
		}

	}
}