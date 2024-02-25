import java.util.Scanner;

public class Cost_Of_Groceries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int v =0;
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextInt();
            }
            for(int j=0;j<n;j++)
            {
                if (a[j]>=x)
                  v+=b[j];    
            }
            System.out.println(v);
        }
        
    }
}
