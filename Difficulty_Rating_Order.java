import java.util.Scanner;

public class Difficulty_Rating_Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];
            
            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }
            for(int i =0;i<n-1;i++)
            {
                if (d[i]>d[i+1])
                {
                    System.out.println("NO");
                    break;
                }
                if(i==n-2)
                {
                    System.out.println("YES");
                }
            }
        }
    }
}
