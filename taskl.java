import java.util.Scanner;

public class taskj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int price = a * 100 + b;
        int paid = c * 100 + d;
        int change = paid - price;

        int e = change / 100;
        int f = change % 100;

        System.out.println(e + " " + f);

        scanner.close();
    }
}
