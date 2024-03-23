import java.util.*;
import java.lang.*;
import java.io.*;

class Rearranging_Digits_To_Get_A_Multiple_Of5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0){
		    int d = scan.nextInt();
		    String s = scan.next();
		    boolean find = false;
		    for(int i =0;i<d;i++){
		        if((s.charAt(i)=='0')||(s.charAt(i)=='5')){
		             find = true;
		             break;
		        }
		    }
		    if (find)
		    System.out.println("YES");
		    else 
		    System.out.println("NO");
		}

	}
}
