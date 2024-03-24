import java.util.*;
import java.lang.*;
import java.io.*;

class Chef_And_Cock-off
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		while(n-->0){
		    int a []= new int [5];
		    int sum =0;
		    for (int i =0;i<5;i++){
		        a[i]= scan.nextInt();
		        sum+=a[i];
		    }
		    switch(sum){
		        case 0:{
		            System.out.println("Beginner");
		            break;
		        }
		        case 1:{
		            System.out.println("Junior Developer");
		            break;
		        }
		        case 2:{
		            System.out.println("Middle Developer");
		            break;
		        }
		        case 3:{
		            System.out.println("Senior Developer");
		            break;
		        }
		        case 4:{
		            System.out.println("Hacker");
		            break;
		        }
		        case 5:{
		            System.out.println("Jeff Dean");
		            break;
		        }
		    }
		}

	}
}
