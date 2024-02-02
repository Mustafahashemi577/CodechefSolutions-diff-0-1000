import java.util.Scanner;

public class Candy_Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if(x>=y)
            System.out.println(y);
            else
            System.out.println((y-x)*2+x);
        }
    }
}
