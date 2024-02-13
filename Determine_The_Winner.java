import java.util.*;
import java.lang.*;
import java.io.*;

class Determine_The_Winner
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int pa= scan.nextInt();
		    int pb = scan.nextInt();
		    int qa = scan.nextInt();
		    int qb = scan.nextInt();
		    int mp = Math.max(pa,pb);
		    int mq = Math.max(qa,qb);
		    if(mp>mq)
		    System.out.println("Q");
		    if (mp<mq)
		    System.out.println("P");
		    if(mp==mq)
		    System.out.println("TIE");
		}
		

	}
}