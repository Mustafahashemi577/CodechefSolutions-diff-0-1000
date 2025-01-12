import java.util.*;
import java.lang.*;
import java.io.*;

class QualifyTheRound
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int x = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(a*1+b*2>=x)
                System.out.println("Qualify");
            else
                System.out.println("NotQualify");
        }
        
	}
}

