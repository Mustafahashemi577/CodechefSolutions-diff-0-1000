import java.util.*;
import java.lang.*;
import java.io.*;

class La_Liga
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t-->0){
		    String n []= new String [4];
		    int u []= new int [4];
		    int b = 0;
		    int r = 0;
		    int m =0;
		    int e = 0;
		    for(int i =0;i<4;i++){
		        n[i]=scan.next();
		        u[i]= scan.nextInt();
		        if (n[i].charAt(0)=='B'){
		        b=u[i];
		        }
		        else if (n[i].charAt(0)=='R'){
		        r=u[i];
		        }
		        else if (n[i].charAt(0)=='M'){
		        m=u[i];
		        }
		        else if(n[i].charAt(0)=='E'){  
		        e=u[i];
		        }
		 
		    }
		    if ((b>e)&&(r<m))
		    System.out.println("Barcelona");
		    else 
		    System.out.println("RealMadrid");
		}

	}
}
