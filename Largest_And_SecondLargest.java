import java.util.*;

public class Largest_And_SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int max =0;
            int max2 =0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            for(int i =n-1;i>=1;i--){
                if (a[i]!=a[i-1])
                {
                    System.out.println(a[i]+a[i-1]);
                    break;
                }
            }
        }
    }
}
