import java.util.Scanner;

public class Rings7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int a = x*n;
            int b =0;
            while(a>0){
                a=a/10;
                b++;
            }
            if(b==5)
            System.out.println("Yes");
            else
            System.out.println("No");
            
        }
    }
}
