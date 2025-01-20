import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


class SmallFactorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scan = new Scanner (System.in);
        int t = scan.nextInt();
        while(t-->0){
            int a = scan.nextInt();
            BigInteger b = new BigInteger("1");
            for(int i = 1;i<=a;i++)
                b=b.multiply(BigInteger.valueOf(i));
            System.out.println(b);
        }

	}
}

