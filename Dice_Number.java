import java.util.*;
import java.lang.*;
import java.io.*;

class Dice_Number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int a1 = scan.nextInt();
		    int a2 = scan.nextInt();
		    int a3 = scan.nextInt();
		    int b1 = scan.nextInt();
		    int b2 = scan.nextInt();
		    int b3 = scan.nextInt();
		    int maxA = maxNumber(a1,a2, a3);
		    int maxb = maxNumber(b1,b2, b3);
		    if(maxA==maxb)
		    System.out.println("Tie");
		    else
		    System.out.println(maxA>maxb ? "Alice" : "Bob");
		    
		}

	}
	public static int maxNumber(int a1, int a2, int a3){
	    int result = 0;
	    result+= Math.max(Math.max(a1,a2),a3)*100;
	    result+= Math.min(Math.min(a1,a2),a3);
	    if (Math.max(Math.max(a1,a2),a3)==a1)
	    result+=Math.max(a3,a2)*10;
	    else if (Math.max(Math.max(a1,a2),a3)==a2)
	    result+=Math.max(a3,a1)*10;
	    else if (Math.max(Math.max(a1,a2),a3)==a3)
	    result+=Math.max(a1,a2)*10;
	    
	    return result;
	}
}
