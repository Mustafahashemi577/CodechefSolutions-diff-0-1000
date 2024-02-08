import java.util.*;
import java.lang.*;
import java.io.*;

class Exams
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int x = scan.nextInt();
            int y =scan.nextInt();
            int z = scan .nextInt();
            if(z*100/(x*(y+0.0))>50)
            System.out.println("Yes");
            else
            System.out.println("No");
        }

	}
}
