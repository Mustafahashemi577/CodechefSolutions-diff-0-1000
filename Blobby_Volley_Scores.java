import java.util.Scanner;

public class Blobby_Volley_Scores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            int alice = 0;
            char server = 'A';
            int bob =0;
            
            for(int i =0;i<n;i++){
                if (s.charAt(i)=='A'&&server=='A'){
                alice++;
                }
                else if (s.charAt(i)=='B'&&server=='B'){ 
                bob++;
                }
                if (s.charAt(i)!='A')
                server='B';
                else
                server='A';
            }
            System.out.println(alice +" "+bob);
        }
    }
}
