import java.util.Scanner;

public class taskg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k == 1) {
            System.out.println("YES");
        } else if (k >= 4 && k % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }
}
